<%-- 
    Document   : pageDeConnexion
    Created on : 30 juin 2016, 11:25:18
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    </head>
    <body>
        <h1> Se connecter</h1>
        <div class="contenair">
            <form method="post" act action="ConnexionServlet">
                Login: <input type="text" name="login"/>
                <br>
                Mot de passe: <input type="password" name="mdp"/>
                <br>
                <input type="submit"/>
            </form>
        </div>
    </body>
</html>
