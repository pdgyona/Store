/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import store.entites.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurDAO {
    
    public void persistEnBase(Utilisateur utilisateur){
        EntityManager em = Persistence.createEntityManagerFactory("StorePU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(utilisateur);
        em.getTransaction().commit();
    }

    public Utilisateur rechercheParLoginEtMdp(String login, String mdp) {
        EntityManager em = Persistence.createEntityManagerFactory("StorePU").createEntityManager();
        Query query = em.createQuery("SELECT utilisateur FROM Utilisateur utilisateur WHERE  utilisateur.login=:monLogin && utilisateur.mdp=:monMdp");
        query.setParameter("monLogin", login);
        query.setParameter("monMdp", mdp);
       
        return (Utilisateur)query.getSingleResult();
    }

    public List<Utilisateur> listerTous() {
        
        EntityManager em = Persistence.createEntityManagerFactory("StorePU").createEntityManager();
        
        return em.createQuery("SELECT utilisateur FROM Utilisateur utilisateur").getResultList();
        
    }
    
}
