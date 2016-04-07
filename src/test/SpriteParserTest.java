package test;

import javafx.scene.image.Image;
import org.junit.Test;
import util.SpriteParser;

import java.util.HashMap;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Henry on 4/6/2016.
 */
public class SpriteParserTest {

    protected ImageMapEnum imageMap;

    protected void setUp() {

    }

    @Test
    public void testDefaultParse() {
        HashMap<ImageMapEnum, Image> map = SpriteParser.parse("FilePath");
    }

    @Test
    public void testCustomParse() {
        HashMap<ImageMapEnum, Image> map = SpriteParser.parse("FilePath");
        assertNotNull(map);
    }
}
