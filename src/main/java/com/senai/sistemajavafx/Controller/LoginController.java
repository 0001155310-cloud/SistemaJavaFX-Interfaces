package com.senai.sistemajavafx.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class LoginController {

    @FXML
    private BorderPane root;

    @FXML private TextField emailUsuario;
    @FXML private PasswordField senhaUsuario;


    @FXML
    public void initialize() {
    }

    @FXML
    public void logar() {
        System.out.println("\nFunção ativa");
    }


    @FXML
    public void criarConta() {
        System.out.println("\nFunção ativa");
    }

        @FXML
    public void abrirEsqueciSenha() {
        String emailInserido = emailUsuario.getText();

        if (emailInserido == null || emailInserido.trim().isEmpty()) {
            Alert alertErro = new Alert(Alert.AlertType.WARNING);
            alertErro.setContentText("Por favor, digite seu e-mail antes de prosseguir...");
            alertErro.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Esqueci Minha Senha");
        alert.setHeaderText("Recuperação de Senha");
        alert.setContentText("Enviaremos um e-mail de recuperação de senha no endereço inserido. Certifique-se que o e-mail foi escrito corretamente. \n Endereço de e-mail: " + emailInserido);
        alert.showAndWait();
    }

    private void carregarTela(String fxml) {
        try {
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