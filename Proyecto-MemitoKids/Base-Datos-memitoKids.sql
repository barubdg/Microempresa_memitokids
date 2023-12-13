-- Crear la base de datos
CREATE DATABASE memfinal;
-- Usar la base de datos
USE memfinal;

-- Crear la tabla USUARIOS
CREATE TABLE USUARIOS (
    usuario_id INT PRIMARY KEY AUTO_INCREMENT,
    correo VARCHAR(255),
    contraseña VARCHAR(100)
);

-- Crear la tabla ROLES
CREATE TABLE ROLES (
    rol_id INT PRIMARY KEY AUTO_INCREMENT,
    nombre_rol VARCHAR(255),
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES USUARIOS(usuario_id) on delete cascade
);

-- Crear la tabla CLIENTES
CREATE TABLE CLIENTES (
    cliente_id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(30),
    apellido VARCHAR(30),
     dni VARCHAR(8),
    direccion VARCHAR(255),
    telefono VARCHAR(9)  
);

-- Crear la tabla PAQUETES
CREATE TABLE PAQUETES (
    paquete_id INT PRIMARY KEY AUTO_INCREMENT,
    nombre_paquete VARCHAR(255),
    descripcion VARCHAR(255),
    precio DECIMAL(10, 2)
);

-- Crear la tabla UBICACION
CREATE TABLE UBICACION (
    ubicacion_id INT PRIMARY KEY AUTO_INCREMENT,
    nombre_ubicacion VARCHAR(30),
    direccion VARCHAR(255)
);

-- Crear la tabla EVENTO
CREATE TABLE EVENTO (
    evento_id INT PRIMARY KEY AUTO_INCREMENT,
    nombre_evento VARCHAR(255),
    ubicacion_id INT,
    cliente_id INT,
    FOREIGN KEY (ubicacion_id) REFERENCES UBICACION(ubicacion_id) on delete cascade,
    FOREIGN KEY (cliente_id) REFERENCES CLIENTES(cliente_id) on delete cascade
);

-- Crear la tabla RESERVA
CREATE TABLE RESERVA (
    reserva_id INT PRIMARY KEY AUTO_INCREMENT,
    paquete_id INT,
    evento_id INT,
    fecha_reserva DATE,
    FOREIGN KEY (paquete_id) REFERENCES PAQUETES(paquete_id) on delete cascade,
    FOREIGN KEY (evento_id) REFERENCES EVENTO(evento_id) on delete cascade
);

-- Crear la tabla PRESUPUESTO EVENTO
CREATE TABLE PRESUPUESTO_EVENTO (
    presupuesto_id INT PRIMARY KEY AUTO_INCREMENT,
    evento_id INT,
    precio DECIMAL(10,2), 
    FOREIGN KEY (evento_id) REFERENCES EVENTO(evento_id) on delete cascade
);

-- Crear la tabla MOVILIDAD
CREATE TABLE MOVILIDAD (
    movilidad_id INT PRIMARY KEY AUTO_INCREMENT,
    evento_id INT,
    descripcion VARCHAR(255),
    costo DECIMAL(10, 2),
    FOREIGN KEY (evento_id) REFERENCES EVENTO(evento_id) on delete cascade
);

-- Crear la tabla FACTURA
CREATE TABLE FACTURA (
    factura_id INT PRIMARY KEY AUTO_INCREMENT,
    evento_id INT,
    descripcion VARCHAR(255),
    costoTotal DECIMAL (10,2),
    FOREIGN KEY (evento_id) REFERENCES EVENTO(evento_id) on delete cascade
);

-- Crear la tabla EMPLEADOS
CREATE TABLE EMPLEADOS (
    empleado_id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(30),
    apellido VARCHAR(30),
    dni VARCHAR(8),
    fechaNacimiento DATE,
    direccion VARCHAR(255),
    email VARCHAR(255),
    celular VARCHAR(9),
    rol_id INT,
    FOREIGN KEY (rol_id) REFERENCES ROLES(rol_id) on delete cascade
);

-- Crear la tabla EQUIPOS DE ORGANIZACIÓN
CREATE TABLE EQUIPOS_DE_ORGANIZACION (
    equipo_id INT PRIMARY KEY AUTO_INCREMENT,
    nombre_equipo VARCHAR(255)
);

-- Crear la tabla ASISTENCIA
CREATE TABLE ASISTENCIA (
    asistencia_id INT PRIMARY KEY AUTO_INCREMENT,
    evento_id INT,
    empleado_id INT,
    equipo_id INT,
    FOREIGN KEY (evento_id) REFERENCES EVENTO(evento_id) on delete cascade,
    FOREIGN KEY (empleado_id) REFERENCES EMPLEADOS(empleado_id) on delete cascade,
    FOREIGN KEY (equipo_id) REFERENCES EQUIPOS_DE_ORGANIZACION(equipo_id) on delete cascade
);

-- Crear la tabla PARTICIPANTES
CREATE TABLE PARTICIPANTES (
    participante_id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    equipo_id INT,
    FOREIGN KEY (equipo_id) REFERENCES EQUIPOS_DE_ORGANIZACION(equipo_id) on delete cascade
);

-- Crear la tabla HISTORIAL
CREATE TABLE HISTORIAL (
    historial_id INT PRIMARY KEY AUTO_INCREMENT,
    factura_id INT,
    descripcion VARCHAR(255),
    FOREIGN KEY (factura_id) REFERENCES FACTURA(factura_id) on delete cascade
);

CREATE TABLE CALENDARIZACION (
    calendarizacion_id INT PRIMARY KEY AUTO_INCREMENT,
    evento_id INT,
    fecha DATE,
    hora_inicio TIME,
    hora_fin TIME,
    FOREIGN KEY (evento_id) REFERENCES EVENTO(evento_id) on delete cascade
);

CREATE TABLE ESPECIALIZACIONES (
    especializacion_id INT PRIMARY KEY AUTO_INCREMENT,
    evento_id INT,
    edad_minima INT,
    edad_maxima INT,
    FOREIGN KEY (evento_id) REFERENCES EVENTO(evento_id) on delete cascade
);