package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public Button sendMassage;
    @FXML
    public TextField massage;
    @FXML
    public TextArea dialogue;

    public void clickSendMassage(ActionEvent actionEvent) {
        dialogue.appendText(massage.getText()+"\n");
        massage.clear();
        massage.requestFocus();
    }

    public void clickClearDialogue(ActionEvent actionEvent) {
        dialogue.clear();
    }
}
