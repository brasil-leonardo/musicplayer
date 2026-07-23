package musicplayer.view.frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import musicplayer.view.panel.MenuPanel;
import musicplayer.view.panel.MusicListPanel;

public class MainFrame extends JFrame {
    private final MenuPanel menuPanel;
    private final MusicListPanel musicListPanel;

    public MainFrame() {
        setTitle("MusicPlayer");

        ImageIcon imageIcon = new ImageIcon("assets/icon.png");
        Image image = imageIcon.getImage();
        setIconImage(image);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension size = new Dimension(900, 600);
        setSize(size);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);

        setResizable(false);

        setLocationRelativeTo(null);

        BorderLayout layoutManager = new BorderLayout();
        setLayout(layoutManager);

        menuPanel = new MenuPanel();
        add(menuPanel, BorderLayout.LINE_START);

        musicListPanel = new MusicListPanel();
        add(musicListPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}