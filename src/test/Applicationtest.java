package test;/**
 * Created by Henry on 5/16/2016.
 */

import View.TankBoardView;
import View.TankObjectView;
import javafx.application.Application;
import javafx.geometry.Dimension2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.TankBoard;
import model.TankConfiguration;
import model.TankObject;
import model.TickFunction;

public class Applicationtest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Image image = new Image("/test/background.jpg");
        TankBoard board = new TankBoard(new Dimension2D(500, 300), image, null);
        TankBoardView tbv = new TankBoardView(board);

        Image fishImage = new Image("/test/fish.png");
        TankObject obj = new TankObject(fishImage, 200, 100, new Dimension2D(75, 50), new TickFunction() {
            @Override
            public void tick(TankObject obj, TankBoard board, TankConfiguration config) {
                System.out.println("Ticked Fish");
            }
        }, null);
        TankObjectView objView = new TankObjectView(obj);
        tbv.addObject(objView);

        StackPane root = new StackPane();
        root.getChildren().add(tbv);
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Image Display Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
