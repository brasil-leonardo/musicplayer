package musicplayer.view.component;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MusicCard extends JPanel {
    public MusicCard(String name, String filePath) {
        this.setSize(new Dimension(600, 450));
        this.setPreferredSize(new Dimension(600, 450));
        this.setMinimumSize(new Dimension(600, 450));
        this.setMaximumSize(new Dimension(600, 450));
        add(new JLabel(name));
        add(Box.createHorizontalStrut(15));
        add(new JLabel(filePath));
    }
}