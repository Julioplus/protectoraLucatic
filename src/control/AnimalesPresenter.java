package control;

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
    	
		switch (request.getParameter("categoria")) {
			case "DISPONIBLE":
				result = animalService.listarAnimalesByCategoria("DISPONIBLE");
		        request.setAttribute("Animales", result);
				break;
			case "RESERVADO":
				result = animalService.listarAnimalesByCategoria("RESERVADO");
		        request.setAttribute("Animales", result);
				break;
			case "INVISIBLE":
				result = animalService.listarAnimalesByCategoria("INVISIBLE");
		        request.setAttribute("Animales", result);
				break;
			case "URGENTE":
				result = animalService.listarAnimalesByCategoria("URGENTE");
		        request.setAttribute("Animales", result);
				break;
			default:
				
		break;
		}
		
		RequestDispatcher view = request.getRequestDispatcher("cats.jsp");
        view.forward(request, response);
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
