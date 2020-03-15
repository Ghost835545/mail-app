package com.mail.app.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.text.Text;

public class FxmlController {
    @FXML
    private Text actionTarget;
    @FXML
    private TextField textField;
    @FXML
    private Button button;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent actionEvent) {
        button.setTooltip(new Tooltip("sfdfsddsfdsf"));
    }
    @FXML
    protected void onMouseExited(ActionEvent actionEvent){
        button.setTooltip(new Tooltip("sfdfsddsfdsf"));
    }
}
