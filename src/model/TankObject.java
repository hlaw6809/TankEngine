package model;

import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;

/**
 * Created by Henry on 4/11/2016.
 */
public class TankObject {

    private Image graphic;
    private int xCoor;
    private int yCoor;
    private Dimension2D size;
    private TickFunction onTick;
    private Object userData;

    public TankObject(Image graphic,
                      int xCoor,
                      int yCoor,
                      Dimension2D size,
                      TickFunction onTick,
                      Object data) {
        this.graphic = graphic;
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        this.size = size;
        this.onTick = onTick;
        this.userData = data;
    }

    public Object getData() {
        return userData;
    }

    public void setData(Object newData) {
        userData = newData;
    }

    public Point2D getLocation() {
        return new Point2D(xCoor, yCoor);
    }

    public void setLocation(int newX, int newY) {
        xCoor = newX;
        yCoor = newY;
    }

    public Dimension2D getSize() {
        return size;
    }

    public void setSize(Dimension2D newSize) {
        this.size = newSize;
    }

    public TickFunction getTickFunction() {
        return onTick;
    }

    public void setTickFunction(TickFunction newFunction) {
        onTick = newFunction;
    }

    public Image getGraphic() {
        return graphic;
    }

    public void setGraphic(Image newGraphic) {
        graphic = newGraphic;
    }

    public void tick(TankBoard board, TankConfiguration config) {
        onTick.tick(this, board, config);
    }

}
