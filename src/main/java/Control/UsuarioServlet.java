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
			ArrayList<Usuario> users = new ArrayList<Usuario>();
			//Instancia algunos usuarios para probar
			users.add(new Usuario("Jose", "Marin", "Cabrera", "12/04/1987", "19364756-3"));
			users.add(new Usuario("Juan", "Gomez", "Becerra", "21/05/1995", "17593546-2"));
			users.add(new Usuario("Felipe", "Abarca", "Marin", "16/09/1998", "19222333-6"));
			users.add(new Usuario("Fabian", "Pereira", "Rodriguez", "30/04/1999", "17444654-9"));
			
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
		
        // Enviar a base de datos o a un correo electronico
		
		PrintWriter out = response.getWriter();
        out.println("<script type=\"text/javascript\">");
		out.println("alert('Usuario Creado');");
		out.println("location='Inicio'"); 
		out.println("</script>");
	}

}
