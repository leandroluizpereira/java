<%-- 
    Document   : index
    Created on : 22/03/2021, 10:19:15
    Author     : leand
--%>

<%@page import="java.util.Scanner"%>
<%@page import="br.leandro.pojo.Pessoa"%>
<%@page import="br.leandro.pojo.principal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Meu primeiro Jsp</title>
    </head>
    <body>
        <h1>Minha primeira página web . Que top!</h1>
        <hr>
        <%
             Scanner ler = new Scanner(System.in);
             String nome ="leandro luiz pereira ";
             int idade =23;
             String text ="Aqui está um texto de teste";
             
            %>
            
            <h2> Dados informados: </h2>
            <strong>Nome:<%=nome%></strong>
            <strong>Idade: <%=idade%> </strong> <br>
            <div style="background-color: red;color: white;width: 300px;height: 300px;"> 
                <h3><%=text%></h3>          
            
            </div>
            <hr>
            <a href="index2.jsp">Mesma página, mas com Orientação a Objeto</a>
    </body>
</html>
