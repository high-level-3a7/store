/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import models.precommande;

import store.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/**
 *
 * @author user
 */
public class ServicesPrecommande implements IService<precommande> {
    Connection cnx = DataSource.getInstance().getCnx();
     @Override
     public void ajouter(precommande t) {
         try {
            String requete = "INSERT INTO precommande (idpr,date) VALUES (?,?)";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1, t.getIdpr());
            pst.setString(2, t.getDate());
             
            pst.executeUpdate();
            System.out.println("Precommande validée !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
}

     @Override
    public void supprimer(precommande t) {
          try {
            String requete = "DELETE FROM precommande WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1, t.getId());
            pst.executeUpdate();
            System.out.println("Precommande supprimée!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
     
 
    @Override
    public void modifier(precommande t)  {
        try{
        Statement stm = cnx.createStatement();
        String query = "UPDATE precommande SET  idpr= '"+t.getIdpr()+"', date= '"+t.getDate()+"' WHERE id='"+t.getId()+"'";
        stm.executeUpdate(query);
        System.out.println("precommande modifiée !");
    } catch (SQLException ex) {
           Logger.getLogger(ServicesPrecommande.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
        @Override
    public List<precommande> afficher() {
          List<precommande> list = new ArrayList<>();

        try {
            String requete = "SELECT * FROM precommande";
            PreparedStatement pst = cnx.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new precommande(rs.getInt(1),rs.getInt(2), rs.getString(3)));
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return list;
    }
  
    
 
    
    public precommande getId(int id) throws SQLException {
        precommande t = null;
        String req = "SELECT * FROM precommande WHERE id= '" + id + "'";
        Statement stm = cnx.createStatement();
        ResultSet rs = stm.executeQuery(req);
        while (rs.next()) {
            t= new precommande(rs.getInt("idpr"), rs.getString("date"));
        }
        return t;  
    }

 

   
   
    /**
     *
     * @return
     */
    public List<precommande> readAllprecommandeSortedByDate() {

        List<precommande> t = new ArrayList<>();
        try {
            Statement stm= cnx.createStatement();
            ResultSet rs = stm.executeQuery("select id,idpr from precommande order by Date ");
            while (rs.next()) {
                int id = rs.getInt("id");
                int idpr = rs.getInt("idpr");
                
                
                
                precommande prr = new precommande(id,idpr);
                t.add(prr);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return t;
    }
  
}
