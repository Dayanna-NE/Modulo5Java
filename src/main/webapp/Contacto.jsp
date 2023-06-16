<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Contacto</title>
	</head>
	<body>
		<h2>Formulario de Contacto</h2>
	    <form action="ConsultaContacto" method="post">
	        
	        <label for="nombre">Nombre:</label><br>
	        <input type="text" id="nombre" name="nombre" placeholder="Ej: Pedro Sánchez" required><br>
	        
	        <label for="email">Email:</label><br>
	        <input type="text" id="email" name="email" placeholder="Ejemplo@correo.com" required><br>
	        
	        <label for="mensaje">Mensaje:</label><br>
	        <textarea id="mensaje" name="mensaje" placeholder="Escriba aquí su consulta" required></textarea><br><br>
	        
	        <input type="submit" value="Enviar">
	    </form> 
	</body>
</html>