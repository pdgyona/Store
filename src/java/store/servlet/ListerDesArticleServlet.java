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
import store.entites.Article;
import store.service.ArticleService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListerDesArticleServlet", urlPatterns = {"/listerDesArticleServlet"})
public class ListerDesArticleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        //recuperation des articles dans la BD
        ArticleService service = new ArticleService();
        List<Article> articlesTrouve = service.lister();
        
        
        
        //Initialisation des attributs pour jsp
        req.setAttribute("articles", articlesTrouve);
        req.setAttribute("connecte", req.getParameter("connecte"));
        
        //Fowrad vers jsp
        req.getRequestDispatcher("listeDesArticles.jsp").forward(req, resp);  
        
    }
    


}
