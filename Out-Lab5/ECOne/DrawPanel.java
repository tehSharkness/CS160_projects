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

public class DrawPanel extends JPanel
{
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        
        int width = getWidth();//reads the width
        int height = getHeight();//reads the height
        int x = width, y = 0;
        
        while( x >= 0 )
        {
            g.drawLine( 0, 0, width - x, height - y );
            x -= width / 15;//divides the box
            y += height / 15;
        }    
    }
}