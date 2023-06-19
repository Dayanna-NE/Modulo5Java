<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="UTF-8">
		<%@ include file='recursos/boostrap.jsp'  %>
		<title>Inicio</title>	
	</head>
	<body class="p-3 m-0 border-0 bd-example m-0 border-0">
		<div class="card text-center">
			
            <div class="card-header">
            	<!-- Barra de Navegación -->
                <%@ include file="recursos/navegacionCabecera.jsp" %>
            </div>
            
            <div class="card-body">
                <h5 class="card-title">Empresa de Asesoría en Prevención del Riesgo</h5>
                <img src="https://www.cac-asprocon.as/resources/servicios/asesoria-prl.jpg" class="img-fluid" alt="...">
                <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                <a href="Login" class="btn btn-primary">Iniciar Sesión</a>
            </div>
            
            <%@ include file='recursos/footer.jsp' %>
  			
        </div>
	</body>
</html>