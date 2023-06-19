package Control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import entity.Usuario;

/**
 * Servlet implementation class UsuarioServlet
 */
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ArrayList<Usuario> users = new ArrayList<Usuario>();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// GET sirve para invocar JSP con lista de usuarios o formulario para crear usuarios
		String clickedLink = request.getParameter("link");
		
		if (clickedLink.equals("ListarUsuarios")) {
			//Cuando es presionado Listar Usuarios
			
			//Instancia algunos usuarios para probar
			
			
			request.setAttribute("users", users);
			// redirije a página con lista de usuarios
			getServletContext().getRequestDispatcher("/listaUsuarios.jsp").forward(request, response);
		
		} else {
			// Cuando es presionado Crear Usuario
			getServletContext().getRequestDispatcher("/crearUsuario.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// recibe parametros del formulario de contacto para crear un usuario
		final String NAME = request.getParameter("nombre");
		final String LASTNAME1 = request.getParameter("apellido-paterno");
		final String LASTNAME2 = request.getParameter("apellido-materno");
		final String BIRTHDATE = request.getParameter("fecha-nacimiento");
		final String RUN = request.getParameter("run");
		Usuario usu = new Usuario(NAME,LASTNAME1,LASTNAME2,BIRTHDATE,RUN);
		users.add(usu);
        // Enviar a base de datos o a un correo electronico
		
		PrintWriter out = response.getWriter();
        out.println("<script type=\"text/javascript\">");
		out.println("alert('Usuario Creado');");
		out.println("</script>");
		//Instanciando una variable de tipo PrintWriter
		
		//selecciona el tipo de texto
		response.setContentType("text/html");
		//Instanciar el out
		out = response.getWriter();
		//hacemos la estructura del html
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Listar Usuario</title>");
		
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Usuario</h1>");
		out.println("<section class='form'>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th> Tipo de Dato </th>");
		out.println("<th> Descripcion </th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>  Nombre Usuario: </td>");
		out.println("<td>"+ usu.getNombre() +"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td> Apellido Paterno </td>");
		out.println("<td>"+usu.getApellidoPaterno()+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td> Apellido Materno </td>");
		out.println("<td>"+usu.getApellidoMaterno()+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td> Fecha de nacimiento </td>");
		out.println("<td>"+usu.getFechaNacimiento()+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td> RUN </td>");
		out.println("<td>"+usu.getRun()+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</section>");
		out.println("</body>");
		out.println("</html>");
		out.println("<a href='crearUsuario.jsp'>Regresar</a>");
	}

}
