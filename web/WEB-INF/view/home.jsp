<%-- 
    Document   : home
    Created on : 09/10/2021, 16:42:14
    Author     : Tayanne
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Bem-vindo!</title>
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
                    <h1>Bem vindo ao Cadastro de Persona</h1>
                    <h3>Aqui você pode salvar, visualizar e editar dados de uma persona!</h3>
                    
                    <div>
                        <a href="entrada?acao=FormCadastrar">Cadastrar uma persona</a> |
                        <a href="entrada?acao=ListarPersonas">Listar as personas cadastradas
                    </div>
                    
                </div>
            </div>
        </div>        
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
