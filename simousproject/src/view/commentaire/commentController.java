package view.commentaire;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class commentController implements Initializable {
    @FXML
    private Label labComent;
    @FXML
    private Label labMerci1;
    @FXML
    private Label labMerci2;
    @FXML
    private TextArea commentaire;
    @FXML
    private Button envoyer;
    @FXML
    private Button retour;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }
        
}
