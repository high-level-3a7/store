/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Services.ServicesProduit;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import models.produit;
import store.DataSource;

/**
 * FXML Controller class
 *
 * @author user
 */
public class RechercheController implements Initializable {

    @FXML
    private TableView<produit> table;
    @FXML
    private TableColumn<?, ?> idpr;
    @FXML
    private TableColumn<?, ?> nom;
    @FXML
    private TableColumn<?, ?> prix;
    @FXML
    private TableColumn<?, ?> disponibilite;
    @FXML
    private TextField tfrecherche;
    @FXML
    private Button recherche;
    ObservableList<produit> list = FXCollections.observableArrayList();
    /**
     * Initializes the controller class.
     */
  /**
 * FXML Controller class
 *
 * @author Alaa
 */

  

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   

    @FXML
    private void recherche(MouseEvent event) {
        
           Connection cnx = DataSource.getInstance().getCnx();
        list.clear();
        String requete = "select * from produit where  nom LIKE '%" + tfrecherche.getText() + "%' or prix LIKE '%" + tfrecherche.getText() + "%' or disponibilite LIKE '%" + tfrecherche.getText() + "%'or idpr LIKE '%" + tfrecherche.getText() + "%'";

        try {
            Statement stm = cnx.createStatement();
            ResultSet rst = stm.executeQuery(requete);
            while (rst.next()) {
                  list.add(new produit(rst.getInt(1), rst.getString(2), rst.getFloat(3), rst.getString(4)));
            }
        } catch (SQLException ex) {
            System.out.println("aucun produit disponible!");
        }
        ServicesProduit sp = new ServicesProduit();
        tfrecherche.getText();
        idpr.setCellValueFactory(new PropertyValueFactory<>("idpr"));
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prix.setCellValueFactory(new PropertyValueFactory<>("prix"));
        disponibilite.setCellValueFactory(new PropertyValueFactory<>("disponibilite"));
        table.setItems(list);
    
    }
    
}
