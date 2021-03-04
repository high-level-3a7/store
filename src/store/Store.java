/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import models.precommande;
import models.produit;
import Services.ServicesProduit;
import Services.ServicesPrecommande;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        DataSource cnx = new DataSource();
    ServicesProduit sp = new ServicesProduit();
    ServicesPrecommande spr = new ServicesPrecommande();
       ServicesProduit p1 =new ServicesProduit();
       ServicesPrecommande pr1 =new ServicesPrecommande();
       p1.ajouter(new produit("aa", 5, "jj"));
       ServicesPrecommande pr3 =new ServicesPrecommande();
       pr1.ajouter(new precommande(5,7,""));
         
         precommande pr2 =new precommande(20, 1,"27/06/1999" );
        pr1.ajouter(pr2);
        // spr.supprimer(pr2);
         spr.afficher().forEach(System.out::println);
         
         
         
        produit p2 =new produit(27, "ll", 8, "zzkojjk");
        //p1.ajouter(p2);
       // sp.supprimer(p2);
       //sp.afficher().forEach(System.out::println);
    
      //spr.modifier(pr2);
     // pr3.modifier(pr2);
    //  p1.modifier(p2);
    //pr2.getId();
   //System.out.println(spr.getId(20));
 //spr.readAllEmployeessSortedByDate().forEach(System.out::println);
  //sp.readAllEmployeessSortedByPrix().forEach(System.out::println);
    }
}
