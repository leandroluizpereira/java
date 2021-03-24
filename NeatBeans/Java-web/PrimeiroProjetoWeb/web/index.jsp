<%-- 
    Document   : index
    Created on : 22/03/2021, 10:19:15
    Author     : leand
--%>

<%@page import="br.leandro.pojo.Pessoa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Meu primeiro Jsp</title>
    </head>
    <body>
        <h1>Minha primeira página web.Que top!</h1>
        <hr>
        <%
            Pessoa p = new Pessoa();
            p.setNome("Leandro luiz pereira ");
            p.setIdade(33);
            p.setFumante(false);
     
            %>
            
            <h2> Dados informados: </h2>
            <strong>Nome:<%= p.getNome() %></strong>
            <strong>Idade: <%= p.getIdade() %> </strong> <br>

            <hr>
              
       
            <a href="index2.jsp">Mesma página, mas com Orientação a Objeto</a>
    </body>
</html>
