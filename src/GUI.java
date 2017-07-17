import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Dan Ko on 7/16/2017.
 */
public class GUI {
    private JTabbedPane tabbedPane1;
    private JPanel Superform;

    public GUI() {
        tabbedPane1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }
}
