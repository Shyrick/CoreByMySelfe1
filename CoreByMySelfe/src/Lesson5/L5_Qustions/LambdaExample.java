package Lesson5.L5_Qustions;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.awt.*;

public class LambdaExample {

    public static void main(String[] args) {
// Пример, когда lambda не событие (например открытие файла)
        Runnable lambda = () ->{
            System.out.println("I am Lambda");
        };

        lambda.run();
// Пример, когда lambda события
        // Код здесь не работчий, т.к. не до конца прописан код для javaFX

//        EventHandler lambda2 = (event) ->{
//            lambda.run();
//        };
//
//        Button btn = new Button();
//        btn.setOnMouseClicked(lambda2);
    }
}
