
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uniclima</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"></script>
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
        
    </body>
</html>
