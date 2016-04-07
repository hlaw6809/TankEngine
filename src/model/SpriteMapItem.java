package model;

import javafx.geometry.Point2D;

/**
 * Created by Henry on 4/6/2016.
 */
public class SpriteMapItem {

    private String name;

    private Point2D start;

    private int width;

    private int height;


    public SpriteMapItem(String name, int x, int y, int width, int height) {
        this.name = name;
        this.start = new Point2D(x, y);
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public Point2D getStartPoint() {
        return start;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
