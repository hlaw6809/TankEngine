package model;

import javafx.geometry.Point2D;

/**
 * Created by Henry on 4/5/2016.
 */
public interface ImageMapEnum {

    public Point2D getTopLeftPoint();
    public Point2D getBottomRightPoint();
    public ImageMapEnum[] values();
}
