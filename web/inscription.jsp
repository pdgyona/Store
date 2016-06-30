<%-- 
    Document   : isncription
    Created on : 30 juin 2016, 14:43:34
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link type="text/css" rel="stylesheet" href="style.css" />
    </head>
    <body>
        <form method="post" action="inscription">
            <fieldset>
                <legend>Inscription</legend>
                <p>Vous pouvez vous inscrire via ce formulaire.</p>

                <label for="login"> Login <span class="requis">*</span></label>
                <input type="text" id="login" name="login" value="" size="20" maxlength="60" />
                <br />

                <label for="motdepasse">Mot de passe <span class="requis">*</span></label>
                <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
                <br />

                <label for="adressLivraison">Adresse de livraison <span class="requis">*</span></label>
                <input type="text" id="confirmation" name="adressLivraison" value="" size="20" maxlength="200" />
                <br />
                <select name="typeUtil">
                    <option>Admin</option>
                    <option>Client</option>
                    <option>Inconnue</option>
                </select>

                

                <input type="submit" value="Inscription" class="sansLabel" />
                <br />
            </fieldset>
        </form>
    </body>
</html>