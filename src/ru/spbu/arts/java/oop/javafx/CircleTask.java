package ru.spbu.arts.java.oop.javafx;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;


public class CircleTask extends Application {

    GridPane screen = new GridPane();
    Pane right = new Pane();
    GridPane left = new GridPane();
    Circle circle = new Circle();
    Label labelForRadius= new Label("Radius");
    Slider forRadius = new Slider(0,100,5);
    Label forCircleColor = new Label("Colour of circle");
    Label forBackgroundColor = new Label("Colour of background");
    ColorPicker circleColor = new ColorPicker(Color.MAROON);
    ColorPicker backgroundColor = new ColorPicker(Color.web("#fff176"));




    public void start (Stage stage){
        stage.setTitle("Task with circle");
        Parent mother =  initInterface();
        stage.setScene(new Scene(mother));
        initInteraction();

        stage.show();
    }

    private Parent initInterface(){
        left.setStyle("-fx-background-color: #acb45c");
        screen.setStyle("-fx-background-color: green");

        screen.add(left, 0,0);
        screen.add(right, 1,0);


        ColumnConstraints c1 = new ColumnConstraints();
        c1.setPrefWidth(250);
        ColumnConstraints c2 = new ColumnConstraints();
        c2.setHgrow(Priority.ALWAYS);

        screen.getColumnConstraints().addAll(c1, c2);

        RowConstraints r1 = new RowConstraints();
        r1.setVgrow(Priority.ALWAYS);
        RowConstraints r2 = new RowConstraints();
        r2.setVgrow(Priority.ALWAYS);

        screen.getRowConstraints().addAll(r1, r2);

        r1.setPercentHeight(100);
        r2.setPrefHeight(100);


        Group group = new Group(circle);
        right.getChildren().add(group);

        left.add(labelForRadius, 0,0);
        left.add(forRadius,0,1);
        left.add(forCircleColor,0,2);
        left.add(circleColor,0,3);
        left.add(forBackgroundColor,0,4);
        left.add(backgroundColor,0,5);

        labelForRadius.setStyle("-fx-text-fill: white");
        labelForRadius.setFont(Font.font("Comic Sans MC", FontWeight.BOLD, 15));
        forBackgroundColor.setStyle("-fx-text-fill: white");
        forBackgroundColor.setFont(Font.font("Comic Sans MC", FontWeight.BOLD, 15));
        forCircleColor.setStyle("-fx-text-fill: white");
        forCircleColor.setFont(Font.font("Comic Sans MC", FontWeight.BOLD, 15));

        return screen;
    }

    private void initInteraction(){
        circle.radiusProperty().bind(forRadius.valueProperty());
        circle.centerYProperty().bind(right.heightProperty().divide(2));
        circle.centerXProperty().bind(right.widthProperty().divide(2));


        circle.fillProperty().bind(circleColor.valueProperty());

        right.backgroundProperty().bind(Bindings.createObjectBinding(()-> {
            BackgroundFill fill = new BackgroundFill(backgroundColor.getValue(), CornerRadii.EMPTY, Insets.EMPTY );
            return new Background(fill);
        }, backgroundColor.valueProperty()));


    }

    };


