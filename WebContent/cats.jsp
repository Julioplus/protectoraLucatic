<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Mad Lion´s</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i" rel="stylesheet">
	 <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <!-- Custom styles for this template -->
    <!--<link href="css/business-casual.min.css" rel="stylesheet">-->
    <link rel="stylesheet" href="css/style.css" rel="stylesheet">

  </head>
<body>

<%@ include file="./partials/header.jsp" %>


	 <div class="container" >
	
	 <div class="row">
		 <div class="d-flex justify-content-around">
           
                    
                        
                         <div class="col" id="CharFilter" >
                         <a href= "AnimalesPresenter?categoria=DISPONIBLE" >
           					 <button type="button" class="btn btn-outline-black waves-effect filter " >DISPONIBLE</button>
           					 </a>
        				</div>

       					 <div class="col" id="CharFilter">
       					 <a href= "AnimalesPresenter?categoria=URGENTE" >
          					  <button type="button" class="btn btn-outline-black waves-effect filter " name="categoria">URGENTE</button>
          					  </a>
        				</div>

      					  <div class="col" id="CharFilter">
      					  <a href= "AnimalesPresenter?categoria=INVISIBLE" >
         					   <button type="button" class="btn btn-outline-black waves-effect filter " name="categoria">INVISIBLE</button>
         					   </a>
      					  </div>

     					   <div class="col" id="CharFilter">
     					   <a href= "AnimalesPresenter?categoria=RESERVADO" >
          					  <button type="button" class="btn btn-outline-black waves-effect filter" name="categoria">RESERVADO</button>
          					  </a>
      					  </div>
                        
                        
                       
                  
             
      	 </div>
       </div>
	</div>



	<div class="row">

			<c:forEach  var = "animal" items = "${Animales}">


  


 <div class="col-md-4" >
		
		
		 		
                 <a href="AnimalPresenter?Animal=${animal.id}" >
			
    		
           					
         					 <div class="card mb-4 box-shadow"  >
         					 
         					 
         					 <img  src="img/GATO5.jpg" class="card-img-top" alt="${animal.nombre}" >
            						
           					 <div class="card-body">
           					 
             					 <p class="card-text">${animal.descripcion.cuerpo}</p>
           		 			  </div>
           		 			  
           		 	
           		 			  
           
           		 			  
         					 </div>
      			  	</a>
        		</div> 
        

				
        		
        		
        		
        		
        		
			</c:forEach>
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	</div>
 </div>


<%@include file="./partials/footer.jsp" %>

   <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>


</html>