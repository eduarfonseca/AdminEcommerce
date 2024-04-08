package com.example.adminecommerce;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();

        Text lbl1 = new Text("User");
        Text lbl2 = new Text("Password");
        TextField text1 = new TextField();
        TextField text2 = new TextField();
        Button btn1 = new Button("Submit");
        Button btn2 = new Button("Clear");
        GridPane gridPane = new GridPane();

        gridPane.setMinSize(400,200);
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(lbl1,0,0);
        gridPane.add(text1,1,0);
        gridPane.add(lbl2,0,1);
        gridPane.add(text2,1,1);
        gridPane.add(btn1,0,2);
        gridPane.add(btn2,1,2);

        btn1.setStyle("-fx-background-color: blue; -fx-text-fill:white;");
        btn2.setStyle("-fx-background-color: blue; -fx-text-fill:white;");
        text1.setStyle("-fx-font:normal bold 20px 'serif'");
        text2.setStyle("-fx-font:normal bold 20px 'serif'");

        Scene scene = new Scene(gridPane);
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}