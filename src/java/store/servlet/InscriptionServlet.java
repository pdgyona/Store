/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import store.entites.Commande;
import store.entites.Utilisateur;
import store.service.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "InscriptionServlet", urlPatterns = {"/inscription"})
public class InscriptionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        List<Utilisateur> listeUtilisateurs = new UtilisateurService().lister();
        req.setAttribute("utilisa", listeUtilisateurs);
        req.getRequestDispatcher("inscription.jsp").forward(req, resp);
    }
    
    
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        

        /* Récupération des champs du formulaire. */
        String login = request.getParameter( "login" );
        String motDePasse = request.getParameter("motdepasse");
        String adressLivraison = request.getParameter("adressLivraison");
        String typeUtil = request.getParameter("typeUtil");
        
        Utilisateur utilisateur = new  Utilisateur();
        utilisateur.setLogin(login);
        utilisateur.setMdp(motDePasse);
        
        utilisateur.setTypeUtil(Utilisateur.TypeUtil.CLIENT);
        
        new UtilisateurService().persistEnBase(utilisateur);
        
        response.sendRedirect("listerDesArticleServlet");
        

    }

    
}
