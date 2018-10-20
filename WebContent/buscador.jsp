<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<%@include file="./partials/header.jsp" %>

<%
    String keyword = "";
    if(request.getParameter("txtKeyword") != null){
        keyword = request.getParameter("txtKeyword");
    }
    
    
%>
        
<div class="container">
    <div class="row">
        <div class="col-md-6">
            <h2>Custom search field</h2>
            <div id="custom-search-input">
            
            
                <div class="input-group col-md-12">
                
                <form action="SearchPresenter" method="post">
                
                  <input  name="txtKeyword"  type="text" id="txtKeyword" value="<%=keyword%>" class="form-control input-lg" placeholder="Buscar" />
                                      
                        
                        <input type="submit" id="custom-search-button" value="Search">
                </form>
                   
                </div>
            </div>
        </div>
    </div>
</div>
    <div class="row">
    

    </div>
<%@include file="./partials/footer.jsp" %>
</body>