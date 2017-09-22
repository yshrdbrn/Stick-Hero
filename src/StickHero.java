import gameController.GameController;
import gameEngine.GameEngine;
import gamePanel.GamePanel;

import javax.swing.*;

/**
 * Created by yashardabiran on 6/28/15.
 */
public class StickHero {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Stick Hero");
        String name;

        name = JOptionPane.showInputDialog(frame, "Enter Your Name", "Welcome", JOptionPane.QUESTION_MESSAGE);

        GameEngine engine = new GameEngine(name);
        GameController controller = new GameController();
        GamePanel panel = new GamePanel();

        engine.init();
        controller.init(engine, panel);
        panel.init(engine, controller);

        controller.start();

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}