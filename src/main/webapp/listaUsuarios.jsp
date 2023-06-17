<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="Control.Usuario" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
		<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
		<title>Usuarios Registrados</title>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	</head>
	<body class="p-3 m-0 border-0 bd-example m-0 border-0">
		
		<div class="card text-center">
			<!-- Barra de Navegación -->
            <div class="card-header">
                <ul class="nav nav-tabs card-header-tabs nav-justified">
                    <li class="nav-item">
    				<a class="nav-link" aria-current="page" href="Inicio">Inicio</a>
	  				</li>
				  	<li class="nav-item">
				    	<a class="nav-link" href="Contacto">Contacto</a>
				  	</li>
				  	<li class="nav-item">
				    	<a class="nav-link disabled" href="CrearCapacitacion.jsp">Crear Capacitación</a>
				  	</li>
				  	<li class="nav-item">
				    	<a class="nav-link disabled" href="ListarCapacitacion.jsp">Listar Capacitaciones</a>
				  	</li>
				  	<li class="nav-item">
				    	<a class="nav-link active" href="UsuarioServlet">Listado de Usuarios</a>
				  	</li>
				  	<li class="nav-item">
				    	<a class="nav-link" href="Login">Login</a>
				  	</li>
                </ul>
            </div>
            <div class="card-body">
                
                <table class="table">
                	<thead class="table-dark">
                		<tr>
                			<th>Nombre</th>
                			<th>Apellido Paterno</th>
                			<th>Apellido Materno</th>
                			<th>Fecha de Nacimiento</th>
                			<th>RUN</th>
                		</tr>
                	</thead>
                	<tbody>
                		
                		<%
                		
                		ArrayList<Usuario> users = (ArrayList<Usuario>)request.getAttribute("users");
                		for (Usuario u : users) {
                			%>
                				<tr>
                					<td><%=u.getNombre() %></td>
                					<td><%=u.getApellidoPaterno() %></td>
                					<td><%=u.getApellidoMaterno() %></td>
                					<td><%=u.getFechaNacimiento() %></td>
                					<td><%=u.getRun() %></td>
                				</tr>
                			<%
                		}
                		
                		%>
          
                	</tbody>
                </table>
                
            </div>
            <div class="card-footer text-body-secondary">
    			LosSinCodigo
  			</div>
        </div>
	
	</body>
</html>