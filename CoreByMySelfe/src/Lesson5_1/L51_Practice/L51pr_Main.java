package Lesson5_1.L51_Practice;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class L51pr_Main extends Application {


    public static void main(String[] args) {
        launch (args);

//        System.out.println(point1.calculateLength());    Выполняется только после закрытия окна!!!!
//        System.out.println(point1.calculateLength());


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        L51pr_Window window = new L51pr_Window();
        Pane root = new Pane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        window.windowSetup(primaryStage);
        primaryStage.show();

//        window.uISetup(root);
        L51pr1_Point point1 = new L51pr1_Point(10, 10);
        L51pr1_Point p1 = new L51pr1_Point( 50, 50);
        L51pr1_Point p2 = new L51pr1_Point( 100, 100);
        Line line2 = new Line(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        window.addLineToRoot(root, line2);



        
    }
}
