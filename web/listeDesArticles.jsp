<%-- 
    Document   : listeDesArticles
    Created on : 30 juin 2016, 13:13:50
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Liste des articles</h1>
        <h1>Detail de : ${article.nom}</h1>
        <p>${article.stock}</p>
        <h2>${article.prix}</h2>
        
         <c:forEach items="${article.commandes}" var="comman">
             <p> Quantite :  ${comman.quantite} </p><hr>
             <p> Etat de commande :  ${comman.etat} </p>
            
                       
            </c:forEach>
        
            
            
            
        
    </body>
</html>
