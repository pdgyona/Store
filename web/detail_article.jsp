<%-- 
    Document   : detail_article
    Created on : 30 juin 2016, 14:13:35
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        <h1>Détail de : ${article.nom}</h1>
            prix: ${article.prix}
            Stock: ${article.stock}
            <br>
            <b>Réasisé par:</b>
            <c:forEach items="${film.realisateurs}" var="real">
                ${real.prenom} ${real.nom} ,
            </c:forEach>
            <br>
            <b>Interprété par:</b>
            <c:forEach items="${film.acteurs}" var="act">
                ${act.prenom} ${act.nom} ,
            </c:forEach>·
            <br>
            <b>Liens:</b>
            <c:forEach items="${film.liens}" var="lien">
                       ${lien.langue} ${lien.qualite} <a href="${lien.url}">Voir en streaming</a>
                       <br>
            </c:forEach>
        </div>
    </body>
</html>
