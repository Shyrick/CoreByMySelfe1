package Lesson5_2.L52_practice;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WindowStore {

    private static final int WIDTH = 800;
    private static final int HEIGTH = 700;
    private static final int MAX_WIDTH = 1400;
    private static final int MAX_HEIGTH = 800;
    private static final int MIN_WIDTH = 800;
    private static final int MIN_HEIGTH = 700;

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGTH);
        primaryStage.setMaxWidth(MAX_WIDTH);
        primaryStage.setMaxHeight(MAX_HEIGTH);
        primaryStage.setMinWidth(MIN_WIDTH);
        primaryStage.setMinHeight(MIN_HEIGTH);
        primaryStage.setTitle("MyStore");
        primaryStage.titleProperty();
    }

    public void helloyMenu (Pane frontRoot){
        Text text = new Text("Добро пожаловать в Магазин !!!");
        text.setTranslateX(30);
        text.setTranslateY(30);
        Font font = new Font(22);
        text.setFont(font);

        frontRoot.getChildren().addAll(text);

    }

    public void choiceBox (Pane root) {

    }


}
