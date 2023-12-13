package Design_controls;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class CustomScrollBarUI extends BasicScrollBarUI {

    private final Color thumbColor = new Color(250, 162, 0); // Color de la barra en RGB
    private final Color trackColor = new Color(255, 255, 255); // Color del track donde se desplaza la barra
    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        g.setColor(thumbColor);
        g.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);
    } 
    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        g.setColor(trackColor); // Establecer el color a transparente
        g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
    }
//SIRVE PARA QUITAR LAS FLECHAS ---------------------------------------------------------------------------------------------------------------
        @Override
        protected JButton createDecreaseButton(int orientation) {
            JButton decreaseButton = new JButton(getAppropriateIcon(orientation)){
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(0, 0);
                }
            };
            return decreaseButton;
        }
        
        @Override
        protected JButton createIncreaseButton(int orientation) {
            JButton increaseButton = new JButton(getAppropriateIcon(orientation)){
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(0, 0);
                }
            };
            return increaseButton;
        }

        private ImageIcon getAppropriateIcon(int orientation){
            switch(orientation){
                case SwingConstants.SOUTH: {
                    ImageIcon downArrow = null;
                    return downArrow;
                }

                case SwingConstants.NORTH: {
                    ImageIcon upArrow = null;
                    return upArrow;
                }

                case SwingConstants.EAST: {
                    ImageIcon rightArrow = null;
                    return rightArrow;
                }

                    default: {
                    ImageIcon leftArrow = null;
                    return leftArrow;
                }

            }
}
//---------------------------------------------------------------SIRVE PARA QUITAR LAS FLECHAS       
}

