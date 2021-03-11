/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Services.ServicesPrecommande;


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
public class ModifierprecommandeController implements Initializable {

    @FXML
    private TextField idpr;
    @FXML
    private TextField date;
    @FXML
    private TextField id;
    @FXML
    private Button modifier;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void modifier(ActionEvent event) {
           ServicesPrecommande spr = new ServicesPrecommande();
        spr.modifier(new precommande(parseInt(idpr.getText()), parseInt(id.getText()),date.getText()));
    JOptionPane.showMessageDialog(null,"precommande modifié");
     
    }
}