package Lesson5_1.L51_Practice.Symetria;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Window {
    private static final int WIDTH = 800;
    private static final int HEIGTH = 700;
    private static final int MAX_WIDTH = 800;
    private static final int MAX_HEIGTH = 700;
    private static final int MIN_WIDTH = 800;
    private static final int MIN_HEIGTH = 700;

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGTH);
        primaryStage.setMaxWidth(MAX_WIDTH);
        primaryStage.setMaxHeight(MAX_HEIGTH);
        primaryStage.setMinWidth(MIN_WIDTH);
        primaryStage.setMinHeight(MIN_HEIGTH);
        primaryStage.setTitle("Symetria");
    }

    void uiSetup (Pane root){
        Text text = new Text("Количество точек");
        text.setTranslateX(40);
        text.setTranslateY(30);

        TextField textField1 = new TextField();
        textField1.setTranslateX(200);
        textField1.setTranslateY(15);

        Button button1 = new Button("Рисовать");
        button1.setTranslateX(400);
        button1.setTranslateY(15);

        Button button2 = new Button("Очистить");
        button2.setTranslateX(500);
        button2.setTranslateY(15);

        root.getChildren().addAll(text, textField1, button1, button2);
    }

}
