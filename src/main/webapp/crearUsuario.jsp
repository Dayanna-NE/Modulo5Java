<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="UTF-8">
		<%@ include file='recursos/boostrap.jsp' %>
		<title>Creación Usuario</title>
		
	</head>
	
	<body class="p-3 m-0 border-0 bd-example m-0 border-0">
		<div class="card text-center">
			
            <div class="card-header">
            	<!-- Barra de Navegación -->
                <%@ include file="recursos/navegacionCabecera.jsp" %>
            </div>
            
            <div class="card-body">
            <h2>Creación de Usuario</h2>
             <section class=formu>
			<form action="UsuarioServlet" method="post">
				<div class="mb-3">
					<label for="nombre" class="form-label">Nombre</label> 
					<input type="text" class="form-control" name="nombre" required>
				</div>
				<div class="mb-3">
					<label for="apellido-paterno" class="form-label">Apellido Paterno</label> 
					<input type="text" class="form-control"	name="apellido-paterno" required>
				</div>
				<div class="mb-3">
					<label for="apellido-materno" class="form-label">Apellido Materno</label> 
					<input type="text" class="form-control" name="apellido-materno" required>
				</div>
				<div class="mb-3">
					<label for="fecha-nacimiento" class="form-label">Fecha de Nacimiento</label> 
					<input type="date" class="form-control" name="fecha-nacimiento" required>
				</div>
				<div class="mb-3">
					<label for="run" class="form-label">RUN</label> 
					<input type="text" class="form-control" name="run" required>
				</div>
				<button type="submit" class="btn btn-primary">Enviar</button>
			</form>
			</section>
		</div>

		<%@ include file='recursos/footer.jsp' %>
  			
        </div>
	</body>
</html>