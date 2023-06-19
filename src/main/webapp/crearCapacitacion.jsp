<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file='recursos/boostrap.jsp'  %>
<title>Insert title here</title>
</head>
<body class="p-3 m-0 border-0 bd-example m-0 border-0">
		<div class="card text-center">
						
            <div class="card-header">
            	<!-- Barra de Navegación -->
                <%@ include file="recursos/navegacionCabecera.jsp" %>
            </div>
            
            <div class="card-body">
            <h2>Crear Capacitacion</h2>
            <section class=formu>
	  <form action="procesarCrearCapacitacion" method="post">
        <label for="idCapacitacion" class="form-control">ID Capacitacion </label>
        <input type="number" name="idCapacitacion" placeholder="Ingrese el id" required class="form-control">
        <label for="rutEmpresa" class="form-control">RUT Empresa</label>
        <input type="text" name="rutEmpresa" placeholder="Ingrese RUT" required class="form-control">
        <label for="diaSemana"class="form-control"> Dia </label>
        <select name="diaSemana" required class="form-control">
            <option value="lunes">Lunes</option>
            <option value="martes">Martes</option>
            <option value="miercoles">Miercoles</option>
            <option value="jueves">Jueves</option>
            <option value="viernes">Viernes</option>
            <option value="sabado">Sabado</option>
            <option value="domingo">Domingo</option>
        </select>
        <label for="horaCapacitacion"class="form-control">Hora:</label>
        <input type="time"name="horaCapacitacion" required class="form-control">
        <label for="lugarCapacitacion" class="form-control">Lugar: </label>
        <input type="text" name="lugarCapacitacion" placeholder="Direccion 123" required class="form-control">
        <label for="number" name="duracionCapacitacion" class="form-control">Hora </label>
        <input type="text" name="duracionCapacitacion" placeholder="1"  required class="form-control"> 
        <label for="cantidadAsistentes" class="form-control">Asistentes: </label>
        <input type="text"name="cantidadAsistentes" placeholder="1" required class="form-control">
        <button type="submit">Enviar</button>
    </form>
    </section>
     </div>
            
            <%@ include file='recursos/footer.jsp' %>
  			
        </div>
</body>
</html>