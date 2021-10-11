<%-- 
    Document   : index
    Created on : 09/10/2021, 15:43:44
    Author     : Tayanne
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<core:url value="entrada?acao=Login" var="linkLogin" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Acesso Administrativo</title>
    </head>
    <body class="bg-light">
        
        <div class="container">
            <div class="row">
                    <div class="column">
                    <h3>Acesso Administrativo</h3>
                    <form action="${linkLogin}" method="POST" class="d-inline-flex flex-column">
                        <input type="hidden" name="acao" value="Login"/>
                        <label>Login</label>
                        <input type="text" name="txtLogin">
                        <br>
                        <label>Senha</label>
                        <input type="password" name="txtSenha">
                        <br>
                        <label hidden>Botão para enviar</label>
                        <input type="submit" name="btnEnviar">
                    </form>
                    <br>
                    <div>
                        <a href="">Esqueci minha senha</a> | 
                        <a href="">Cadastrar</a>
                    </div>
                </div>
            </div>
        </div>        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
