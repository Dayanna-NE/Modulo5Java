<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Barra de Navegación -->
<ul class="nav nav-tabs card-header-tabs nav-justified">
    <li class="nav-item">
        <a class="nav-link <%= request.getRequestURI().endsWith("inicio.jsp") ? "active" : "" %>" href="Inicio">Inicio</a>
    </li>
    <li class="nav-item">
        <a class="nav-link <%= request.getRequestURI().endsWith("contacto.jsp") ? "active" : "" %>" href="Contacto">Contacto</a>
    </li>
    <li class="nav-item">
        <a class="nav-link <%= request.getRequestURI().endsWith("crearCapacitacion.jsp") ? "active" : "" %> " href="crearCapacitacion.jsp">Crear Capacitación</a>
    </li>
    <li class="nav-item">
        <a class="nav-link <%= request.getRequestURI().endsWith("listaCapacitacion.jsp") ? "active" : "" %> " href="listarCapacitacion">Lista Capacitaciones</a>
    </li>
    <li class="nav-item">
        <a class="nav-link <%= request.getRequestURI().endsWith("listaUsuarios.jsp") ? "active" : "" %>" href="UsuarioServlet?link=ListarUsuarios">Listado de Usuarios</a>
    </li>
    <li class="nav-item">
        <a class="nav-link <%= request.getRequestURI().endsWith("crearUsuario.jsp") ? "active" : "" %>" href="UsuarioServlet?link=CrearUsuario">Crear Usuario</a>
    </li>
    <li class="nav-item">
        <a class="nav-link <%= request.getRequestURI().endsWith("login.jsp") ? "active" : "" %>" href="Login">Login</a>
    </li>
</ul>