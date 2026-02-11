package com.senai.sistemajavafx.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;
import javafx.scene.Node;

public class HomeController {

    @FXML
    private BorderPane root;

    @FXML
    public void initialize() {
        // Removido para evitar erro de recursão e "Location is required"
    }


    private void carregarTela(String fxml) {
        try {
            // O "/" no início busca na raiz de resources, evitando duplicação de pastas
            Node tela = FXMLLoader.load(getClass().getResource("/fxml/" + fxml));
            if (root != null) {
                root.setCenter(tela);
            }
        } catch (Exception e) {
            System.err.println("Erro ao carregar: /fxml/" + fxml);
            e.printStackTrace();
        }
    }
}