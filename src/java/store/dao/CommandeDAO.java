/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import store.entites.Commande;

/**
 *
 * @author admin
 */
public class CommandeDAO {
    
    public void persistEnBase(Commande commande){
        EntityManager em = Persistence.createEntityManagerFactory("StorePU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(commande);
        em.getTransaction().commit();
    }
    
}
