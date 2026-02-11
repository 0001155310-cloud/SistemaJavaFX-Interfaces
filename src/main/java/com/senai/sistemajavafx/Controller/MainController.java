package com.senai.sistemajavafx.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;

public class MainController {

    @FXML
    private BorderPane root;

    @FXML
    public void initialize() {
    }

    @FXML
    public void abrirNovaVenda() {
        carregarTela("NovaVenda.fxml");
    }

    @FXML
    public void abrirRelatorio() {
        carregarTela("RelatorioVendas.fxml");
    }

    @FXML
    public void abrirLogin() {
        carregarTela("Login.fxml");
    }

    @FXML
    public void abrirClientes() {
        carregarTela("CadastrarClientes.fxml");
    }

    @FXML
    public void abrirProdutos() {
        carregarTela("CadastrarProdutos.fxml");
    }
    @FXML
    public void abrirHome() {
        carregarTela("Home.fxml");
    }

    @FXML
    public void abrirAjuda() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sobre o Sistema");
        alert.setHeaderText("Informações do Sistema");
        alert.setContentText("Nome: Sistema de Reservas\nVersão: 1.0.0\nDesenvolvedor: Ryan Lucas Fernandes Pinheiro\nAno: 2026");
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