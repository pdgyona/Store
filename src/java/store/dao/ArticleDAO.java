/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.dao;

import java.util.List;
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

    public List<Article> listerTous() {
        EntityManager em = Persistence.createEntityManagerFactory("StoreQU").createEntityManager();
        return em.createQuery("SELECT article FROM Article article").getResultList();
    }

    public Article rechercherParId(long id) {
       EntityManager em = Persistence.createEntityManagerFactory("StorePU").createEntityManager();
       return em.find(Article.class, id);
    }
    
    
    
}
