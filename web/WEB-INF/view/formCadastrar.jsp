<%-- 
    Document   : cadastrar_persona
    Created on : 10/10/2021, 20:10:01
    Author     : Tayanne
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<core:url value="entrada?acao=CadastrarPersona" var="linkCadastrar"></core:url>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Cadastramento</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <p>
                    Usuário logado: ${usuarioLogado.login}
                <%@include file="logout.jsp" %>
                </p>
            </div>

            <div class="row">
                <div class="column">
                    <h3>Cadastrar Persona</h3>
                    <form action="${linkCadastrar}" method="POST" class="d-inline-flex flex-column">
                        <label>Nome</label>
                        <input type="text" name="txtNome">
                        <br>
                        <label>Genero</label>
                        <input type="text" name="txtGenero">
                        <br>
                        <label>Data de Nascimento</label>
                        <input type="text" name="txtData" />
                        <br>
                        <label hidden>Botão para enviar</label>
                        <input type="submit" name="btnEnviar" value="Enviar" />
                    </form>
                </div>
            </div>
        </div>        

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>

