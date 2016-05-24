package View;

import javafx.collections.ObservableList;
import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import model.TankBoard;
import model.TankObject;

import java.util.ArrayList;

/**
 * Created by Henry on 4/12/2016.
 */
public class TankBoardView extends Pane {
    TankBoard board;
    ImageView background;

    public TankBoardView(TankBoard board) {
        super();
        Dimension2D size = board.getSize();
        this.setPrefSize(size.getWidth(), size.getHeight());
        this.board = board;
        background = new ImageView(board.getBackground());
        background.setFitHeight(board.getSize().getHeight());
        background.setFitWidth(board.getSize().getWidth());
        //background.setPreserveRatio(true);
        this.getChildren().add(background);
    }

    public void addObject(TankObjectView tObjView) {
        this.getChildren().add(tObjView);
        board.addObject(tObjView.getTObject());
    }
}
