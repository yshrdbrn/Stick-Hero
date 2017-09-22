package gamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by yashardabiran on 6/30/15.
 */
public class Images {
    public static Image background;
    public static Image startButton;
    public static Image stand;
    public static Image walk1;
    public static Image walk2;
    public static Image walk3;
    public static Image walk4;
    public static Image replay;
    public static Image mushroom;

    public static final int BACKGROUND_WIDTH = 500;
    public static final int BACKGROUND_HEIGHT = 600;
    public static final int MARIO_WIDTH = 25;
    public static final int MARIO_HEIGHT = 50;

    static {

        try {

            background = ImageIO.read(new File("images/background.png"));
            startButton = ImageIO.read(new File("images/StartButton.png"));
            stand = ImageIO.read(new File("images/stand.png"));
            walk1 = ImageIO.read(new File("images/walk1.png"));
            walk2 = ImageIO.read(new File("images/walk2.png"));
            walk3 = ImageIO.read(new File("images/walk3.png"));
            walk4 = ImageIO.read(new File("images/walk2.png"));
            replay = ImageIO.read(new File("images/replay.png"));
            mushroom = ImageIO.read(new File("images/mushroom.png"));

        } catch (IOException e) {

        }
    }
}
