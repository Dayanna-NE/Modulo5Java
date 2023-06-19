package Control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import entity.Capacitacion;

/**
 * Servlet implementation class procesoListarCapacitacion
 */
@WebServlet("/listarCapacitacion")
public class procesoListarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public procesoListarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Capacitacion> cap = new ArrayList<Capacitacion>();
		
		cap.add(new Capacitacion(1,"14.223.444-5","12/12/2023","14:05","Las uvas y el viento 332",2,25));
		cap.add(new Capacitacion(1,"14.223.444-5","12/12/2023","14:05","Las uvas y el viento 332",2,25));
		cap.add(new Capacitacion(1,"14.223.444-5","12/12/2023","14:05","Las uvas y el viento 332",2,25));
		cap.add(new Capacitacion(1,"14.223.444-5","12/12/2023","14:05","Las uvas y el viento 332",2,25));
		cap.add(new Capacitacion(1,"14.223.444-5","12/12/2023","14:05","Las uvas y el viento 332",2,25));
		cap.add(new Capacitacion(1,"14.223.444-5","12/12/2023","14:05","Las uvas y el viento 332",2,25));
		request.setAttribute("capHtml", cap);
		
		getServletContext().getRequestDispatcher("/listarCapacitacion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
