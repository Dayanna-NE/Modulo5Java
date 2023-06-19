<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.util.ArrayList"%>  
<%@ page import="Control.Usuario" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Usuarios Registrados</title>
		<%@ include file='recursos/boostrap.jsp'  %>
	</head>
	<body class="p-3 m-0 border-0 bd-example m-0 border-0">
		<div class="card text-center">
                			
            <div class="card-header">
            	<!-- Barra de Navegación -->
                <%@ include file="recursos/navegacionCabecera.jsp" %>
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
            
            <%@ include file='recursos/footer.jsp' %>
  			
        </div>
	</body>
</html>