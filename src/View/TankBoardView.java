package View;

import javafx.collections.ObservableList;
import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import model.TankBoard;
import model.TankObject;

import java.util.ArrayList;

/**
 * Created by Henry on 4/12/2016.
 */
public class TankBoardView extends Pane {
    TankBoard board;
    Canvas background;
    ObservableList<TankObjectView> children;

    public TankBoardView(TankBoard board) {
        super();
        Dimension2D size = board.getSize();
        this.setPrefSize(size.getWidth(), size.getHeight());
        this.board = board;
        this.background = new Canvas(size.getWidth(), size.getHeight());
    }

    public TankBoard getBoard() {
        return board;
    }

    public void setBoard(TankBoard board) {
        this.board = board;
    }

    public void drawBoard() {
        updateChildren();
        for (Node child : this.children) {
            TankObjectView tov = (TankObjectView) child;
            tov.draw();
        }
    }

    private void updateChildren() {
        if (board.getObjects().size() > this.getChildren().size()) {
            for (TankObjectView o: board.getObjects()) {
                if (!this.getChildren().contains(o)) {
                    this.getChildren().add(o);
                }
            }
        } else if (board.getObjects().size() < this.getChildren().size()) {
            for (Node node : this.getChildren()) {
                TankObjectView tov = (TankObjectView) node;
                if (!board.getObjects().contains(tov)) {
                    this.getChildren().remove(tov);
                }
            }
        }

    }
}
