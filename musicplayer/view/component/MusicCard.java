package musicplayer.view.component;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MusicCard extends JPanel {
    public MusicCard(String name, String filePath) {
        this.setSize(new Dimension(562, 30));
        this.setPreferredSize(new Dimension(562, 30));
        this.setMinimumSize(new Dimension(562, 30));
        this.setMaximumSize(new Dimension(562, 30));

        Border border = BorderFactory.createEmptyBorder(0, 5, 0, 5);
        this.setBorder(border);

        BoxLayout layoutManager = new BoxLayout(this, BoxLayout.X_AXIS);
        this.setLayout(layoutManager);

        JLabel musicName = new JLabel(name);
        int musicNameWidth = musicName.getPreferredSize().width;

        JButton playButton = new JButton("Play");
        int playButtonWidth = playButton.getPreferredSize().width;

        int gap = this.getWidth() - 10 - (musicNameWidth + playButtonWidth);

        this.add(musicName);
        this.add(Box.createHorizontalStrut(gap));
        this.add(playButton);
    }
}