package control;

import dao.Prueba;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Animal;
import services.AnimalService;
import services.IAnimalService;

/**
 * Servlet implementation class AnimalesPresenter
 */
@WebServlet("/AnimalesPresenter")
public class AnimalesPresenter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AnimalesPresenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	private IAnimalService animalService = new AnimalService();

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Animal> result;
		String categoria = request.getParameter("categoria");
		System.out.println("--- cargando listado de " + categoria);
		// Por si acaso. Ñapa
		if (categoria  == null){
			categoria = "DISPONIBLE";
		}

		switch (categoria) {
		case "DISPONIBLE":
		case "RESERVADO":
		case "INVISIBLE":
		case "URGENTE":
			System.out.println("entra");
			result = animalService.listarAnimalesByCategoria(categoria);
			break;
		default:
			//a priori esto nmo hace falta
			System.out.println("---lo intento directamente con DISPONIBLE");
			result = animalService.listarAnimalesByCategoria("DISPONIBLE");
			break;
		}

		request.setAttribute("Animales", result);

		RequestDispatcher view = request.getRequestDispatcher("cats.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
