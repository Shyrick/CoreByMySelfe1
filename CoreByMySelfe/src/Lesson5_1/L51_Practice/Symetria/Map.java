package Lesson5_1.L51_Practice.Symetria;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Map {

    Point pointA;
    Point pointB;
    Point pointC;
    Point startPoint;

    public void showStartPoint (Pane root){
       this.pointA.showPoint(root, pointA);
        this.pointB.showPoint(root, pointB);
        this.pointC.showPoint(root, pointC);
    }

    public Map(Point pointA, Point pointB, Point pointC, Point startPoint) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.startPoint = startPoint;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }
}
