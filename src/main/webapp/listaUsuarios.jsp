<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.util.ArrayList"%>  
<%@ page import="Control.Usuario" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
		<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
		<title>Usuarios Registrados</title>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	</head>
	<body class="p-3 m-0 border-0 bd-example m-0 border-0">
		<div class="card text-center">
                			
            <div class="card-header">
            	<!-- Barra de Navegación -->
                <%@ include file="navegacionCabecera.jsp" %>
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