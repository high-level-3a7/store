/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Services.ServicesPrecommande;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.precommande;
import store.DataSource;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AfficherpecommandeController implements Initializable {

    @FXML
    private TableView<precommande> table;
    @FXML
    private TableColumn<?, ?> id;
    @FXML
    private TableColumn<?, ?> idp;
    @FXML
    private TableColumn<?, ?> date;
    @FXML
    private Button afficher;
    ObservableList<precommande> list = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void affiche(ActionEvent event) {
         Connection cnx = DataSource.getInstance().getCnx();
        try {
            String requete = "SELECT * FROM precommande";
            PreparedStatement pst = cnx.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new precommande(rs.getInt(1), rs.getInt(2),  rs.getString(3)));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        ServicesPrecommande spr = new Services.ServicesPrecommande();
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        idp.setCellValueFactory(new PropertyValueFactory<>("idpr"));
        date.setCellValueFactory(new PropertyValueFactory<>("date"));
       
        table.setItems(list);
        
    }
    }
    

