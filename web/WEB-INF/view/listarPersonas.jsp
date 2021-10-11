<%-- 
    Document   : lista_personas
    Created on : 09/10/2021, 20:56:25
    Author     : Tayanne
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Lista de Personas</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <a href="entrada?acao=Home">Voltar para a página principal</a>
            </div>
            <div class="row">
                <div class="column">
                    <h1>Lista de Personas Cadastradas</h1>
                    <ul>
                        <core:forEach items="${personas}" var="persona">
                            <fmt:formatDate value="${persona.dataNascimento}" pattern="dd/MM/yyyy" var="dataFormatada" />
                            <li>
                                ${persona.id} -> ${persona.nome} | ${persona.genero} | ${dataFormatada}
                                <a href="entrada?acao=CarregarDados&id=${persona.id}">Editar</a>
                                <a href="entrada?acao=RemoverPersona&id=${persona.id}">Remover</a>
                            </li>
                        </core:forEach>
                    </ul>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
