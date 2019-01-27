/**
 * Samuel Harkness
 * Used to create lines
 * Out-lab #5
 * 160 - 07
 * 11-1-05
 */
package ECOne;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanelTwo extends JPanel
{
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        
        int width = getWidth();
        int height = getHeight();
        int x = width, y = 0;
        
        while( x >= 0 )
        {
            g.drawLine( 0, 0, width - x, height - y );
            g.drawLine( 0, height, width - x, y );
            g.drawLine( width, 0, x, height - y );
            g.drawLine( width, height, width - x, height - y );
            x -= width / 15;//divides the box
            y += height / 15;
        }    
    }
}