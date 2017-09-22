package gamePanel;

import gameEngine.GameEngine;

import javax.swing.*;
import java.awt.*;

/**
 * Created by yashardabiran on 6/29/15.
 */
public class NamePanel extends JPanel {
    private static final int BORDERS_LENGTH = 2;
    private static final int MAX_SIZE = 100;

    private JLabel name;

    public NamePanel(final GameEngine engine) {
        super();
//        this.setBorder(BorderFactory.createEmptyBorder(BORDERS_LENGTH,
//                BORDERS_LENGTH, BORDERS_LENGTH, BORDERS_LENGTH));
        this.setLayout(new FlowLayout());

        name = new JLabel(engine.getName());

        name.setBorder(BorderFactory.createEmptyBorder(BORDERS_LENGTH,
                BORDERS_LENGTH, BORDERS_LENGTH, BORDERS_LENGTH));

        name.setMaximumSize(new Dimension(MAX_SIZE, MAX_SIZE));

        name.setFont(new Font("Helvetica", Font.PLAIN, 22));

        this.add(name);
    }
}
