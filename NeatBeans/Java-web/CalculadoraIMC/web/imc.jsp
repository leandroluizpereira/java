
<%@page import="br.calculadora.imc.Imc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora IMC</title>
    </head>
    <body>
        <% 
            float altura,peso;
            altura = Float.parseFloat(request.getParameter("altura")) ;
            peso = Float.parseFloat(request.getParameter("peso"));         
            Imc imc = new Imc();
            imc.setAltura(altura);
            imc.setPeso(peso);
            //out.print("Peso ="+ peso);
            //out.print("Altura = "+ altura);
        %>
        <h1>Calculadora Imc</h1>
        <hr> 
        <br>
        <h2>Dados informados:</h2>
        <p><strong>Altura:</strong> <%= altura %></p>
        <p><strong>Peso:</strong> <%= peso %></p>
        <br>
        <h2>Seu imc:</h2>
        <p><strong>Imc:</strong> <%= String.format("%.02f",imc.calculaIMC() )  %></p>
        <p><strong>Classificação:</strong> <%= imc.geraClassificacao() %></p>
        <br>
        <a href="index.html">calcular novamente </a>
    </body>
</html>
