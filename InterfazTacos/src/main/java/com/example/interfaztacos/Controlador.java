package com.example.interfaztacos;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;

public class Controlador {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchTo1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Ventana1.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchTo2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Ventana2.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
