package musicplayer.view.panel;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import musicplayer.view.component.MenuButton;

public class InfoPanel extends JPanel {
    public InfoPanel() {
        Dimension size = new Dimension(150, 500);
        setSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);

        BoxLayout layoutManager = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layoutManager);

        Border border = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(border);

        add(new MenuButton("Teste"));
    }
}