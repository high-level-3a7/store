/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class HomeprecController implements Initializable {

    @FXML
    private Button afficher;
    @FXML
    private Button supprimer;
    @FXML
    private Button modifier;
    @FXML
    private Button ajouter;

    /**
     * Initializes the controller class.
     */
    @Override
   public void initialize(URL url, ResourceBundle rb) {
    }   
          private void actionBoutton(javafx.event.ActionEvent mouseEvent) {
        if (mouseEvent.getSource() == modifier) {
            loadStage("/gui/modifierprecommande.fxml");
        }
        else if(mouseEvent.getSource() == ajouter){
            loadStage("/gui/ajoutprecommande.fxml");
        }
        else if(mouseEvent.getSource() == supprimer){
            loadStage("/gui/supprimerprecommande.fxml");
        }
        else if(mouseEvent.getSource() == afficher){
            loadStage("/gui/afficherprecommande.fxml");
    }
        }
    
    private void loadStage(String fxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();   
        } catch (IOException e) {
        }
    }
       

    @FXML
    private void afficher(MouseEvent event) {
            loadStage("/gui/afficherpecommande.fxml");
    }

    @FXML
    private void supprimer(MouseEvent event) {
         loadStage("/gui/supprimerprecommande.fxml");
    }

    @FXML
    private void modifier(MouseEvent event) {
         loadStage("/gui/modifierprecommande.fxml");
    }

    @FXML
    private void ajouter(MouseEvent event) {
         loadStage("/gui/ajoutprecommande.fxml");
    }
    
}
