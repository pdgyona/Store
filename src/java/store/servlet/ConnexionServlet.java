/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import store.entites.Article;
import store.entites.Utilisateur;
import store.service.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ConnexionServlet", urlPatterns = {"/ConnexionServlet"})
public class ConnexionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
        //Recuperation des donnée entré via formulaire
        
        String login = req.getParameter("login");
        String mdp = req.getParameter("mdp");
        
        //Recuperation de l'utilisateur correspondant dans la BD
        
        Utilisateur utilisateur = new UtilisateurService().rechercheParLoginEtMdp(login,mdp);
        
        //Je suis  connecté corectement
        req.getSession().setAttribute("utilConnecte", utilisateur);
        
        // Cree un pannier vide en session
        req.getSession().setAttribute("pannier", new ArrayList<Article>());
        
        //redirection vers la liste des articles
        resp.sendRedirect("listedesArticles?connexion=vrai");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("pageDeConnexion.jsp").forward(req, resp);
    }
    

}
