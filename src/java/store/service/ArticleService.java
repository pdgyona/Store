/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.service;

import java.util.List;
import store.dao.ArticleDAO;
import store.entites.Article;

/**
 *
 * @author admin
 */
public class ArticleService {
    
    public void persistEnBase(Article article){
        ArticleDAO dao = new ArticleDAO();
        dao.persistEnBase(article);
        
    }

    public List<Article> lister() {
        ArticleDAO dao = new ArticleDAO();
        return dao.listerTous();
       
    }

    public Article rechercherParId(long id) {
        ArticleDAO dao = new ArticleDAO();
        return  dao.rechercherParId(id);
    }
    
    
}
