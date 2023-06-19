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
      
	// credenciales
	private final String USUARIO = "admin"; //temporal
	private final String CONTRASENA = "1234"; //temporal
	
	private PrintWriter out;
	private HttpSession sesion;
			
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
		//Si tiene sesion iniciada, mostrar HTML con la info
		sesion = request.getSession(false);
		out = response.getWriter();
		
		if (sesion.getAttribute("usuario") != null) {
		    out.println("<html>");
		    out.println("<head>");
		    out.println("<meta charset=\"UTF-8\">");
		    out.println("<title>Sesión Iniciada</title>");
		    out.println("</head>");
		    out.println("<body>");
		    out.println("<h1>Sesión Iniciada</h1>");
		    out.println("<table>");
		    out.println("<tr>");
		    out.println("<th>Usuario actual</th>");
		    out.println("<th>Contraseña</th>");
		    out.println("</tr>");
		    out.println("<tr>");
		    out.println("<td>" + sesion.getAttribute("usuario") + "</td>");
		    out.println("<td>" + sesion.getAttribute("contrasena") + "</td>");
		    out.println("</tr>");
		    out.println("</table>");
		    out.println("<a href='Contacto'>Regresar</a>");
		    out.println("</body>");
		    out.println("</html>");
		    out.close();
		} else {
			
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			
		}
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
			out.close();
			
			//response.sendRedirect("Login.jsp");
			
		} else {
			sesion = request.getSession(true); //si llegamos a la validacion, va a tener una sesión iniciada
			// Asigna información a la sesión
			sesion.setAttribute("usuario", usuarioIngresado);
			sesion.setAttribute("contrasena", contrasenaIngresada);
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Usuario correcto');");
			out.println("location='Contacto'");
			out.println("</script>");
			out.close();
		}
	}

}
