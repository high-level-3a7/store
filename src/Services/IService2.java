/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.List;
import models.precommande;
import java.sql.SQLException;




public interface IService2<Pr> {
    public void ajouter(precommande pr);
    public void supprimer(Pr p);
   public void modifier(Pr p);
    public List<Pr> afficher();
     public List<Pr> readAllEmployeessSortedByDate();
}
