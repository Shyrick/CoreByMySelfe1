package Lesson5_2.L52_practice;

import Lesson5_2.L52_practice.Products.Smartfone;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class WindowForms extends WindowStore {

    Text text1, text2, text3, text4, text5, text6;
    TextField tfName, tfAmount, tfDescription, tfPrice, shelfLife;
    Button buttonSave;

    public WindowForms() {
    }

    public void windowFormsSetup (Pane frontRoot){

        frontRoot.getChildren().clear();

        this.text2 = new Text("Наименование");
        text2.setTranslateX(50);
        text2.setTranslateY(100);
        this.tfName = new TextField();
        tfName.setTranslateX(50);
        tfName.setTranslateY(120);

        this.text3 = new Text("Количество");
        text3.setTranslateX(250);
        text3.setTranslateY(100);
        this.tfAmount = new TextField();
        tfAmount.setTranslateX(250);
        tfAmount.setTranslateY(120);

        this.text4 = new Text("Описание");
        text4.setTranslateX(50);
        text4.setTranslateY(200);
        this.tfDescription = new TextField();
        tfDescription.setTranslateX(50);
        tfDescription.setTranslateY(220);

        this.text5 = new Text("Цена");
        text5.setTranslateX(250);
        text5.setTranslateY(200);
        this.tfPrice = new TextField();
        tfPrice.setTranslateX(250);
        tfPrice.setTranslateY(220);

        this.buttonSave = new Button("Сохранить");
        buttonSave.setTranslateX(50);
        buttonSave.setTranslateY(300);

    }


    public void createSmartfoneForm(Pane frontRoot) {

        this.text1 = new Text("Новый товар в категорию Смартфон");
        text1.setTranslateX(30);
        text1.setTranslateY(30);

        frontRoot.getChildren().addAll(text1, text2, text3, text4, text5,
                tfAmount, tfDescription, tfName, tfPrice, buttonSave);


    }

    public void createVegetableForm(Pane frontRoot) {

        text1 = new Text("Новый товар в категорию Овощи");
        text1.setTranslateX(30);
        text1.setTranslateY(30);

        frontRoot.getChildren().addAll(text1, text2, text3, text4, text5,
                tfAmount, tfDescription, tfName, tfPrice, buttonSave);

        String name =  tfName.getText();
        int amount = Integer.valueOf(tfAmount.getText());
        String description = tfDescription.getText();
        double price = Double.valueOf(tfPrice.getText());

        Smartfone smartfone = new Smartfone(idCeeper.generateVegetableId(), name, amount, description,price);
        store.smartfones[store.smartfones.length] = smartfone;

    }
}