package com.senai.sistemajavafx.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

import java.util.Optional;

public class ClientesController {

    @FXML
    public void initialize() {
    }

    @FXML
    private TextField nomeCliente;

    @FXML
    private TextField cpfCliente;

    @FXML
    private TextField telCliente;

    @FXML
    private TextField emailCliente;

    @FXML
    private TextField enderecoCliente;

    @FXML
    private void salvarCliente() {
        System.out.println("\nFunção ativa");
    }

    @FXML
    private void excluirCliente() {
        System.out.println("\nFunção ativa");

    }

    @FXML
    private void voltarTela() {
        System.out.println("\nFunção ativa");

    }

    @FXML
    private void limparInformacoes() {

        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Confirmar Limpeza");
        alerta.setHeaderText("Deseja realmente limpar os campos?");
        alerta.setContentText("Todos os dados digitados serão perdidos.");

        Optional<ButtonType> resultado = alerta.showAndWait();
        if (resultado.isPresent() && resultado.get() == ButtonType.OK) {
            nomeCliente.setText(null);
            cpfCliente.setText(null);
            telCliente.setText(null);
            emailCliente.setText(null);
            emailCliente.setText(null);
            enderecoCliente.setText(null);
        }

    }
}