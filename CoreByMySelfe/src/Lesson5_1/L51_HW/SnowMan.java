package Lesson5_1.L51_HW;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class SnowMan {

    int numberOfCirles;
    double minRadius;
    double maxRadius;


    double random (){
        Random random = new Random();
        double r = minRadius + minRadius*random.nextDouble()* 100;
        while ( r > maxRadius)
            r = minRadius + minRadius*random.nextDouble()* 100;
        return r;
    }

    void  drawCircle (Pane frontRoot, Stage primaryStage){

        double radius = random();
        double x = primaryStage.getWidth()/2;
        double y = primaryStage.getHeight() - radius;
        System.out.println("rad " + radius);
        System.out.println("MH " + primaryStage.getHeight());
        System.out.println("MW " + primaryStage.getWidth());
        System.out.println("x " + x + " y " + y);
//        Circle circle = new Circle(x, y, radius);
        Circle circle1 = new Circle(300, 600, 2);
        Circle circle2 = new Circle(300, 550, 2);
        Circle circle3 = new Circle(300, 500, 2);
        Circle circle4 = new Circle(300, 450, 2);
        Circle circle5 = new Circle(300, 400, 2);
        Circle circle6 = new Circle(550, 20, 2);
        Circle circle7 = new Circle(550, 40, 2);
        Circle circle8 = new Circle(550, 60, 2);
        Circle circle9 = new Circle(550, 80, 2);
        Circle circle10 = new Circle(550, 0, 2);
//        circle.setStrokeWidth(10);
//        circle.setFill(Paint.valueOf("#00000000"));
        frontRoot.getChildren().addAll( circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8, circle9, circle10);
    }

    public void textAndButton (Pane root, Pane frontRoot, Stage primaryStage ){
        Text text1 = new Text("Количество кругов");
        text1.setTranslateX(40);
        text1.setTranslateY(20);
        TextField textField1 = new TextField();
        textField1.setTranslateX(40);
        textField1.setTranslateY(30);

        Text text2 = new Text("Минимальный радиус");
        text2.setTranslateX(200);
        text2.setTranslateY(20);
        TextField textField2 = new TextField();
        textField2.setTranslateX(200);
        textField2.setTranslateY(30);

        Text text3 = new Text("Максимальный радиус");
        text3.setTranslateX(370);
        text3.setTranslateY(20);
        TextField textField3 = new TextField();
        textField3.setTranslateX(360);
        textField3.setTranslateY(30);

        Button button1 = new Button("Рисовать");
        button1.setTranslateX(570);
        button1.setTranslateY(30);
        button1.setOnAction(event -> {
           numberOfCirles = Integer.valueOf(textField1.getText());
           minRadius = Double.valueOf(textField2.getText());
           maxRadius = Double.valueOf(textField3.getText());

            drawCircle(frontRoot, primaryStage);

        });

        Button button2 = new Button("Очистить");
        button2.setTranslateX(660);
        button2.setTranslateY(30);
        button2.setOnAction(event -> {
            frontRoot.getChildren().clear();
        });



        root.getChildren().addAll(text1, text2, text3, textField1, textField2, textField3, button1, button2);

    }

}
