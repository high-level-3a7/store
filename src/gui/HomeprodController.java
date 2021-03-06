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
public class HomeprodController implements Initializable {

    @FXML
    private Button ajouter;
    @FXML
    private Button modifier;
    @FXML
    private Button supprimer;
    @FXML
    private Button afficher;
    @FXML
    private Button rechercher;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }   
          private void actionBoutton(javafx.event.ActionEvent mouseEvent) {
        if (mouseEvent.getSource() == modifier) {
            loadStage("/gui/modifieproduit.fxml");
        }
        else if(mouseEvent.getSource() == ajouter){
            loadStage("/gui/ajoutproduit.fxml");
        }
        else if(mouseEvent.getSource() == supprimer){
            loadStage("/gui/supprimerproduit.fxml");
        }
        else if(mouseEvent.getSource() == afficher){
            loadStage("/gui/afficherproduit.fxml");
    }
        else if(mouseEvent.getSource() == rechercher){
            loadStage("/gui/recherche.fxml");}}
    
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
    private void ajouter(MouseEvent event) {
        loadStage("/gui/ajoutproduit.fxml");
    }

    @FXML
    private void modifier(MouseEvent event) {
        loadStage("/gui/modifieproduit.fxml");
    }

    @FXML
    private void supprimer(MouseEvent event) {
           loadStage("/gui/supprimerproduit.fxml");
    }

    @FXML
    private void afficher(MouseEvent event) {
         loadStage("/gui/afficherproduit.fxml");
    }

    @FXML
    private void rechercher(MouseEvent event) {
        loadStage("/gui/recherche.fxml");
    }
    
}
