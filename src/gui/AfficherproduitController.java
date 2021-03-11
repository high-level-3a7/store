
package gui;

import models.produit;
import Services.ServicesProduit;
import store.DataSource;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AfficherproduitController implements Initializable {

    @FXML
    private TableView<produit> table;
    @FXML
    private TableColumn<produit, Integer> idpr;
    @FXML
    private TableColumn<produit, String> nom;
    @FXML
    private TableColumn<produit, Float> prix;
    @FXML
    private TableColumn<produit, String> disponibilite;
    @FXML
    private Button afficher;
       ObservableList<produit> list = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
           Connection cnx = DataSource.getInstance().getCnx();
        try {
            String requete = "SELECT * FROM produit";
            PreparedStatement pst = cnx.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new produit(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4)));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        ServicesProduit sp = new Services.ServicesProduit();
        idpr.setCellValueFactory(new PropertyValueFactory<>("idpr"));
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prix.setCellValueFactory(new PropertyValueFactory<>("prix"));
        disponibilite.setCellValueFactory(new PropertyValueFactory<>("disponibilite"));
        table.setItems(list);
        
    }    
}