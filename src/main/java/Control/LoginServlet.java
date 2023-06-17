package Control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	// variables a utilizar
	private final String USUARIO = "usuario"; //temporal
	private final String CONTRASENA = "pass"; //temporal
	PrintWriter out;
			
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
	}
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuarioIngresado = request.getParameter("usuario");
		String contrasenaIngresada = request.getParameter("contrasena");
		out = response.getWriter();
		
		if (!USUARIO.contentEquals(usuarioIngresado) || !CONTRASENA.contentEquals(contrasenaIngresada)) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Usuario o Contrasena incorrecto');");
			out.println("location='Login'");
			out.println("</script>");
			
			//response.sendRedirect("Login.jsp");
			
		} else {
			HttpSession sesion = request.getSession(); //si llegamos a la validacion, va a tener una sesión iniciada
			// Asigna información a la sesión
			sesion.setAttribute("usuario", usuarioIngresado);
			sesion.setAttribute("contrasena", contrasenaIngresada);
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Usuario correcto');");
			out.println("location='Inicio'");
			out.println("</script>");
		}
	}

}
