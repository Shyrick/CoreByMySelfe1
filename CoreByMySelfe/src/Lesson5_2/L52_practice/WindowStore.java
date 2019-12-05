package Lesson5_2.L52_practice;

import Lesson5_2.L52_practice.Products.IdCeeper;
import Lesson5_2.L52_practice.Products.Smartfone;
import Lesson5_2.L52_practice.Products.Vegetable;
import Lesson5_2.L52_practice.Products.Water;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WindowStore {

    private static final int WIDTH = 800;
    private static final int HEIGTH = 700;
    private static final int MAX_WIDTH = 1400;
    private static final int MAX_HEIGTH = 800;
    private static final int MIN_WIDTH = 800;
    private static final int MIN_HEIGTH = 700;
    Store store;
    WindowForms windowForms;
    IdCeeper idCeeper;


    public WindowStore() {
    }

    public WindowStore(Store store, WindowForms windowForms, IdCeeper idCeeper) {
        this.store = store;
        this.windowForms = windowForms;
        this.idCeeper = idCeeper;
    }

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGTH);
        primaryStage.setMaxWidth(MAX_WIDTH);
        primaryStage.setMaxHeight(MAX_HEIGTH);
        primaryStage.setMinWidth(MIN_WIDTH);
        primaryStage.setMinHeight(MIN_HEIGTH);
        primaryStage.setTitle("MyStore");
        primaryStage.titleProperty();
    }

    public void helloyMenu (Pane frontRoot){
        Text text = new Text("Добро пожаловать в Магазин !!!");
        text.setTranslateX(30);
        text.setTranslateY(30);
        Font font = new Font(22);
        text.setFont(font);

        Button button1 = new Button("В магазин");
        button1.setTranslateX(70);
        button1.setTranslateY(70);

        button1.setOnAction(event -> {
            Text text1 = new Text("Выберите категорию");
            text1.setTranslateX(70);
            text1.setTranslateY(140);

             frontRoot.getChildren().addAll(text1);
            productChoiceBox(frontRoot); // выбор категории товара
        });

        Button button2 = new Button("Добавить товар");
        button2.setTranslateX(200);
        button2.setTranslateY(70);

        button2.setOnAction(event -> {
            newProductChoiceBox (frontRoot);

        });

        frontRoot.getChildren().addAll(text, button1, button2);


    }

    public void productChoiceBox(Pane frontRoot) {

        frontRoot.getChildren().clear();
        Text text1 = new Text("Выберите категорию");
        text1.setTranslateX(30);
        text1.setTranslateY(30);

        String [] arr = store.products;
        ObservableList<String> products = FXCollections.observableArrayList(arr);
        ChoiceBox<String> productChoiceBox = new ChoiceBox<String>(products);
        productChoiceBox.setValue(store.products [0]); // значение по умолчанию
        productChoiceBox.setTooltip(new Tooltip("Select the category")); // выпадающее окно при наведении
        productChoiceBox.setTranslateX(70);
        productChoiceBox.setTranslateY(90);

        frontRoot.getChildren().addAll(productChoiceBox, text1);

        productChoiceBox.setOnAction(event -> {
//            String str = productChoiceBox.getValue();
//            if (str == store.products[0]){
//                createSmartfone(frontRoot);
//            } else if (str == store.products[1]){
//                createVegetable(frontRoot);
//            } else createWater(frontRoot);


        });
    }

    public void newProductChoiceBox (Pane frontRoot) {

        frontRoot.getChildren().clear();
        Text text1 = new Text("Выберите категорию");
        text1.setTranslateX(30);
        text1.setTranslateY(30);

//        String [] arr = store.products;
        String [] arr = new String[]{"Smartfone", "Vegetables", "Water"};
                ObservableList<String> products = FXCollections.observableArrayList(arr);
        ChoiceBox<String> productChoiceBox = new ChoiceBox<String>(products);
//        productChoiceBox.setValue(store.products [0]); // значение по умолчанию
        productChoiceBox.setTooltip(new Tooltip("Select new the category")); // выпадающее окно при наведении
        productChoiceBox.setTranslateX(70);
        productChoiceBox.setTranslateY(150);

        frontRoot.getChildren().addAll(productChoiceBox, text1);

        productChoiceBox.setOnAction(event -> {
            String str = productChoiceBox.getValue();
            if (str == store.products[0]){
                createSmartfone(frontRoot);
            } else if (str == store.products[1]){
                createVegetable(frontRoot);
            } else createWater(frontRoot);

        });
    }

   public void createSmartfone(Pane frontRoot){
       // ввод данных в техтфилды для создания объекта смартфон
       windowForms. windowFormsSetup (frontRoot);
       windowForms.createSmartfoneForm(frontRoot);

       // По нажатию кнопки Сохранить
       // считываем даннык из формы и создаем объкт Смарфон
           windowForms.buttonSave.setOnAction(event -> {
           String name =  windowForms.tfName.getText();
           int amount = Integer.valueOf(windowForms.tfAmount.getText());
           String description = windowForms.tfDescription.getText();
           double price = Double.valueOf(windowForms.tfPrice.getText());

           Smartfone smartfone = new Smartfone(idCeeper.generateSmarfoneId(), name, amount, description,price);
           store.addSmartfoneToArray(smartfone);
           frontRoot.getChildren().clear();
           Text text1 = new Text(smartfone.toString() + " \n   успешно добавлен");
           text1.setTranslateX(30);
           text1.setTranslateY(30);
           frontRoot.getChildren().addAll(text1);

           windowForms.twoButtons (frontRoot); // Вызываем кнопки Добавить товар и Выбрать товар

       });

   }

    public void createVegetable(Pane frontRoot){
        // ввод данных в техтфилды для создания объекта Овощи
        windowForms. windowFormsSetup (frontRoot);
        windowForms.createVegetableForm(frontRoot);

        // Считываем даннык из формы и создаем объкт Овощ

        windowForms.buttonSave.setOnAction(event -> {
            String name =  windowForms.tfName.getText();
            int amount = Integer.valueOf(windowForms.tfAmount.getText());
            String description = windowForms.tfDescription.getText();
            double price = Double.valueOf(windowForms.tfPrice.getText());
            int shelfLife = Integer.valueOf(windowForms.tfShelfLife.getText());

            Vegetable vegetable = new Vegetable(idCeeper.generateSmarfoneId(), name, amount, description,price, shelfLife);
            store.addVegetableToArray(vegetable);
            // Оповещение об удачном добавлении товара
            frontRoot.getChildren().clear();
            Text text1 = new Text(vegetable.toString() + " \n   успешно добавлен");
            text1.setTranslateX(30);
            text1.setTranslateY(30);
            frontRoot.getChildren().addAll(text1);

            windowForms.twoButtons (frontRoot);// Вызываем кнопки Добавить товар и Выбрать товар

        });

    }

    public void createWater(Pane frontRoot){
        // ввод данных в техтфилды для создания объекта вода
        windowForms. windowFormsSetup (frontRoot);
        windowForms.createVegetableForm(frontRoot);

        // Считываем даннык из формы и создаем объкт Вода

        windowForms.buttonSave.setOnAction(event -> {
        String name =  windowForms.tfName.getText();
        int amount = Integer.valueOf(windowForms.tfAmount.getText());
        String description = windowForms.tfDescription.getText();
        double price = Double.valueOf(windowForms.tfPrice.getText());

        Water water = new Water(idCeeper.generateSmarfoneId(), name, amount, description,price);
        store.addWaterToArray(water);
        frontRoot.getChildren().clear();
        Text text1 = new Text(water.toString() + " \n   успешно добавлен");
        text1.setTranslateX(30);
        text1.setTranslateY(30);
        frontRoot.getChildren().addAll(text1);

        windowForms.twoButtons (frontRoot);// Вызываем кнопки Добавить товар и Выбрать товар

    });
    }

}
