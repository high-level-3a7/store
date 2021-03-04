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
public class produit {
     private int idpr;
    private String nom;
    private float prix;
    private String disponibilite;

    public produit(int idpr, String nom, String disponibilite) {
        this.idpr = idpr;
        this.nom = nom;
        this.disponibilite = disponibilite;
    }

    public produit(int idpr, String nom, float prix, String disponibilite) {
        this.idpr = idpr;
        this.nom = nom;
        this.prix = prix;
        this.disponibilite = disponibilite;
    }

    public produit(String nom, float prix, String disponibilite) {
        this.nom = nom;
        this.prix = prix;
        this.disponibilite = disponibilite;
    }

    public int getIdpr() {
        return idpr;
    }

    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

    public String getDisponibilite() {
        return disponibilite;
    }

    public void setIdpr(int idpr) {
        this.idpr = idpr;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setDisponibilite(String disponibilite) {
        this.disponibilite = disponibilite;
    }

    @Override
    public String toString() {
        return "produit{" + "idpr=" + idpr + ", nom=" + nom + ", prix=" + prix + ", disponibilite=" + disponibilite + '}';
    }
    

}

    

   
   

   


