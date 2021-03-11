/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Services.ServicesProduit;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import models.produit;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AjoutproduitController implements Initializable {

    @FXML
    private TextField Nom;
    @FXML
    private TextField Prix;
    @FXML
    private TextField Disponibilite;
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
    private void ajouter(ActionEvent event) throws IOException {
         ServicesProduit sp = new ServicesProduit();
        sp.ajouter(new produit(Nom.getText(),Float.parseFloat(Prix.getText()), Disponibilite.getText()));
        JOptionPane.showMessageDialog(null,"produit ajouté");
        

    }
    
    
}
