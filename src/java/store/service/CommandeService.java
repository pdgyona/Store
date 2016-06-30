/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.service;

import store.dao.CommandeDAO;
import store.entites.Commande;

/**
 *
 * @author admin
 */
public class CommandeService {
    
    public void persistEnBase(Commande commande){
        new  CommandeDAO().persistEnBase(commande);
    }
    
}
