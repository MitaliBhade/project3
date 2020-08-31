<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Society Security APP</title>
</head>
<body>
<body style='background-color:#add8e6;'>
 Add Visitor Information  
 <form action = "addVisitorInfo">
Person Name: <input type ="text" name="Person_Name"><br>
Person To Visit: <input type ="text" name="name"><br>
Building Number: <select name="building">
<option>Select Option</option>
<option>B1</option>
<option>C2</option>
<option>A3</option>
<option>A4</option>
<option>A5</option>
</Select>
Flat Number: <input type ="text" name="flat"><br>
Purpose of Visit: <input type ="text" name="Purpose_of_Visit"><br>
Government Id Number: <input type ="text" name="Govt_Id_No"><br>
<br>
<input type="submit"><br>

</form>
</body>
</html>