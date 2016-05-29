package org.flamie.test;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class ButtonController implements Initializable {

    private Font font = Font.loadFont(Main.class.getResource("fonts/Roboto-Light.ttf").toExternalForm(), 18);

    @FXML
    private Button button;

    @FXML
    public void onClickMethod() {
        button.setText("Ty peedor");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button.setFont(font);
        button.setText("Zdravstvuite!");
    }
}
