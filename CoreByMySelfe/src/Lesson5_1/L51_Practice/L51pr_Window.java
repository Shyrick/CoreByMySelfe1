package Lesson5_1.L51_Practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class L51pr_Window {

    private static final int WIDTH = 500;
    private static final int HEIGTH = 500;
    private static final int MAX_WIDTH = 800;
    private static final int MAX_HEIGTH = 800;
    private static final int MIN_WIDTH = 300;
    private static final int MIN_HEIGTH = 300;

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGTH);
        primaryStage.setMaxWidth(MAX_WIDTH);
        primaryStage.setMaxHeight(MAX_HEIGTH);
        primaryStage.setMinWidth(MIN_WIDTH);
        primaryStage.setMinHeight(MIN_HEIGTH);
        primaryStage.setTitle("L51_Practice");
        primaryStage.titleProperty();
    }

    void uISetup ( Pane root ){
        Text text = new Text();
        text.setTranslateX(10);
        text.setTranslateY(20);
        text.setText("MyText");
        Font font = new Font(14);
        text.setFont(font);

        root.getChildren().addAll(text);
    }
    void addLineToRoot (Pane root, Line line){
        root.getChildren().addAll(line);
    }

}
