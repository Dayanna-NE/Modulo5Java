<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
		<%@ include file='recursos/boostrap.jsp'  %>
	</head>
	<body class="p-3 m-0 border-0 bd-example m-0 border-0">
		<div class="card text-center">
            			
            <div class="card-header">
            	<!-- Barra de Navegación -->
                <%@ include file="recursos/navegacionCabecera.jsp" %>
            </div>
            
            <div class="card-body">
                <h2>Iniciar Sesión</h2>
                <form action="Login" method="post">
					<label for="usuario">Usuario</label>
					<input type="text" name="usuario" placeholder="Ingrese RUT de Usuario" required>
					
					<label for="contrasena">Contraseña</label>
					<input type="text" name="contrasena" placeholder="Ingrese su contraseña" required>
					<button type="submit">Enviar</button>
				</form>
            </div>
            
            <%@ include file='recursos/footer.jsp' %>
  			
        </div>
	</body>
</html>