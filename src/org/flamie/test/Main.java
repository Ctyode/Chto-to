package org.flamie.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.getStylesheets().add(getClass().getResource("css/style.css").toExternalForm());
        Scene scene = new Scene(root, 1366, 768, Color.BEIGE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Inna");
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
