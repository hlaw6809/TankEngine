package util;

import javafx.scene.image.Image;
import model.ImageMapEnum;

import java.io.File;
import java.util.HashMap;

/**
 * Created by Henry on 4/5/2016.
 */
public class SpriteParser {

    private SpriteParser() {}

    public HashMap<ImageMapEnum, Image> parse(String filePath) {
        DefaultImageMap[] sections = DefaultImageMap.values();
        HashMap values = new HashMap(sections.length + 1, 1);
        return values;
    }

    public HashMap<ImageMapEnum, Image> parse(String filePath, Class<? implements ImageMapEnum> customImageMap) {
        ImageMapEnum[] sections = customImageMap.values();
        HashMap values = new HashMap(sections.length + 1, 1);
        return values;
    }

    private Image getImageFromFile(String filePath) {
        File file = new File(filePath);
        Image img = new Image(file.toURI().toString());
        return img;
    }

    private HashMap<ImageMapEnum, Image> breakImage(Image img, ImageMapEnum imageMap) {
        return null;
    }

}
