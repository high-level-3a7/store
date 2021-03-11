/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Services.ServicesPrecommande;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import models.precommande;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AjoutprecommandeController implements Initializable {

    @FXML
    private TextField idpr;
    @FXML
    private TextField date;
    @FXML
    private Button ajouter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouter(ActionEvent event) {
          ServicesPrecommande spr = new ServicesPrecommande();
        spr.ajouter(new precommande(parseInt(idpr.getText()),date.getText()));
        JOptionPane.showMessageDialog(null,"precommande ajouté");
    }
    
}
