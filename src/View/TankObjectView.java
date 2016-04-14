package View;

import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import model.TankObject;

/**
 * Created by Henry on 4/12/2016.
 */
public class TankObjectView extends Canvas {

    TankObject tObject;

    public TankObjectView(TankObject tObject) {
        super(tObject.getSize().getWidth(), tObject.getSize().getHeight());
        this.tObject = tObject;
    }

    public TankObject getTObject() {
        return tObject;
    }

    public void setTObject(TankObject tObject) {
        this.tObject = tObject;
    }

    public void draw() {
        Image img = tObject.getGraphic();
        Dimension2D size = tObject.getSize();
        Point2D location = tObject.getLocation();
        GraphicsContext gc = this.getGraphicsContext2D();
        gc.drawImage(img, location.getX(), location.getY(), size.getWidth(), size.getHeight());
    }
}
