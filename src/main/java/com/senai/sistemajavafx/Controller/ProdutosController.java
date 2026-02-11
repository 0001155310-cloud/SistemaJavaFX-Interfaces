package com.senai.sistemajavafx.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

import java.util.Optional;

public class ProdutosController {

    @FXML
    public void initialize() {
    }



    @FXML
    private TextField nomeProduto;

    @FXML
    private TextField codigoProduto;

    @FXML
    private TextField precoProduto;

    @FXML
    private TextField estoqueProduto;

    @FXML
    private TextField fornecedorProduto;

    @FXML
    private void salvarProduto() {
        System.out.println("\nFunção ativa");

    }

    @FXML
    private void excluirProduto() {
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
            nomeProduto.setText(null);
            codigoProduto.setText(null);
            precoProduto.setText(null);
            estoqueProduto.setText(null);
            fornecedorProduto.setText(null);
        }

    }

}