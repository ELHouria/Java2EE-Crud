<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select lieu</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<h1>Select lieu</h1>

    <form action="selectServlet" method="get">
    
    <table>
    <tr><td>Enter id</td><td><input type="text" name="id"></td></tr>
    <tr><td><input type="submit" value="submit"></td><td>
     </table>
    
    </form>
    
    
     <table BORDER="1" cellpadding="30">
    
     <tr><td> id </td> <td> city  </td> <td> adresse  </td></tr>
     <tr>
     <td>   
     
       
			${ requestScope.id }
		
	</td>
		
	 <td> 
	  
			${ requestScope.city }
		
	 
	  </td> 
	 
	 
	 <td>  
	  
			${ requestScope.adresse }
		
	 
	 
	 </td>
		
		
		
		
		</tr>
     
    
    
   
    
    </table>
    

</body>
</html>