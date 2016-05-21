package org.flamie.test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class Controller {

    private Font font = Font.loadFont(Main.class.getResource("fonts/Roboto-Black.ttf").toExternalForm(), 30);

    @FXML
    private Button button;

    @FXML
    public void onClickMethod() {
        button.setFont(font);
        button.setText("Ty peedor");
    }

}
