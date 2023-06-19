
<%@page import="entity.Capacitacion"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="Control.procesoListarCapacitacion" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file='recursos/boostrap.jsp'  %>
<title>Listar Capacitacion</title>
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
	            <th> ID </th>
	            <th> Rut Empresa </th>
	            <th> Dia </th>
	            <th> Hora </th>
	            <th> Lugar </th>
	            <th> Duracion</th>
	            <th> Cantidad Asistentes</th>
	    </thead>
		<%
		ArrayList<Capacitacion> cap = (ArrayList<Capacitacion>)request.getAttribute("capHtml");
				for (Capacitacion x: cap){			
		%>	
	        <tr>
	            <td><%=x.getIdCapacitacion() %></td>
	            <td><%=x.getRutEmpresa() %></td>
	            <td><%=x.getDiaCapacitacion() %></td>
	            <td><%=x.getHoraCapacitacion() %></td>
	            <td><%=x.getLugarCapacitacion() %></td>
	            <td><%=x.getDuracionCapacitacion() %></td>
	            <td><%=x.getCantidadDeAsistentes() %></td>
	        </tr>
	     <% } %>   
	    </table>
	    </div>
	    <%@ include file='recursos/footer.jsp' %>
	    </div>
</body>
</html>