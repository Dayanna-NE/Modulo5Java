<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login Asesoría Prevención de Riesgo</title>
	</head>
	<body>
		<form action="Logear" method="post">
			<label for="usuario">Usuario</label>
			<input type="text" name="usuario" placeholder="Ingrese RUT de Usuario" required>
			<label for="contrasena">Contraseña</label>
			<input type="text" name="contrasena" placeholder="Ingrese su contraseña" required>
			<button type="submit">Enviar</button>
		</form>
	</body>
</html>