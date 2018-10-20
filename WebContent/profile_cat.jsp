<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div class="container" name ="Animal">
        <div class="d-flex justify-content-center">
            <div class="col-md-10 p-lg-10 mx-auto my-10">
  
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
                                <td><!-- ${animal.ficha.sexo} -->macho</td>
                                
                              </tr>
                            <tr>
                              <th scope="row">Vacunas</th>
                              <td><!-- ${animal.ficha.vacunas} -->v4,m2,l6</td>
                              
                            </tr>
                            <tr>
                                <th scope="row">Sociable</th>
                                <td><!-- ${animal.ficha.sociabilidad} -->si</td>
                               
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
















</body>
</html>