package Lesson5_2.L52_practice;

import Lesson5_1.L51_HW.Window;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainStore extends Application {
    private static final int WIDTH = 800;
    private static final int HEIGTH = 700;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        WindowStore window = new WindowStore();
        Pane root = new Pane();
        Pane frontRoot = new Pane();
        root.getChildren().addAll(frontRoot);

        Scene scene = new Scene(root, WIDTH, HEIGTH);
        primaryStage.setScene(scene);
        window.windowSetup(primaryStage);
        primaryStage.show();

        window.helloyMenu(frontRoot);

    }
}
