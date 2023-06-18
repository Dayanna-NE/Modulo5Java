<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
		<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
		<title>Contacto</title>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	</head>
	<body class="p-3 m-0 border-0 bd-example m-0 border-0">
		<div class="card text-center">
						
            <div class="card-header">
            	<!-- Barra de Navegación -->
                <%@ include file="navegacionCabecera.jsp" %>
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
            
            <div class="card-footer text-body-secondary">
    			LosSinCodigo
  			</div>
  			
        </div>
	</body>
</html>