package MNRG;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Map {

   Field field;
   int fieldNumber;
   Dice dice;



    private static final int WIDTH = 1200;
    private static final int HEIGTH = 800;
    private static final int MAX_WIDTH = 1300;
    private static final int MAX_HEIGTH = 850;
    private static final int MIN_WIDTH = 800;
    private static final int MIN_HEIGTH = 700;

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGTH);
        primaryStage.setMaxWidth(MAX_WIDTH);
        primaryStage.setMaxHeight(MAX_HEIGTH);
        primaryStage.setMinWidth(MIN_WIDTH);
        primaryStage.setMinHeight(MIN_HEIGTH);
        primaryStage.setTitle("MNGR");
    }
    void showDice(Pane root, Dice dice){

        Font font = new Font(20);

        Text text1 = new Text("4");
        text1.setTranslateX(20);
        text1.setTranslateY(30);
        text1.setFont(font);



        Text text2 = new Text("2");
        text2.setTranslateX(35);
        text2.setTranslateY(30);
        text2.setFont(font);

        Button button1 = new Button("Бросать");
        button1.setTranslateX(60);
        button1.setTranslateY(10);
        button1.setOnAction(event -> {
            text1.setText(Integer.toString(dice.dropDice()));
            text2.setText(Integer.toString(dice.dropDice()));

        });

        root.getChildren().addAll(text1, text2, button1);

    }

}
