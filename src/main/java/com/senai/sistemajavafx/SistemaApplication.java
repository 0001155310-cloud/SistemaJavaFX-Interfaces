package com.senai.sistemajavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SistemaApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SistemaApplication.class.getResource("/fxml/MainLayout.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 607, 430);
        stage.setTitle("Sistema - JavaFX");
        stage.setScene(scene);
        stage.show();
    }
}

