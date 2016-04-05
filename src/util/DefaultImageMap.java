package util;

import javafx.geometry.Point2D;
import model.ImageMapEnum;

/**
 * Created by Henry on 4/5/2016.
 */
public enum DefaultImageMap implements ImageMapEnum {
    LEFT(0, 0, 100, 100),
    RIGHT(100, 0, 200, 100);

    private final Point2D topLeft;
    private final Point2D bottomRight;

    DefaultImageMap(int xStart, int yStart, int xEnd, int yEnd) {
        topLeft = new Point2D(xStart, yStart);
        bottomRight = new Point2D(xEnd, yEnd);
    }

    @Override
    public Point2D getTopLeftPoint() {
        return topLeft;
    }

    @Override
    public Point2D getBottomRightPoint() {
        return new Point2D(1, 2);
    }
}
