/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import models.produit;

/**
 *
 * @author user
 */
public class MainGUI extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
   /* FXMLLoader  loader= new FXMLLoader(getClass().getResource("../gui/afficherpecommande.fxml"));
     Parent root = loader.load();
     Scene scene = new Scene(root);
     primaryStage.setTitle("afficherprecommande");
     primaryStage.setScene(scene);
     primaryStage.show();*/
     
     
     /* FXMLLoader loader1 = new FXMLLoader(getClass().getResource("../gui/ajoutproduit.fxml"));
       Parent root = loader1.load();
       Scene scene = new Scene(root);
       
       primaryStage.setTitle("ajoutproduit");
       primaryStage.setScene(scene);
       primaryStage.show();*/
      
         
     /* FXMLLoader loader1 = new FXMLLoader(getClass().getResource("../gui/modifieproduit.fxml"));
       Parent root = loader1.load();
       Scene scene = new Scene(root);
       
       primaryStage.setTitle("modifierproduit");
       primaryStage.setScene(scene);
       primaryStage.show();*/
          
            
     /* FXMLLoader loader1 = new FXMLLoader(getClass().getResource("../gui/supprimerproduit.fxml"));
       Parent root = loader1.load();
       Scene scene = new Scene(root);
       
       primaryStage.setTitle("supprimerproduit");
       primaryStage.setScene(scene);
       primaryStage.show();*/
              
                 
     /* FXMLLoader loader1 = new FXMLLoader(getClass().getResource("../gui/afficherproduit.fxml"));
       Parent root = loader1.load();
       Scene scene = new Scene(root);
       
       primaryStage.setTitle("afficheproduit");
       primaryStage.setScene(scene);
       primaryStage.show();*/
                  
                     
     /*  FXMLLoader loader1 = new FXMLLoader(getClass().getResource("../gui/ajoutprecommande.fxml"));
       Parent root = loader1.load();
       Scene scene = new Scene(root);
       
       primaryStage.setTitle("ajoutprecommande");
       primaryStage.setScene(scene);
       primaryStage.show();*/
                      
                        
     /*  FXMLLoader loader1 = new FXMLLoader(getClass().getResource("../gui/modifierprecommande.fxml"));
       Parent root = loader1.load();
       Scene scene = new Scene(root);
       
       primaryStage.setTitle("modifierprecommande");
       primaryStage.setScene(scene);
       primaryStage.show();*/
              
                            
     /*     FXMLLoader loader1 = new FXMLLoader(getClass().getResource("../gui/supprimerprecommande.fxml"));
       Parent root = loader1.load();
       Scene scene = new Scene(root);
       
       primaryStage.setTitle("supprimerprecommande");
       primaryStage.setScene(scene);
       primaryStage.show(); */
              
              
      
    /* FXMLLoader loader1 = new FXMLLoader(getClass().getResource("../gui/recherche.fxml"));
       Parent root = loader1.load();
       Scene scene = new Scene(root);
       
       primaryStage.setTitle("recherhce");
       primaryStage.setScene(scene);
       primaryStage.show(); 
              */
 /* FXMLLoader loader1 = new FXMLLoader(getClass().getResource("../gui/homeprod.fxml"));
       Parent root = loader1.load();
       Scene scene = new Scene(root);
       
       primaryStage.setTitle("homeprod");
       primaryStage.setScene(scene);
       primaryStage.show(); */
      
      FXMLLoader loader1= new FXMLLoader(getClass().getResource("../gui/homeprec.fxml"));
       Parent root = loader1.load();
       Scene scene = new Scene(root);
       
       primaryStage.setTitle("homeprec");
       primaryStage.setScene(scene);
       primaryStage.show(); 
       
       
       
       
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
