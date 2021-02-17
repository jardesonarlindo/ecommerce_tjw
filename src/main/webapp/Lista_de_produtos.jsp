<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

<% 
String Usuario = request.getParameter("usuario"); 
out.println(Usuario + " Bem Vindo");
session.setAttribute("usuario",Usuario); 
%> 

</head>
<body>
<form action = servlet2 method=POST>
<table width = 500>
	<tr> <td> Numero</td> <td> Produto</td>  <td>Preço</td>  <td> Comprar?</td></tr>
	<tr> 
		<td>1</td> 
		<td> Celular</td>  
		<td>R$: 50 </td>
		<td><input type = checkbox name=Celular value= Celular></td>    
	</tr>
	
	
	<tr> 
		<td>2</td> 
		<td> Bolsa</td>  
		<td>R$: 60 </td>
		<td><input type = checkbox name=Bolsa value= Bolsa></td>  
	</tr>
	
	
	<tr> 
		<td>3</td> 
		<td> Sapato</td> 
		<td>R$: 70 </td>		 
		<td><input type = checkbox name=Sapato value= Sapato></td> 
	</tr>
	
	<tr> 
		<td>4</td> 
		<td> Carteira</td>  
		<td>R$: 80 </td>		
		<td><input type = checkbox name=Carteira value= Carteira></td> </tr>
</table>

<input type=submit value = Comprar align = "center">
</form>
</body>
</html>

