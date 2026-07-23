package musicplayer.view.component;

import java.awt.Dimension;
import javax.swing.JButton;

public class MenuButton extends JButton {
    public MenuButton(String text) {
        super(text);

        Dimension size = new Dimension(Integer.MAX_VALUE, 25);
        setSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }
}