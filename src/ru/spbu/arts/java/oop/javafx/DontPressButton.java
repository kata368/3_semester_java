package ru.spbu.arts.java.oop.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class DontPressButton extends Application {
    private Button dont1;
    private Button dont2;
    private Button dont3;
    private Button dont4;
    private VBox screen;
    private Image cat;
    private ImageView forCat;

    @Override
    public void start(Stage stage) throws FileNotFoundException {

        stage.setTitle("Не трогай кнопку!");
        VBox mom = initInterface();
        initInteraction();
        stage.setScene(new Scene(mom));
        stage.show();
    }

    private VBox initInterface() throws FileNotFoundException {
        dont1 = new Button("Не нажимайте эту кнопку, пожалуйста!");
        dont2 = new Button("Я же попросила вас не нажимать...");
        dont3 = new Button("Чего вы добтваетесь?");
        dont4 = new Button("Вот вообще не смешно...");
        screen = new VBox(dont1);
        cat = new Image(new FileInputStream("src/ru/spbu/arts/java/oop/javafx/2019-05-17_17-25-12_475875.jpg"));
        forCat = new ImageView(cat);

        forCat.setFitHeight(500);
        forCat.setFitWidth(700);

        screen.setPrefSize(700,500);
        screen.setAlignment(Pos.CENTER);

        return screen;
    }

    private void initInteraction(){
        dont1.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            screen.getChildren().removeAll(dont1);
            screen.getChildren().add(dont2);
        });

        dont2.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            screen.getChildren().removeAll(dont2);
            screen.getChildren().add(dont3);
        });

        dont3.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            screen.getChildren().removeAll(dont3);
            screen.getChildren().add(dont4);
        });

        dont4.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            screen.getChildren().removeAll(dont4);
            screen.getChildren().add(forCat);
        });
    }
}
