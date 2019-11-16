package MNRG;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        Map map = new Map();
        map.windowSetup(primaryStage);
        primaryStage.show();

        Dice dice = new Dice();
        map.showDice(root,  dice);
        Player player1 = new Player("Ale");
        Player player2 = new Player("Den");
        Player [] players = {player1, player2};

        MoveController mc = new MoveController(players, dice, map );
        mc.makeMove();

    }
}
