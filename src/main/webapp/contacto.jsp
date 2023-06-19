<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<%@ include file='recursos/boostrap.jsp'  %>
		<title>Contacto</title>
		
	</head>
	<body class="p-3 m-0 border-0 bd-example m-0 border-0">
		<div class="card text-center">
						
            <div class="card-header">
            	<!-- Barra de Navegación -->
                <%@ include file="recursos/navegacionCabecera.jsp" %>
            </div>
            
            <div class="card-body">
                <h2>Formulario de Contacto</h2>
	    		<form action="Contacto" method="post">
			        <label for="nombre">Nombre:</label><br>
			        <input type="text" id="nombre" name="nombre" placeholder="Ej: Pedro Sánchez" required><br>
			        
			        <label for="email">Email:</label><br>
			        <input type="email" id="email" name="email" placeholder="Ejemplo@correo.com" required><br>
			        
			        <label for="mensaje">Mensaje:</label><br>
			        <textarea id="mensaje" name="mensaje" placeholder="Escriba aquí su consulta" required></textarea><br><br>
			        
			        <input type="submit" value="Enviar">
			    </form> 
            </div>
            
            <%@ include file='recursos/footer.jsp' %>
  			
        </div>
	</body>
</html>