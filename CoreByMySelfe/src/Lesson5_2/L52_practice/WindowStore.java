package Lesson5_2.L52_practice;

import Lesson5_2.L52_practice.Products.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class WindowStore {

    IdCeeper idCeeper;
    Store store;
    WindowForms windowForms;


//    Text text1, text2, text3, text4, text5, text6, text7;
//    TextField tfName, tfAmount, tfDescription, tfPrice, tfShelfLife, tfFindId;
//    Button buttonSave, buttonChoice, buttonBuy, buttonToMain;
//    ChoiceBox<String> productChoiceBox;



    public WindowStore(IdCeeper idCeeper, Store store,  WindowForms windowForms) {
        this.idCeeper = idCeeper;
        this.store = store;
        this.windowForms = windowForms;
    }





//    public void windowTextSetup (Pane frontRoot) {
//
//        text7 = new Text("Введите id нужного товара");
//        text7.setTranslateX(50);
//        text7.setTranslateY(500);
//        this.tfFindId = new TextField();
//        tfFindId.setTranslateX(50);
//        tfFindId.setTranslateY(520);
//    }

    


    public void helloyMenu (Pane frontRoot){

        windowForms.helloyMenuSetup(frontRoot);

        windowForms.toTheShopButton.setOnAction(event -> {
           productChoiceBox(frontRoot); // выбор категории товара
        });

        windowForms.addProductButton.setOnAction(event -> {
            newProductChoiceBox (frontRoot);
        });
    }

    public void productChoiceBox(Pane frontRoot) {

        windowForms.productChoiceBoxSetup(frontRoot);
        toMainButton(frontRoot);                        // Кнопка "на главную"

        windowForms.productChoiceBox.setOnAction(event -> {
            String str = windowForms.productChoiceBox.getValue();
            Product [] products = store.findCategoryArray(str);
            // Выводим список товаров выбранной категории в консоль
            store.showCategoryArray(products);

            // Вывдим поле и кнопу для выбора товара по id
//            frontRoot.getChildren().clear();
//            makeChoice(frontRoot, products);

        });
    }

    public void newProductChoiceBox (Pane frontRoot) {

        windowForms.productChoiceBoxSetup(frontRoot);
        toMainButton(frontRoot);                        // Кнопка "на главную"

        windowForms.productChoiceBox.setOnAction(event  -> {
            String str = windowForms.productChoiceBox.getValue();
            if (str == store.products[0]){
                createSmartfone(frontRoot);
            } else if (str == store.products[1]){
                createVegetable(frontRoot);
            } else createWater(frontRoot);
        });
    }

    public void createSmartfone(Pane frontRoot){
        // ввод данных в текстфилды для создания объекта смартфон
        windowForms.createSmartfoneForm(frontRoot);
        // По нажатию кнопки Сохранить
        // считываем даннык из формы и создаем объкт Смарфон
        windowForms.saveButton.setOnAction(event -> {
            String name =  windowForms.tfName.getText();
            int amount = Integer.valueOf(windowForms.tfAmount.getText());
            String description = windowForms.tfDescription.getText();
            double price = Double.valueOf(windowForms.tfPrice.getText());

            Smartfone smartfone = new Smartfone(idCeeper.generateSmartfoneId(), name, amount, description,price);
            store.addSmartfoneToArray(smartfone);
            frontRoot.getChildren().clear();
            Text text1 = new Text(smartfone.toString() + " \n   успешно добавлен");
            text1.setTranslateX(30);
            text1.setTranslateY(30);
            frontRoot.getChildren().addAll(text1);

            helloy2Menu(frontRoot); // Вызываем кнопки Добавить товар и Выбрать товар
        });

    }

    public void createVegetable(Pane frontRoot){
        // ввод данных в техтфилды для создания объекта Овощи
        windowForms.createVegetableForm(frontRoot);
        // Считываем даннык из формы и создаем объкт Овощ
        windowForms.saveButton.setOnAction(event -> {
            String name =  windowForms.tfName.getText();
            int amount = Integer.valueOf(windowForms.tfAmount.getText());
            String description = windowForms.tfDescription.getText();
            double price = Double.valueOf(windowForms.tfPrice.getText());
            int shelfLife = Integer.valueOf(windowForms.tfShelfLife.getText());

            Vegetable vegetable = new Vegetable(idCeeper.generateSmartfoneId(), name, amount, description,price, shelfLife);
            store.addVegetableToArray(vegetable);
            // Оповещение об удачном добавлении товара
            frontRoot.getChildren().clear();
            Text text1 = new Text(vegetable.toString() + " \n   успешно добавлен");
            text1.setTranslateX(30);
            text1.setTranslateY(30);
            frontRoot.getChildren().addAll(text1);

            helloy2Menu(frontRoot);

        });

    }

    public void createWater(Pane frontRoot){
        // ввод данных в техтфилды для создания объекта вода
        windowForms.createWaterForm(frontRoot);
        // Считываем даннык из формы и создаем объкт Вода
        windowForms.saveButton.setOnAction(event -> {
            String name =   windowForms.tfName.getText();
            int amount = Integer.valueOf( windowForms.tfAmount.getText());
            String description =  windowForms.tfDescription.getText();
            double price = Double.valueOf( windowForms.tfPrice.getText());

            Water water = new Water(idCeeper.generateSmartfoneId(), name, amount, description,price);
            store.addWaterToArray(water);
            frontRoot.getChildren().clear();
            Text text1 = new Text(water.toString() + " \n   успешно добавлен");
            text1.setTranslateX(30);
            text1.setTranslateY(30);
            frontRoot.getChildren().addAll(text1);

            helloy2Menu(frontRoot);// Вызываем кнопки Добавить товар и Выбрать товар

        });
    }

    public void makeChoice (Pane frontRoot, Product [] products){
////        windowFormsSetup (frontRoot);
//        frontRoot.getChildren().addAll(text6, tfFindId, buttonChoice);
//        buttonChoice.setOnAction(event -> {
//            int id = Integer.valueOf(tfFindId.getText());
//            curentProduct = store.findProductById(id, products);
//            frontRoot.getChildren().clear();
//            curentProduct.show();
//
//
//        });
    }

    // Метод выводит 2 кнопки: В магазин и Добавить товар
    public void helloy2Menu(Pane frontRoot){
        windowForms.addProductButtonSetup(frontRoot);
        windowForms.addProductButton.setOnAction(event1 ->  {
            newProductChoiceBox (frontRoot);
        });

        windowForms.toTheShopButtonSetup(frontRoot);
        windowForms.toTheShopButton.setOnAction(event -> {
            productChoiceBox(frontRoot); // выбор категории товара
        });
    }

    public void toMainButton(Pane frontRoot){
        windowForms.toMainButtonSetup(frontRoot);
        windowForms.toMainButton.setOnAction(event1 ->  {
            helloyMenu (frontRoot);
        });
    }

    public void buyButton (Pane frontRoot, Product [] products){
//        buttonBuy.setOnAction(event ->  {
//            store.byCurrentProduct( products, getCurentProduct() );
//        });

    }

}