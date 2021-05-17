
<%@page import="br.uninove.uniclima.http.Http"%>
<%@page import="com.uninove.uniclima.tempo.Tempo"%>
<%@page contentType="text/html;charset=ISO-8859-1" language="java" pageEncoding="UTF-8"%>

<% 
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html; charset=UTF-8");
Tempo clima = null;
String cidade ="";
if(request.getParameter("cidade")!= null){
    cidade =request.getParameter("cidade");
    clima = Http.getClima(cidade);
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uniclima</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"></script>
        <style>
            .tempo-card {
                
                padding:100px 0 0 0;
                width: 400px;
                margin: 0 auto !important;
            }
            
        </style>
    </head>
    <body>
        <!-- Barra de navegaçâo-->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
            <div class="container-fluid">
                <a href=index.jsp" class=navbar-brand">UniClima</a>
                <form class="d-flex" method="POST">
                    <input type="search" name="cidade" class="form-control me-2" placeholder="Nome da cidade:">
                    <buttom class="btn btn-outline-info" type="submit">Buscar</buttom>
                    
                </form>
            </div>
        </nav>
        
        <% if(clima != null) { %>
        <div class="container">
            <div class="row">
                <div class="tempo-card">
                    <div class="card">
                        
                        <div class="card-body">
                            
                            <div class=text-center">
                                <img src="http://openweathermap.org/img/wn/<%= clima.getWeather().get(0).getIcon()%>@2x.png">
                                <p>Cidade: <%=clima.getName() + "," + clima.getSys().getCountry()%></p>
                                
                            </div>
                            
                        </div>
                                <p><strong>Agora:</strong> <%= clima.getWeather().get(0).getDescription() %></p>
                                <p><strong>Temperatura:</strong> <%= clima.getMain().getTemp()%> °C</p>
                                <p><strong>Max:</strong> <%= clima.getMain().getTempMax()%> °C</p>
                                <p><strong>Minimo:</strong> <%= clima.getMain().getTempMin()%> °C</p>
                                <p><strong>Umidade:</strong> <%= clima.getMain().getHumidity() %> °C</p>
                                <p><strong>Sensação térmica: </strong><%=clima.getMain().getFeelsLike() %> ºC</p>
                            
                    </div>
                </div>
            </div>
        </div>
        
        <% }else{ %>
        
        <div class="container">
        <div class="row">
            <div class="tempo-card">
               <div class="card">  
                     <div class="card-body">
                       <div class="text-center">
                           <h4><%=cidade.isEmpty() ? "Digite o nome da cidade":"cidade não encontrada"%></h4>     
    </div>
    </div>
    </div>
    </div> 
    </div>
            
        </div>
        <%  }  %>
        
    </body>
</html>
