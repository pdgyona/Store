/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.service;

import java.util.List;
import store.dao.ArticleDAO;
import store.dao.UtilisateurDAO;
import store.entites.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurService {
    
    public void persistEnBase(Utilisateur utilisateur){
        new UtilisateurDAO().persistEnBase(utilisateur);
        
    }

    public Utilisateur rechercheParLoginEtMdp(String login, String mdp) {
         return new UtilisateurDAO().rechercheParLoginEtMdp(login,mdp);
    }

    public List<Utilisateur> lister() {
        UtilisateurDAO dao = new UtilisateurDAO();
        return dao.listerTous();
    }
    
    
    
}
