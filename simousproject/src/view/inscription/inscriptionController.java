package view.inscription;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class inscriptionController implements Initializable {
    
    @FXML
    private Label inscriptionLab;
    @FXML
    private Label nomLab;
    @FXML
    private Label pseudoLab;
    @FXML
    private Label pwdLab;
    @FXML
    private Label confirmPwdLab;
    @FXML
    private Label genderLab;
    @FXML
    private TextField nom;
    @FXML
    private TextField pseudo;
    @FXML
    private TextField pwd;
    @FXML
    private TextField confirmPwd;
    @FXML
    private RadioButton homme;
    @FXML
    private RadioButton femme;
    @FXML
    private Button inscription;
    

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }
    
}
