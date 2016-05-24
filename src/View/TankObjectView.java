package View;

import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.TankObject;

/**
 * Created by Henry on 4/12/2016.
 */
public class TankObjectView extends ImageView {

    TankObject tObject;

    Image drawnImage;

    public TankObjectView(TankObject tObject) {
        super(tObject.getGraphic());
        this.tObject = tObject;
        this.drawnImage = tObject.getGraphic();
        setFitHeight(tObject.getSize().getHeight());
        setFitWidth(tObject.getSize().getWidth());
        //background.setPreserveRatio(true);
        setX(tObject.getLocation().getX());
        setY(tObject.getLocation().getY());
    }

    public TankObject getTObject() {
        return tObject;
    }

    public void setTObject(TankObject tObject) {
        this.tObject = tObject;
    }

    public void redraw() {
        Image newImage = tObject.getGraphic();
        if (!newImage.equals(drawnImage)) {
            this.setImage(newImage);
        }
    }
}
