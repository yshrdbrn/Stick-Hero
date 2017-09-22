package gamePanel;

import gameController.GameController;
import gameEngine.GameEngine;

import javax.swing.*;
import java.awt.*;

/**
 * Created by yashardabiran on 6/29/15.
 */
public class GamePanel extends JPanel{
    private PlayPanel playPanel;
    private StartPanel startPanel;
    private NamePanel namePanel;
    private GameOverPanel gameOverPanel;

    private GameEngine engine;
    private GameController controller;

    public void init(GameEngine engine, GameController controller) {
        this.engine = engine;
        this.controller = controller;

        gameOverPanel = new GameOverPanel(engine, controller);
        namePanel = new NamePanel(engine);
        startPanel = new StartPanel(controller);
        playPanel = new PlayPanel(engine, controller);
        playPanel.addMouseListener(controller);

        this.setLayout(new BorderLayout());

        this.add(startPanel, BorderLayout.CENTER);
        this.add(namePanel, BorderLayout.PAGE_END);
    }

    public void goToGame() {
        this.remove(startPanel);
        this.add(playPanel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }


    public void gameOver() {
        this.remove(playPanel);
        this.add(gameOverPanel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    public void replay(GameEngine engine, GameController controller) {
        this.remove(gameOverPanel);
        this.remove(namePanel);
        revalidate();
        repaint();
        init(engine, controller);
    }
}
