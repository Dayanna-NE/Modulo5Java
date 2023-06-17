package Control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import Control.Usuario;

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
		
		//Instancia algunos usuarios para probar
		
		ArrayList<Usuario> users = new ArrayList<Usuario>();
		users.add(new Usuario("Jose", "Marin", "Cabrera", "12/04/1987", "19364756-3"));
		users.add(new Usuario("Juan", "Gomez", "Becerra", "21/05/1995", "17593546-2"));
		users.add(new Usuario("Felipe", "Abarca", "Marin", "16/09/1998", "19222333-6"));
		users.add(new Usuario("Fabian", "Pereira", "Rodriguez", "30/04/1999", "17444654-9"));
		
		request.setAttribute("users", users);
		
		getServletContext().getRequestDispatcher("/listaUsuarios.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
