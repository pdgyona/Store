/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import store.entites.Article;

/**
 *
 * @author admin
 */
public class ArticleDAO {
    
    public void persistEnBase(Article article){
        EntityManager em = Persistence.createEntityManagerFactory("StorePU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(article);
        em.getTransaction().commit();
    }
    
    
    
}
