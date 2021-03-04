/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import models.produit;
import store.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author aissa
 */
public class ServicesProduit implements IService<produit> {

    Connection cnx = DataSource.getInstance().getCnx();

    @Override
    public void ajouter(produit p) {
         try {
            String requete = "INSERT INTO produit (nom,prix,disponibilite) VALUES (?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setString(1, p.getNom());
            pst.setFloat(2, p.getPrix());
             pst.setString(3, p.getDisponibilite());
            pst.executeUpdate();
            System.out.println("Produit ajoutée !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

   @Override
    public void supprimer(produit p) {
          try {
            String requete = "DELETE FROM produit WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1, p.getIdpr());
            pst.executeUpdate();
            System.out.println("Produit supprimé!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

 
    @Override
    public void modifier(produit p)  {
        try{
        Statement stm = cnx.createStatement();
        String query = "UPDATE produit SET  nom= '"+p.getNom()+"', prix= '"+p.getPrix()+"', disponibilite= '"+p.getDisponibilite()+"' WHERE idpr='"+p.getIdpr()+"'";
        stm.executeUpdate(query);
        System.out.println("produit modifiée !");
    } catch (SQLException ex) {
           Logger.getLogger(ServicesPrecommande.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public List<produit> afficher() {
          List<produit> list = new ArrayList<>();

        try {
            String requete = "SELECT * FROM produit";
            PreparedStatement pst = cnx.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new produit(rs.getInt(1), rs.getString(2), rs.getFloat(3),rs.getString(4)));
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return list;
    }
      public produit getIdpr(int idpr) throws SQLException {
        produit p = null;
        String req = "SELECT * FROM produit WHERE idpr= '" + idpr + "'";
        Statement stm = cnx.createStatement();
        ResultSet rs = stm.executeQuery(req);
        while (rs.next()) {
            p= new produit(rs.getString("nom"), rs.getFloat("prix"), rs.getString("disponibilite"));
        }
        return p;  
    }
   
    @Override
    public List<produit> readAllEmployeessSortedByPrix() {

        List<produit> p = new ArrayList<>();
        try {
            Statement stm= cnx.createStatement();
            ResultSet rs = stm.executeQuery("select idpr, nom ,disponibilite from produit order by Prix ");
            while (rs.next()) {
                int idpr = rs.getInt("idpr");
                String nom = rs.getString("nom");
                String disponibilite = rs.getString("disponibilite");
                
                
                
                produit pp = new produit(idpr,nom,disponibilite);
                p.add(pp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }
  
    }



