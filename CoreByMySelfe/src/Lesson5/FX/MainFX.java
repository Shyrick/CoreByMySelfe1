package Lesson5.FX;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainFX extends Application {
    private static final int WIDTH = 500;
    private static final int HEIGTH = 500;
    private static final int MAX_WIDTH = 800;
    private static final int MAX_HEIGTH = 800;
    private static final int MIN_WIDTH = 300;
    private static final int MIN_HEIGTH = 300;

    public static void main(String[] args) {
        launch(args); // обязательно для работы javaFX
    }

        private void windowSetup(Stage primaryStage) {
            primaryStage.setWidth(WIDTH);
            primaryStage.setHeight(HEIGTH);
            primaryStage.setMaxWidth(MAX_WIDTH);
            primaryStage.setMaxHeight(MAX_HEIGTH);
            primaryStage.setMinWidth(MIN_WIDTH);
            primaryStage.setMinHeight(MIN_HEIGTH);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setWidth(500); // задаем ширину окна 500 pix
//        primaryStage.setHeight(500); // задаем высоту окна 500 pix
//        // Причем высоте и ширина окна не учитываю размеры полоски окна с кнопками
//
//        // Установим максимальные размеры окна (до которых его можно растягивать)
//        primaryStage.setMaxWidth(1000);
//        primaryStage.setMaxHeight(1000);
//        //Устанавливаем минимальные размеры
//        primaryStage.setMaxWidth(300);
//        primaryStage.setMaxHeight(300);

        // Правильно использовать константы
        // Можно константу писать вунтри метода, если она не будет использоваться в других местах (только здесь)

//        final int WIDTH = 500;
//        final int HEIGTH = 500;

        // Если бутед - то ее нужно выносить за метод и писать как поле класса (см. выше)
        // Все настройки окна переносим в отдельный метод windowSetup()

        Text text = new Text("Hello world");
        Scene scene = new Scene();
                stop 26:00

        primaryStage.show(); // вызов окна
        windowSetup(primaryStage);

    }
}
