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
    public void ajouter(produit t) {
         try {
            String requete = "INSERT INTO produit (nom,prix,disponibilite) VALUES (?,?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setString(1, t.getNom());
            pst.setFloat(2, t.getPrix());
             pst.setString(3, t.getDisponibilite());
            pst.executeUpdate();
            System.out.println("Produit ajoutée !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

   @Override
    public void supprimer(produit t) {
          try {
            String requete = "DELETE FROM produit WHERE idpr=?";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1, t.getIdpr());
            pst.executeUpdate();
            System.out.println("Produit supprimé!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

 
    @Override
    public void modifier(produit t)  {
        try{
        Statement stm = cnx.createStatement();
        String query = "UPDATE produit SET  nom= '"+t.getNom()+"', prix= '"+t.getPrix()+"', disponibilite= '"+t.getDisponibilite()+"' WHERE idpr='"+t.getIdpr()+"'";
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
    /*  public produit getIdpr(int idpr) throws SQLException {
        produit p = null;
        String req = "SELECT * FROM produit WHERE idpr= '" + idpr + "'";
        Statement stm = cnx.createStatement();
        ResultSet rs = stm.executeQuery(req);
        while (rs.next()) {
            p= new produit(rs.getString("nom"), rs.getFloat("prix"), rs.getString("disponibilite"));
        }
        return p;  
    }*/
    public List<produit> Search(String charac) {
           String requete="select * from produit where idpr LIKE '%"+charac+"%'or nom LIKE '%"+charac+"%' or prix LIKE '%"+charac+"%' or disponibilite LIKE '%"+charac+"%" ;
           
           List<produit> produit = new ArrayList<>();
        try {
            Statement stm=cnx.createStatement();
            ResultSet rst=stm.executeQuery(requete);           
     while(rst.next()) 
    {       
        //System.out.println("Event : "+rst.getString("description")+"\tMedia :"+rst.getString("source")+"\tNombre de J'aime :"+rst.getInt("nbrlikes") );
 
            produit result = new produit();
            result.setIdpr(rst.getInt("idpr"));
            result.setNom(rst.getString("nom"));
            result.setPrix(rst.getFloat("prix"));
           result.setDisponibilite(rst.getString("disponibilite"));
            
            
         
            produit.add(result);
          
    }
        } catch (SQLException ex) {
            System.out.println("No produit Available !");
        } 
        return produit;   
    }

   
    
   
   
    /**
     *
     * @return
     */
    public List<produit> readAllproduitSortedByPrix() {

        List<produit> t = new ArrayList<>();
        try {
            Statement stm= cnx.createStatement();
            ResultSet rs = stm.executeQuery("select idpr, nom ,disponibilite from produit order by Prix ");
            while (rs.next()) {
                int idpr = rs.getInt("idpr");
                String nom = rs.getString("nom");
                String disponibilite = rs.getString("disponibilite");
                
                
                
                produit pp = new produit(idpr,nom,disponibilite);
                t.add(pp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }
  
    }



