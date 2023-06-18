<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
		<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
		<title>Creación Usuario</title>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	</head>
	
	<body class="p-3 m-0 border-0 bd-example m-0 border-0">
		<div class="card text-center">
			
            <div class="card-header">
            	<!-- Barra de Navegación -->
                <%@ include file="navegacionCabecera.jsp" %>
            </div>
            
            <div class="card-body">
            <h2>Creación de Usuario</h2>
			<form action="UsuarioServlet" method="post">
				<div class="mb-3">
					<label for="nombre" class="form-label">Nombre</label> 
					<input type="text" class="form-control" id="nombre" required>
				</div>
				<div class="mb-3">
					<label for="apellido-paterno" class="form-label">Apellido Paterno</label> 
					<input type="text" class="form-control"	id="apellido-paterno" required>
				</div>
				<div class="mb-3">
					<label for="apellido-materno" class="form-label">Apellido Materno</label> 
					<input type="text" class="form-control" id="apellido-materno" required>
				</div>
				<div class="mb-3">
					<label for="fecha-nacimiento" class="form-label">Fecha de Nacimiento</label> 
					<input type="date" class="form-control" id="fecha-nacimiento" required>
				</div>
				<div class="mb-3">
					<label for="run" class="form-label">RUN</label> 
					<input type="text" class="form-control" id="run" required>
				</div>
				<button type="submit" class="btn btn-primary">Enviar</button>
			</form>
		</div>

		<div class="card-footer text-body-secondary">
    			LosSinCodigo
  			</div>
  			
        </div>
	</body>
</html>