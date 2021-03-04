/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author user
 */
public class precommande {
      private int id; 
    private int idpr;
    private String date;

    public precommande(int id, int idpr) {
        this.id = id;
        this.idpr = idpr;
    }
  

    public precommande(int id,int idpr, String date) {
        this.id = id;
        this.idpr = idpr;
        this.date = date;
        
        
    }

    public precommande(int idpr, String date) {
        this.idpr = idpr;
        this.date = date;
    }

    public int getIdpr() {
        return idpr;
    }

    public String getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public void setIdpr(int idpr) {
        this.idpr = idpr;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "precommande{" + "idpr=" + idpr + ", date=" + date + ", id=" + id + '}';
    }
    
    
    
    
    
    
}
