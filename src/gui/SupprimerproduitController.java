/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Services.ServicesProduit;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import models.produit;

/**
 * FXML Controller class
 *
 * @author user
 */
public class SupprimerproduitController implements Initializable {

    @FXML
    private TextField idpr;
    @FXML
    private Button supprimer;
    @FXML
    private TextField nom;
    @FXML
    private TextField prix;
    @FXML
    private TextField disponibilite;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void supprimer(ActionEvent event) {
          ServicesProduit sp = new ServicesProduit();
        sp.supprimer(new produit(parseInt(idpr.getText()),nom.getText(),Float.parseFloat(prix.getText()), disponibilite.getText()));
    JOptionPane.showMessageDialog(null,"produit supprimé");
    }
    
}
