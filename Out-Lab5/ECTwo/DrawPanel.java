/**
 * Samuel Harkness
 * Used to create lines
 * Out-lab #5
 * 160 - 07
 * 11-1-05
 */
package ECTwo;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        
        int width = getWidth();
        int height = getHeight();
        int x = width, y = 0;
        
        while( x >= 0 )
        {
            g.drawLine( 0, y, width - x, height );
            x -= width / 15;//divides the box
            y += height / 15;
        }    
    }
}