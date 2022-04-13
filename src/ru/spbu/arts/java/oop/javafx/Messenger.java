package ru.spbu.arts.java.oop.javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Messenger extends Application {

    ObservableList<String> names = FXCollections.observableArrayList("Julia", "Ian", "Sue", "Matthew", "Hannah", "Stephan", "Denise");

    private TextArea messages;
    private TextField textInput;
    private Button send;
    private Label contact;
    private ListView<String> contacts;


    private HBox fieldAndButton;
    private VBox firstColumn;
    private VBox secondColumn;
    private HBox messenger;

    //@Override
    public void start(Stage stage){
        stage.setTitle("Решение с VBox Hbox");
        HBox parent = initInterface();
        initInteraction();
        stage.setScene(new Scene(parent));
        stage.show();
    }

    private HBox initInterface(){

        messages = new TextArea();
        textInput = new TextField();
        send = new Button("Отправить");
        contact = new Label("Контакты");
        contacts = new ListView<>(names);


        fieldAndButton = new HBox(textInput, send);
        firstColumn = new VBox(messages, fieldAndButton);
        secondColumn = new VBox(contact,contacts);
        messenger = new HBox(firstColumn,secondColumn);

        //настройки по условию задачи
        fieldAndButton.setPrefHeight(150);
        contact.setPrefHeight(50);
        secondColumn.setPrefWidth(200);
        textInput.setPrefHeight(120);
        send.setPrefSize(100,35);
        HBox.setHgrow(textInput, Priority.ALWAYS);
        VBox.setVgrow(messages, Priority.ALWAYS);

        contact.maxWidth(2000);
        contact.setPrefWidth(200);
        contact.setAlignment(Pos.CENTER);
        contact.setFont(new Font(18));

        //playing with style
        messenger.setStyle("-fx-background-color:#43849a");
        send.setStyle("-fx-text-fill: white; -fx-background-color:#A8BDE9");
        contact.setStyle("-fx-text-fill: white");


        return messenger;
    }

    private void initInteraction(){
        //кнопки уладаления/записывания в контакты
        Button addBtn = new Button("Добавляем!");
        Button deleteBtn = new Button("Его/её удаляем");
        TextField textField = new TextField();

        HBox addingDeleting = new HBox(addBtn,deleteBtn);
        VBox buttonPane = new VBox(textField, addingDeleting);
        secondColumn.getChildren().add(buttonPane);

        addBtn.setOnAction(event -> {names.add(textField.getText());
                        textField.clear();
                });
        deleteBtn.setOnAction(event -> names.remove(textField.getText()));
        deleteBtn.setOnAction(event -> names.remove(contacts.getSelectionModel().getSelectedItem()));

        // 3 task
        messages.setEditable(false);
        send.setOnAction(event -> {messages.appendText(textInput.getText()+"\n");
            textInput.clear();
        });

    }


}
