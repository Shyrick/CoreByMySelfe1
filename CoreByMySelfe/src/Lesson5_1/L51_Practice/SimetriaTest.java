package Lesson5_1.L51_Practice;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.Light;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Collection;
import java.util.Random;

public class SimetriaTest extends Application {


    public static void main(String[] args) {
        launch(args);


    }

    int random (){
        Random random = new Random();
        int r = random.nextInt(7);
        while (r == 0)
            r = random.nextInt(7);
        return r;
    }

    L51pr1_Point choosePoint (L51pr1_Point p1, L51pr1_Point p2, L51pr1_Point p3){
        if (random() == 1 || random() == 2)            return p1;
        else  if (random() == 3 || random() == 4)            return p2;
        else return p3;
    }

    

    void drawPoint (Circle circle, Pane root){

        root.getChildren().addAll(circle);
    }
    void drawAll (int number, Pane root, L51pr1_Point p1, L51pr1_Point p2){
        for (int i = 0; i <= number ; i++) {

            }
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        L51pr_Window window = new L51pr_Window();
        Pane root = new Pane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        window.windowSetup(primaryStage);
        primaryStage.show();

        Circle c1 = new Circle(400, 50, 2);
        Circle c2 = new Circle(700, 600, 2);
        Circle c3 = new Circle(50, 600, 2);
        Circle startPoint = new Circle(200, 200, 2);
        drawPoint(c1, root);
        drawPoint(c2, root);
        drawPoint(c3, root);
        drawPoint(startPoint, root);






    }
}
