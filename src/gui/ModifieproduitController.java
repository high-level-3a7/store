/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Services.ServicesProduit;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.IOException;
import static java.lang.Integer.parseInt;
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
public class ModifieproduitController implements Initializable {

    @FXML
    private TextField nom;
    @FXML
    private TextField prix;
    @FXML
    private TextField disponibilite;
    @FXML
    private TextField idpr;
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
    private void modifier(ActionEvent event) throws IOException {
           ServicesProduit sp = new ServicesProduit();
        sp.modifier(new produit(parseInt(idpr.getText()),nom.getText(),Float.parseFloat(prix.getText()), disponibilite.getText()));
    JOptionPane.showMessageDialog(null,"produit modifié");
     
    
    }
    
}
