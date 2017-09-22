package gamePanel;

import gameController.GameController;
import gameEngine.GameEngine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yashardabiran on 6/30/15.
 */
public class GameOverPanel extends JPanel {
    private GameEngine engine;
    JButton button;

    public GameOverPanel(final GameEngine engine, final GameController controller) {
        this.setLayout(null);
        this.engine = engine;
        button = new JButton() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;

                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

                g2d.drawImage(Images.replay, 0, 0, this.getWidth(), this.getHeight(), this);
            }
        };

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.replay();
            }
        });
        button.setBounds(Images.BACKGROUND_WIDTH / 2 - 180, Images.BACKGROUND_HEIGHT / 2 + 100, 360, 120);
        add(button);

        setPreferredSize(new Dimension(Images.BACKGROUND_WIDTH, Images.BACKGROUND_HEIGHT));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;

        g2d.drawImage(Images.background, -450, 0, null);
        g2d.setFont(new Font("Trattatello", Font.BOLD, 85));
        g2d.setColor(Color.black);
        g2d.drawString("GAME OVER", 35, 120);

        g2d.setFont(new Font("Trattatello", Font.PLAIN, 60));
        g2d.drawString("SCORE : " + engine.getScore(), 130, 250);
        g2d.drawString("MUSHROOMS : " + engine.getMushroomNum(), 40, 330);
    }
}
