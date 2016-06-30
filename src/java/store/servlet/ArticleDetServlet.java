/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.servlet;

import java.io.IOException;
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
@WebServlet(name = "ArticleDetServlet", urlPatterns = {"/detail_article"})
public class ArticleDetServlet extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Récup ID
        long idFilm = Long.parseLong( req.getParameter("id") );
        
        // Récup Article à partir de idArticle
        Article article = new ArticleService().rechercherParId(idFilm);
        
        // Set attribute article
        req.setAttribute("article", article);
        
        // Forward vers JSP
        req.getRequestDispatcher("detail_article.jsp").forward(req, resp);
    }
}
