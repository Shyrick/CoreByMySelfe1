package Lesson5_1.L51_Practice;

import javafx.scene.layout.Pane;

public class L51pr_Fractal {

    int depht;
    float percentOffset;

    private void draw(Pane root, L51pr_Triangle triangle){
        int currentDepth = this.depht;
        triangle.drawTriangle(root);
        if (currentDepth >=0) {
            L51pr_Triangle newTriangle = new L51pr_Triangle(triangle.getL1().getPointOnLine(percentOffset),
                    triangle.getL2().getPointOnLine(percentOffset),
                    triangle.getL3().getPointOnLine(percentOffset));

            draw(root, newTriangle);
        }
    }
    public void draw (Pane root){
        ???

    }

    public L51pr_Fractal(int depht, float percentOffset) {
        this.depht = depht;
        this.percentOffset = percentOffset;
    }

    public int getDepht() {
        return depht;
    }

    public float getPercentOffset() {
        return percentOffset;
    }

    public void setDepht(int depht) {
        this.depht = depht;
    }

    public void setPercentOffset(float percentOffset) {
        this.percentOffset = percentOffset;
    }
}
