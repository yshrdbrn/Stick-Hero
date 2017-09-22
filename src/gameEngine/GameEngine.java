package gameEngine;

import java.util.Random;

/**
 * Created by yashardabiran on 6/29/15.
 */
public class GameEngine {
    public static final int MIN_DISTANCE = 100;
    public static final int MAX_DISTANCE = 250;
    private String name;
    private boolean gameOver;
    private boolean moving;
    private Rectangle first, second;
    private int distance;
    private int stickLength;
    private int score;

    private int mushroomNum;
    private int mushroomPos;

    public GameEngine(String name) {
        this.name = name;
    }

    public void init() {
        first = new Rectangle();
        second = new Rectangle();

        assignDistance();
        stickLength = 0;
        score = 0;
        mushroomNum = 0;

        gameOver = false;
        moving = false;
    }

    private void assignDistance() {
        Random rand = new Random();

        distance = 0;
        while (distance < GameEngine.MIN_DISTANCE)
            distance = rand.nextInt(GameEngine.MAX_DISTANCE);

        mushroomPos = 0;
        while (mushroomPos < 50) {
            mushroomPos = rand.nextInt(distance - 50);
        }
    }

    public void increaseStickLength() {
        stickLength+= 3;
    }

    public void checkForGameOver() {
        if (stickLength < distance + 5 || distance + second.getWidth() + 5 < stickLength)
            gameOver = true;
    }

    public void nextRectangle() {
        first = second;
        second = new Rectangle();
        assignDistance();

        moving = false;
        stickLength = 0;
        score++;
    }







    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public Rectangle getFirstRect() {
        return first;
    }

    public Rectangle getSecondRect() {
        return second;
    }

    public int getDistance() {
        return distance;
    }

    public int getStickLength() {
        return stickLength;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getMushroomPos() {
        return mushroomPos;
    }

    public void mushroomEaten() {
        mushroomNum++;
    }

    public int getMushroomNum() {
        return mushroomNum;
    }
}
