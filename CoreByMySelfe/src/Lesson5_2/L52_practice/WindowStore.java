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

    IdCeeper idCeeper;
    Store store;

    Text text1, text2, text3, text4, text5, text6;
    TextField tfName, tfAmount, tfDescription, tfPrice, tfShelfLife;
    Button buttonSave;

    private static final int WIDTH = 800;
    private static final int HEIGTH = 700;
    private static final int MAX_WIDTH = 1400;
    private static final int MAX_HEIGTH = 800;
    private static final int MIN_WIDTH = 800;
    private static final int MIN_HEIGTH = 700;

    public WindowStore(IdCeeper idCeeper, Store store) {
        this.idCeeper = idCeeper;
        this.store = store;
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

    public void windowFormsSetup (Pane frontRoot){

        frontRoot.getChildren().clear();

        text2 = new Text("Наименование");
        text2.setTranslateX(50);
        text2.setTranslateY(100);
        this.tfName = new TextField();
        tfName.setTranslateX(50);
        tfName.setTranslateY(120);

        text3 = new Text("Количество");
        text3.setTranslateX(250);
        text3.setTranslateY(100);
        this.tfAmount = new TextField();
        tfAmount.setTranslateX(250);
        tfAmount.setTranslateY(120);

        text4 = new Text("Описание");
        text4.setTranslateX(50);
        text4.setTranslateY(200);
        this.tfDescription = new TextField();
        tfDescription.setTranslateX(50);
        tfDescription.setTranslateY(220);

        text5 = new Text("Цена");
        text5.setTranslateX(250);
        text5.setTranslateY(200);
        this.tfPrice = new TextField();
        tfPrice.setTranslateX(250);
        tfPrice.setTranslateY(220);

        text6 = new Text("Срок годности");
        text6.setTranslateX(50);
        text6.setTranslateY(300);
        this.tfShelfLife = new TextField();
        tfShelfLife.setTranslateX(50);
        tfShelfLife.setTranslateY(320);

        this.buttonSave = new Button("Сохранить");
        buttonSave.setTranslateX(50);
        buttonSave.setTranslateY(350);

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
//        productChoiceBox.setValue(store.products [0]); // значение по умолчанию
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
        text1.setTranslateX(70);
        text1.setTranslateY(120);

        String [] arr = store.products;
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

    public void createSmartfoneForm(Pane frontRoot) {

        text1 = new Text("Новый товар в категорию Смартфон");
        text1.setTranslateX(30);
        text1.setTranslateY(30);

        frontRoot.getChildren().addAll(text1, text2, text3, text4, text5,
                tfAmount, tfDescription, tfName, tfPrice, buttonSave);


    }

    public void createVegetableForm(Pane frontRoot) {

        text1 = new Text("Новый товар в категорию Овощи");
        text1.setTranslateX(30);
        text1.setTranslateY(30);

        frontRoot.getChildren().addAll(text1, text2, text3, text4, text5, text6,
                tfAmount, tfDescription, tfName, tfPrice, tfShelfLife, buttonSave);

    }

    public void createWaterForm(Pane frontRoot) {

        text1 = new Text("Новый товар в категорию Вода");
        text1.setTranslateX(30);
        text1.setTranslateY(30);

        frontRoot.getChildren().addAll(text1, text2, text3, text4, text5,
                tfAmount, tfDescription, tfName, tfPrice, buttonSave);


    }

    public void createSmartfone(Pane frontRoot){
        // ввод данных в текстфилды для создания объекта смартфон
        windowFormsSetup (frontRoot);
        createSmartfoneForm(frontRoot);

        // По нажатию кнопки Сохранить
        // считываем даннык из формы и создаем объкт Смарфон
        buttonSave.setOnAction(event -> {
            String name =  tfName.getText();
            int amount = Integer.valueOf(tfAmount.getText());
            String description = tfDescription.getText();
            double price = Double.valueOf(tfPrice.getText());

            Smartfone smartfone = new Smartfone(idCeeper.generateSmartfoneId(), name, amount, description,price);
            store.addSmartfoneToArray(smartfone);
            frontRoot.getChildren().clear();
            Text text1 = new Text(smartfone.toString() + " \n   успешно добавлен");
            text1.setTranslateX(30);
            text1.setTranslateY(30);
            frontRoot.getChildren().addAll(text1);

            twoButtons (frontRoot); // Вызываем кнопки Добавить товар и Выбрать товар

        });

    }

    public void createVegetable(Pane frontRoot){
        // ввод данных в техтфилды для создания объекта Овощи
        windowFormsSetup (frontRoot);
        createVegetableForm(frontRoot);

        // Считываем даннык из формы и создаем объкт Овощ

        buttonSave.setOnAction(event -> {
            String name =  tfName.getText();
            int amount = Integer.valueOf(tfAmount.getText());
            String description = tfDescription.getText();
            double price = Double.valueOf(tfPrice.getText());
            int shelfLife = Integer.valueOf(tfShelfLife.getText());

            Vegetable vegetable = new Vegetable(idCeeper.generateSmartfoneId(), name, amount, description,price, shelfLife);
            store.addVegetableToArray(vegetable);
            // Оповещение об удачном добавлении товара
            frontRoot.getChildren().clear();
            Text text1 = new Text(vegetable.toString() + " \n   успешно добавлен");
            text1.setTranslateX(30);
            text1.setTranslateY(30);
            frontRoot.getChildren().addAll(text1);

            twoButtons (frontRoot);// Вызываем кнопки Добавить товар и Выбрать товар

        });

    }

    public void createWater(Pane frontRoot){
        // ввод данных в техтфилды для создания объекта вода
        windowFormsSetup (frontRoot);
        createVegetableForm(frontRoot);

        // Считываем даннык из формы и создаем объкт Вода

        buttonSave.setOnAction(event -> {
            String name =  tfName.getText();
            int amount = Integer.valueOf(tfAmount.getText());
            String description = tfDescription.getText();
            double price = Double.valueOf(tfPrice.getText());

            Water water = new Water(idCeeper.generateSmartfoneId(), name, amount, description,price);
            store.addWaterToArray(water);
            frontRoot.getChildren().clear();
            Text text1 = new Text(water.toString() + " \n   успешно добавлен");
            text1.setTranslateX(30);
            text1.setTranslateY(30);
            frontRoot.getChildren().addAll(text1);

            twoButtons (frontRoot);// Вызываем кнопки Добавить товар и Выбрать товар

        });
    }

    // Метод выводит 2 кнопки Добавить товар и Выбрать товар
    public void twoButtons (Pane frontRoot){
        Button button1 = new Button("Добавить товар");
        button1.setTranslateX(50);
        button1.setTranslateY(100);
        button1.setOnAction(event1 ->  {
            newProductChoiceBox (frontRoot);
        });

        Button button2 = new Button("Выбрать товар");
        button2.setTranslateX(200);
        button2.setTranslateY(100);
        button2.setOnAction(event1 ->  {
            productChoiceBox (frontRoot);
        });

        frontRoot.getChildren().addAll(button1, button2);
    }

}