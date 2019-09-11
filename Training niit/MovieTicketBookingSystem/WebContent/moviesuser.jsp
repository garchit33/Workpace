<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="css.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	 <div class="container">
            <h1 id="main-title">Sign Up</h1>
            <form action="">
                <div id="first-name" class="placeholders">
                    <label >First name</label>
                    <input type="text" name="firstname" placeholder="Enter your first name...">
                </div>
                  <div id="last-name" class="placeholders">
                    <label>Last name</label>
                    <input type="text" name="lastname" placeholder="Enter your last name...">
                </div>


                <div id="email" class="placeholders">
                    <label>Email</label>
                    <input type="email" name="email" placeholder="Enter your email...">
                </div>

                <div id="password" class="placeholders">
                    <label>Password</label>
                    <input type="password" name="password" maxlength="8" placeholder="Enter your password...">
                </div>

            <br>   
            
                <button id="submit" href="#">Submit</button>

              </form> 

        </div>
</body>
</html>