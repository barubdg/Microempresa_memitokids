# Desarrollo de un sistema para la gestión y control de reportes para la Microempresa de Eventos Infantiles “Memito Kids”
---
# Tabla de Contenido
---
## Autores
- [Autores](#autores-del-proyecto)

## Aspectos Generales
- [Descripción de la empresa](#descripción-de-la-empresa)
- [Descripción del proyecto](#descripción-del-proyecto)

## Capítulo 1: Descripción de la Empresa
- [Problema, Objetivos y Alcance](#problema-objetivos-y-alcance)
- [Diagrama de procesos y Organigrama](#diagrama-de-procesos-y-organigrama)
- [Misión, Visión y Objetivos Estratégicos](#misi%C3%B3n-visi%C3%B3n-y-objetivos-estrat%C3%A9gicos)

## Capítulo 2: Estado del Arte y Marco Teórico
Breve resumen del estado del arte y marco teórico.

## Capítulo 3: Alcance
- [Requerimientos funcionales y no funcionales](#requerimientos-funcionales-y-no-funcionales)
- [Restricciones](#restricciones)
- [Diagrama de clases](#diagrama-de-clases)
- [Prototipos o interfaces](#prototipos-o-interfaces)

## Capítulo 4: Diseño de la Aplicación
- [Funcionalidades implementadas](#funcionalidades-implementadas)
- [Estructura de paquetes y Clases utilizadas](#estructura-de-paquetes-y-clases-utilizadas)
- [Código fuente y Herramientas digitales](#c%C3%B3digo-fuente-y-herramientas-digitales)
- [Comparativo entre países, Contrato y Fichas formularios](#comparativo-entre-pa%C3%ADses-contrato-y-fichas-formularios)

## Capítulo 5: Conclusiones y Recomendaciones
- [Conclusiones y Recomendaciones](#conclusiones-y-recomendaciones)

## Bibliografía y Anexos
- Lista de fuentes utilizadas en la investigación.
- Enlaces a documentos adicionales o anexos.

## Autores del Proyecto

**Baruch Benjamin Dámazo Gálvez / Desarrollador UI/UX y Programador Java:**
- Diseño y desarrollo de las interfaces de usuario (UI/UX) del software.
- Programación en Java desde cero para implementar la lógica del programa.
- Responsable de la experiencia del usuario y la interfaz visual del software.

**Enrique Alexis Coronel Castillo / Especialista en Base de Datos:**
- Elección y implementación de la base de datos utilizando MySQL Workbench.
- Diseño y optimización de la estructura de la base de datos para el almacenamiento eficiente de la información.
- Aseguramiento de la integridad y seguridad de los datos en el sistema.

**Guillermo Antonio Manrique Verme / Dueño y Procesos BPMN:**
- Propietario de la microempresa Memito Kids.
- Realización de los procesos BPMN para modelar y documentar los procesos de la microempresa.
- Aporte en la definición de requisitos y validación de la funcionalidad del software según las necesidades de la empresa.

**Oliver Ronaldo Timana Pupuche / Organización y Gestión del Proyecto:**
- Organización y gestión general del proyecto utilizando la herramienta Asana.
- Coordinación entre los miembros del equipo para asegurar la ejecución eficiente de las tareas.
- Responsable de la documentación del proyecto, garantizando que esté completa y accesible para futuras referencias.

## Descripción de la empresa
Fundada el 17 de diciembre de 2022, nuestra empresa se especializa en la realización de eventos infantiles. Destacamos entre la competencia gracias a nuestra amplia gama de paquetes y un servicio completo que garantiza momentos inolvidables para los más pequeños.

## Descripción del proyecto
La solución elegida es el desarrollo de un software de escritorio personalizado para la empresa de Eventos Infantiles. Este software integrará todas las funciones necesarias para la gestión de eventos, incluyendo la facturación, contratación, coordinación de trabajadores y generación de informes. Además, se implementarán medidas de seguridad sólidas para proteger la información confidencial. La inversión en esta solución tecnológica permitirá a la empresa mejorar la eficiencia operativa, reducir los errores y crear una base sólida para el crecimiento futuro.

## Capítulo 1: Descripción de la Empresa

### Problema, Objetivos y Alcance
#### 1. Problema:
La empresa de Eventos Infantiles enfrenta un gran desafío crítico de un sistema de gestión y control de reportes de los eventos, clientes, etc., lo que resulta en una coordinación ineficiente a través de chats en las plataformas de Messenger y WhatsApp para cerrar contratos con los clientes y coordinar con los trabajadores la disponibilidad. Este proceso manual conlleva riesgos de errores, falta de seguridad en la gestión de datos personales, dificultades en la generación de reportes y limitaciones para escalar.

#### 2. Posibles Objetivos de Solución:
Para abordar la gestión y control de reportes para la Microempresa de Eventos Infantiles “Memito Kids”, existen algunas soluciones generales que podrían ser útiles:

●	**Base de Datos:** Utilizar una base de datos para almacenar información relevante, como Empleados, detalles del evento y registros de clientes. Se Puede utilizar tecnologías como MySQL, PostgreSQL o SQLite con Java para gestionar los datos de manera eficiente.

●	**Interfaz Gráfica de Usuario (GUI):** Desarrollar una interfaz de usuario amigable para que los administradores puedan ingresar datos de ventas y gestionar el personal. Se Puede utilizar bibliotecas como Swing o JavaFX para crear interfaces atractivas y funcionales.

●	**Seguimiento de Ventas:** Implementar un sistema de seguimiento de ventas que registra información como fecha, producto vendido, cantidad, precio, etc. Esto permitirá llevar un control detallado de las transacciones.

●	**Gestión de Personal:** Crear una sección para administrar el personal, donde se puede agregar, editar y eliminar empleados. Registra datos como nombre, contacto, fecha de inicio, etc.

●	**Registro de Clientes:** Aunque la empresa no tiene un registro de clientes antiguos, sería beneficioso comenzar a mantener un registro. Se puede permitir a los clientes que se registren en la plataforma y asocien sus compras anteriores.

●	**Reportes y Análisis:** Agregar capacidades de generación de informes para analizar las ventas, los tiempos de trabajo y otros datos relevantes. Esto ayudará a la toma de decisiones.

●	**Seguridad:** Proteger los datos confidenciales, como la información del personal y los detalles de los clientes, mediante el uso de medidas de seguridad apropiadas.

●	**Mantenimiento y Actualizaciones:** Planificar un proceso de mantenimiento regular y actualizaciones para mejorar la funcionalidad y corregir errores.

●	**Capacitación y Soporte:** Proporcionar capacitación a los administradores para utilizar eficazmente la aplicación y ofrece soporte técnico en caso de problemas.

#### 3. Alcance de la Solución Tecnológica (Gantt):
<img align="center" src="img_tablacontenido/Alcance de la solución tecnologica.png" alt="Imagen" height="500"/>

### Diagrama de procesos y Organigrama
#### 1. Diagrama de procesos (BPMN):
##### Proceso de reserva:




### Misión, Visión y Objetivos Estratégicos
Contenido de la sección "Misión, Visión y Objetivos Estratégicos".

