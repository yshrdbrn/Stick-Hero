package gamePanel;

import gameController.GameController;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by yashardabiran on 6/29/15.
 */
public class StartPanel extends JPanel {
    private GameController controller;
    JButton button;

    public StartPanel(GameController controller) {
        this.controller = controller;
        this.setLayout(null);

        button = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;

                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

                g2d.drawImage(Images.startButton, 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };


        button.addActionListener(controller);
        button.setBounds(Images.BACKGROUND_WIDTH/2 - 75, Images.BACKGROUND_HEIGHT/2 + 25, 150, 150);
        add(button);


        setPreferredSize(new Dimension(Images.BACKGROUND_WIDTH, Images.BACKGROUND_HEIGHT));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;

        g2d.drawImage(Images.background, -450, 0, null);
        g2d.setFont(new Font("Trattatello", Font.BOLD, 100));
        g2d.setColor(Color.darkGray);
        g2d.drawString("STICK", 125, 120);
        g2d.drawString("HERO", 130, 200);
    }
}
