package Lesson5.FX;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
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

    void uISetup ( Pane root ){
        //  Для удобства перенесли все настройки текста в отдельный метод, чтробы очисть код в методе start()
        Text text = new Text("Hello world");
        text.setTranslateX(10);// устанавливаем координаты места появления текста в окне
        text.setTranslateY(20);
        // добавим новую строку
        text.setText(text.getText() + "\nновая строка");
        // Создадим кнопку в окне
        Button button = new Button("Добавить число");
        button.setTranslateX(200);
        button.setTranslateY(10);

        button.setOnMouseClicked(event -> { // Это лямбда - метод без названия, кот. выполнится только после события (нажатие на кнопку)
            String oldText = text.getText();
            text.setText(oldText +"\n" + 100 );stop 43:00
        });
        root.getChildren().addAll(text, button); //Children - это все. что вложено в root. Добалвяем текст в root и кнопку
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

        Pane root = new Pane();
        uISetup(root);

        Scene scene = new Scene(root); //Сцене в конструктор нужно передать root (объект класса Pane)
        primaryStage.setScene(scene); // Указали сцену для primaryStage
        //Т.е. root внутри scene, а scene внутри primaryStage
        // Все выводы в окно делаются через root (см. выше)


        primaryStage.show(); // вызов окна
        windowSetup(primaryStage);

    }
}
