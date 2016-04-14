package model;

import View.TankObjectView;
import javafx.geometry.Dimension2D;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Henry on 4/12/2016.
 */
public class TankBoard {
    private ArrayList<TankObjectView> tankObjects;
    private Dimension2D size;
    private Object userData;
    private Image background;

    public TankBoard(Collection<TankObject> tankObjects,
                     Dimension2D size,
                     Image background,
                     Object userData) {
        this.size = size;
        this.background = background;
        this.userData = userData;
        for (TankObject o: tankObjects) {
            this.tankObjects.add(new TankObjectView(o));
        }
    }

    public TankBoard(Dimension2D size,
                     Image background,
                     Object userData) {
        this.size = size;
        this.background = background;
        this.userData = userData;
    }

    public ArrayList<TankObjectView> getObjects() {
        return tankObjects;
    }

    public void addObject(TankObject toAdd) {
        tankObjects.add(new TankObjectView(toAdd));
    }

    public void removeObject(TankObject toRemove) {
        tankObjects.remove(toRemove);
    }

    public void clearBoard() {
        tankObjects.clear();
    }

    public Dimension2D getSize() {
        return size;
    }

    public void setSize(Dimension2D newSize) {
        size = newSize;
    }

    public Image getBackground() {
        return background;
    }

    public void setBackground(Image newBackground) {
        background = newBackground;
    }

    public Object getData() {
        return userData;
    }

    public void setData(Object newData) {
        userData = newData;
    }

    public void tick(TankConfiguration config) {
        for (TankObjectView ov: tankObjects) {
            ov.getTObject().tick(config);
        }
    }
}
