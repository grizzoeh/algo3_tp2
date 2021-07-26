package edu.fiuba.algo3.vistas;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EnviarCantJugadoresEventHandler implements EventHandler<ActionEvent> {
    private VBox vbox;
    private ComboBox dropdown;

    public EnviarCantJugadoresEventHandler(VBox VBoxrecibida, ComboBox dropdownRecibido) {

        vbox = VBoxrecibida;
        dropdown = dropdownRecibido;

    }

    @Override
    public void handle(ActionEvent actionEvent) {

        String numero = (String) dropdown.getValue();
        Integer numeroInteger = Integer.parseInt(numero);

        vbox.getChildren().removeAll(vbox.getChildren());

        for (Integer i = 0; i<numeroInteger; i++){
            TextField textFieldAux = new TextField();
            textFieldAux.setPromptText("Nombre Jugador "+ Integer.toString(i+1));
            vbox.getChildren().add(textFieldAux);

        }



    }
}