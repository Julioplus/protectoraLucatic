<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<<<<<<< HEAD
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div class="container" name ="Animal">
        <div class="d-flex justify-content-center">
            <div class="col-md-10 p-lg-10 mx-auto my-10">
  
=======

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

    <div class="container" name ="Animal">

        <div class="d-flex justify-content-center">
            <div class="col-md-10 p-lg-10 mx-auto my-10">
              
                <div class="container" id="galleryIndex">
          
                    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner" >
                 
                   

                    <img  src="img/GATO5.jpg" class="card-img-top" alt="${animal.nombre}" >





                  </div>
                  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                  </a>
                  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                  </a>
                </div>
              </div>

>>>>>>> a7ceb61c87affffe62554db9788247078af0f827
            </div>
           
          </div>









<div class="container">
        <div class="row">
            <div class="col">


                <div class="bg-light mr-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden">
                    <div class="my-3 py-3">
                      <h2 class="display-5">${animal.descripcion.cabecera}</h2>
                      <p class="lead">${animal.descripcion.cuerpo}</p>
                    </div>
                    
                 </div>
  
            </div>
          <div class="col">

              <div class="bg-dark mr-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center text-white overflow-hidden">
                  <div class="my-3 py-3">
                      <table class="table">
                         
                          <tbody>
                            <tr>
                              <th scope="row">Nombre</th>
                              <td>${animal.nombre}</td>
                              
                            </tr>
                            <tr>
                                <th scope="row">Sexo</th>
                                <td>Macho</td>
                                
                              </tr>
                            <tr>
                              <th scope="row">Vacunas</th>
                              <td>v1, v2, c18</td>
                              
                            </tr>
                            <tr>
                                <th scope="row">Sociable</th>
                                <td>Si</td>
                               
                              </tr>
                            <tr>
                              <th scope="row">Estado</th>
                              <td>${animal.estado}</td>
                             
                            </tr>
                           
                          </tbody>
                        </table>
                  </div>
                  
               </div>
            
          </div>

        
        </div>
      </div>




  </div>

















<%@include file="./partials/footer.jsp" %>

   <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>










</body>
 









   
















</html>