package util;

import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import model.SpriteMapItem;

import java.io.File;
import java.util.HashMap;

/**
 * Created by Henry on 4/5/2016.
 */
public class SpriteParser {

    private SpriteParser() {}

    public static HashMap<String, Image> parse(String filePath) {
        ////Not Yet Implemented
        HashMap values = new HashMap<String, Image>();
        return values;
    }

    public static HashMap<String, Image> parse(String filePath,  SpriteMapItem[] imageMapItems) {
        Image img = getImageFromFile(filePath);
        HashMap values = breakImage(img, imageMapItems);
        return values;
    }

    private static Image getImageFromFile(String filePath) {
        File file = new File(filePath);
        Image img = new Image(file.toURI().toString());
        return img;
    }

    private static HashMap<String, Image> breakImage(Image img, SpriteMapItem[] mapItems) {
        HashMap map = new HashMap<String, Image>();
        for (int i = 0; i < mapItems.length; i++) {
            SpriteMapItem mapItem = mapItems[i];
            Point2D start = mapItem.getStartPoint();
            WritableImage image = new WritableImage(img.getPixelReader(), (int) start.getX(), (int) start.getY(), mapItem.getWidth(), mapItem.getHeight());
            map.put(mapItem.getName(), image);
        }
        return null;
    }

}
