package view.login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class login implements Initializable{
    @FXML
    private Label cnx;
    @FXML
    private Label pseudoLb;
    @FXML
    private Label pwdLb;
    @FXML
    private TextField pseudo;
    @FXML
    private TextField pwd;
    @FXML
    private Button logIn;    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }
      
    
}
