/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.List;
import models.produit;



public interface IService<P> {
    public void ajouter(produit p);
    public void supprimer(P p);
   public void modifier(P p);
    public List<P> afficher();
     public List<P> readAllEmployeessSortedByPrix();
}

