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
 * Servlet implementation class AnimalPresenter
 */
//@WebServlet("/AnimalPresenter")
public class AnimalPresenter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimalPresenter() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	private IAnimalService animalService = new AnimalService();

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	//PASO 01: Recoger informacion
	   System.out.println("Llega?");
        int id;
        if(request.getParameter("Animal") != null){
			id = Integer.parseInt(request.getParameter("Animal"));
		}else{
			id = Integer.parseInt(request.getParameter("Animal"));
		}
        //PASO 02: Recopilar la respuesta
        Animal result =  animalService.listarAnimalByID(id);
        request.setAttribute("Animal", result);
        
        //PASO 03: Salir      
        RequestDispatcher view = request.getRequestDispatcher("profile_cat.jsp");
        view.forward(request, response);
        //request.getRequestDispatcher("result.jsp").forward(request, response);
        
    }


   
   
  /* String keyword = "";
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
   */
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
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