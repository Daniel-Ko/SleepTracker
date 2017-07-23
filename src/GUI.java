import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Dan Ko on 7/16/2017.
 */
public class GUI {
    private final int DEFAULT_WIDTH = 400;
    private final int DEFAULT_HEIGHT = 600;

    private JTabbedPane tabbedPane1;
    private JPanel Superform;
    
    private JComponent drawing;

    public GUI() {
        initialise();
    }

    public void initialise() {
        JPanel pane = new JPanel();


        //figure out how to make a drawing component (most important right now besides buttons and way to find input)
        drawing = new JComponent() {
            protected void paintComponent(Graphics g) {
                //redraw(g);
            }
        };
        drawing.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        drawing.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
