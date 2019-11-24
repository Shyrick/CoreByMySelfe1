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
    Stage primaryStage;
//    double[] yOfCircles;
//    double[] radiusOfCircles;
    Circle [] circles;

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

    

    void drawBody(Pane frontRoot,  int numberOfCirles) {

        double  x = primaryStage.getWidth() / 2;
        circles = new Circle[numberOfCirles];

        double yOfBottomLine = primaryStage.getHeight() - 50;
        Line line = new Line(50, yOfBottomLine, 600, yOfBottomLine);
        frontRoot.getChildren().addAll(line);

        double r1 = random();
        double y1 = yOfBottomLine - r1;
        circles [0]= new Circle(x, y1,r1);

        for (int i = 0; i < numberOfCirles; i++) {
            circleSetup(circles[i]);
            if (i < numberOfCirles - 1) {
                double nextRadius = random();
               double nextY = circles[i].getCenterY() - circles[i].getRadius() - nextRadius;
               circles [i+1] = new Circle(x, nextY, nextRadius);
            }
            frontRoot.getChildren().addAll(circles[i]);
        }
        drawFace(frontRoot, numberOfCirles);
    }

        void  drawFace (Pane frontRoot, int numberOfCirles){
            double  x = primaryStage.getWidth() / 2;
            maxRadius = circles [numberOfCirles - 1].getRadius() / 3;
            minRadius = circles [numberOfCirles - 1].getRadius() / 6;
            double y1 = circles [numberOfCirles - 1].getCenterY() + circles [numberOfCirles - 1].getRadius() / 3;
            double x2 = x - circles [numberOfCirles - 1].getRadius() / 3;
            double y2 = circles [numberOfCirles - 1].getCenterY() - circles [numberOfCirles - 1].getRadius() / 3;
            double x3 = x + circles [numberOfCirles - 1].getRadius() / 3;
            double y3 = y2;

            Circle circle1 = new Circle(x, y1, random() );
            Circle circle2 = new Circle(x2, y2, random() );
            Circle circle3 = new Circle(x3, y3, random() );
            circleSetup(circle1);
            circleSetup(circle2);
            circleSetup(circle3);

            frontRoot.getChildren().addAll(circle1, circle2, circle3);





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

           if(maxRadius > ((primaryStage.getHeight())/(1.8*numberOfCirles))){
               frontRoot.getChildren().clear();
               frontRoot.getChildren().addAll(text4);
           }else {
            frontRoot.getChildren().clear();
            drawBody(frontRoot, numberOfCirles);
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

    public SnowManPainter(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
