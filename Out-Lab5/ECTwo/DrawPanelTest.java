/**
 * Samuel Harkness
 * Used to create panel
 * Out-lab #5
 * 160 - 07
 * 11-1-05
 */
package ECTwo;
import javax.swing.JFrame;

public class DrawPanelTest
{
    public static void main( String args[] )
    {
        DrawPanel panel = new DrawPanel();
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        application.add( panel );
        application.setSize( 250, 250 );
        application.setVisible( true );
    }
}