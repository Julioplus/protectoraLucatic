package control;

import java.io.IOException;
import java.util.List;

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
    	
    	
    	List<Animal> result;
    	
		switch (request.getParameter("categoria")) {
			case "DISPONIBLE":
				result = animalService.getAnimales("DISPONIBLE");
		        request.setAttribute("styles", result);
				break;
			case "RESERVADO":
				result = animalService.getAnimales("RESERVADO");
		        request.setAttribute("styles", result);
				break;
			case "INVISIBLE":
				result = animalService.getAnimales("INVISIBLE");
		        request.setAttribute("styles", result);
				break;
			case "URGENTE":
				result = animalService.getAnimales("URGENTE");
		        request.setAttribute("styles", result);
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
