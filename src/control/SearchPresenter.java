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
 * Servlet implementation class SearchPresenter
 */
@WebServlet("/SearchPresenter")
public class SearchPresenter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchPresenter() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	private IAnimalService animalService = new AnimalService();
	
	   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	    	
			//PASO 01: Recoger informacion
			
			String keyword = "";
			if(request.getParameter("txtKeyword") != null){
				keyword = request.getParameter("txtKeyword");
			}
			  
	        //PASO 02: Recopilar la respuesta
	        ArrayList<Animal> result =  animalService.listarAnimalesByPalabra(keyword);
	        request.setAttribute("Animales", result);
	        
	        
	        System.out.println(result);
	        
	        //PASO 03: Salir      
	        
			RequestDispatcher view = request.getRequestDispatcher("cats.jsp");
	        view.forward(request, response);
	        
	    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
        
		processRequest(request,response);
        
        
        
        
   
        //request.getRequestDispatcher("result.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}