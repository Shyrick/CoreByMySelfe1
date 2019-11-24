package Lesson5_1.L51_HW;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class SnowManPainter {

    int numberOfCirles;
    double minRadius;
    double maxRadius;


    double x = 400; //primaryStage.getWidth() / 2;
//    double[] yOfCircles;
//    double[] radiusOfCircles;


    double random (){
        Random random = new Random();
        double r = minRadius + minRadius*random.nextDouble()* 100;
        while ( r > maxRadius)
            r = minRadius + minRadius*random.nextDouble()* 100;
        return r;
    }

    void circleSetup (Circle circle){
        circle.setStrokeWidth(2);
        circle.setFill(Paint.valueOf("#FFFFFF"));
        circle.setStroke(Paint.valueOf("#000000"));
    }

    void drawBody(Pane frontRoot, Stage primaryStage, int numberOfCirles) {
        double[] yOfCircles = new double[numberOfCirles];
        double[] radiusOfCircles = new double[numberOfCirles];

        double yOfBottomLine = primaryStage.getHeight() - 50;
        Line line = new Line(50, yOfBottomLine, 600, yOfBottomLine);
        frontRoot.getChildren().addAll(line);

        radiusOfCircles[0] = random();
        yOfCircles[0] = yOfBottomLine - radiusOfCircles[0];

        for (int i = 0; i < numberOfCirles; i++) {
            Circle circle = new Circle(x, yOfCircles[i], radiusOfCircles[i]);
            circleSetup(circle);
            if (i < numberOfCirles - 1) {
                radiusOfCircles[i + 1] = random();
                yOfCircles[i + 1] = yOfCircles[i] - radiusOfCircles[i] - radiusOfCircles[i + 1];
            }
            frontRoot.getChildren().addAll(circle);
        }
//        drawFace(frontRoot, primaryStage, numberOfCirles);
    }

//        void  drawFace (Pane frontRoot, Stage primaryStage, int numberOfCirles){
//            maxRadius = radiusOfCircles[numberOfCirles-1] / 3;
//            double y1 = yOfCircles [numberOfCirles-1] + radiusOfCircles[numberOfCirles-1]/3;
//            double x2 = x - radiusOfCircles[numberOfCirles - 1] / 3;
//            double y2 = yOfCircles [numberOfCirles-1] - radiusOfCircles[numberOfCirles-1]/3;
//            double x3 = x + radiusOfCircles[numberOfCirles - 1] / 3;
//            double y3 = yOfCircles [numberOfCirles-1] - radiusOfCircles[numberOfCirles-1]/3;
//
//
//            Circle circle1 = new Circle(x, y1, random() );
//            Circle circle2 = new Circle(x2, y2, random() );
//            Circle circle3 = new Circle(x3, y3, random() );
//
//            frontRoot.getChildren().addAll(circle1, circle2, circle3);
//
//
//
//
//
//        }

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

        Text text4 = new Text("Максимальный радиус слишком большой");
        text4.setTranslateX(370);
        text4.setTranslateY(70);

        Button button1 = new Button("Рисовать");
        button1.setTranslateX(570);
        button1.setTranslateY(30);
        button1.setOnAction(event -> {

           numberOfCirles = Integer.valueOf(textField1.getText());
           minRadius = Double.valueOf(textField2.getText());
           maxRadius = Double.valueOf(textField3.getText());

           if(maxRadius > ((primaryStage.getHeight() - 85)/(2*numberOfCirles))){
               frontRoot.getChildren().clear();
               frontRoot.getChildren().addAll(text4);
           }else {
            frontRoot.getChildren().clear();
            drawBody(frontRoot, primaryStage, numberOfCirles);
           }
        });

        Button button2 = new Button("Очистить");
        button2.setTranslateX(660);
        button2.setTranslateY(30);
        button2.setOnAction(event -> {
            frontRoot.getChildren().clear();
        });



        root.getChildren().addAll(text1, text2, text3, textField1, textField2, textField3, button1, button2);

    }

//    public SnowManPainter(Stage primaryStage) {
//        this.primaryStage = primaryStage;
//    }
}
