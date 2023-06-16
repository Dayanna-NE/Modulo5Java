package Control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ConsultaContacto
 */
public class ConsultaContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaContacto() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String NAME = request.getParameter("nombre");
        final String EMAIL = request.getParameter("email");
        final String MESSAGE = request.getParameter("mensaje");
        
        PrintWriter out = response.getWriter();
        
        // Enviar a base de datos o a un correo electronico
        
        out.println("<script type=\"text/javascript\">");
		out.println("alert('Gracias por contactarnos');");
		out.println("location='Inicio.jsp'"); 
		out.println("</script>");
        

        // Redirige a página de confirmación
        //response.sendRedirect("Contacto.jsp");
	}

}
