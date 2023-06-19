package Control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import entity.Capacitacion;

/**
 * Servlet implementation class procesoCrearCapacitacion
 */
@WebServlet("/procesarCrearCapacitacion")
public class procesoCrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public procesoCrearCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Capacitacion cap = new Capacitacion();
		cap.setIdCapacitacion(Integer.parseInt(request.getParameter("idCapacitacion")));
		cap.setRutEmpresa(request.getParameter("rutEmpresa"));
		cap.setDiaCapacitacion(request.getParameter("diaSemana"));
		cap.setHoraCapacitacion(request.getParameter("horaCapacitacion"));
		cap.setLugarCapacitacion(request.getParameter("lugarCapacitacion"));
		cap.setDuracionCapacitacion(Integer.parseInt(request.getParameter("duracionCapacitacion")));
		cap.setCantidadDeAsistentes(Integer.parseInt((request.getParameter("cantidadAsistentes"))));
		
		//Instanciando una variable de tipo PrintWriter
				PrintWriter out;
				//selecciona el tipo de texto
				response.setContentType("text/html");
				//Instanciar el out
				out = response.getWriter();
				//hacemos la estructura del html
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Título de la página</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1>Capacitación</h1>");
				out.println("<table>");
				out.println("<tr>");
				out.println("<th> Tipo de Dato </th>");
				out.println("<th> Descripcion </th>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>  ID Capacitacion: </td>");
				out.println("<td>"+ cap.getIdCapacitacion() +"</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td> RUT Empresa </td>");
				out.println("<td>"+cap.getRutEmpresa()+"</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td> Dia de la capacitacion </td>");
				out.println("<td>"+cap.getDiaCapacitacion()+"</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td> Hora de la capacitacion </td>");
				out.println("<td>"+cap.getHoraCapacitacion()+"</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td> Lugar de la capacitacion </td>");
				out.println("<td>"+cap.getLugarCapacitacion()+"</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td> Duracion de la capacitacion </td>");
				out.println("<td>"+cap.getDuracionCapacitacion()+"</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td> Cantidad de asistentes </td>");
				out.println("<td>"+cap.getCantidadDeAsistentes()+"</td>");
				out.println("</tr>");
				out.println("</table>");
				out.println("</body>");
				out.println("</html>");
				out.println("<a href='crearCapacitacion.jsp'>Regresar</a>");
				out.close();
	}

}
