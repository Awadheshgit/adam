<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login Page</title>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: blue;
}

* {
	box-sizing: border-box;
}

/* Add padding to containers */
.container {
	padding: 16px;
	background-color: white;
}

.center {
	margin: 0;
	position: absolute;
	top: 50%;
	left: 50%;
	-ms-transform: translate(-50%, -50%);
	transform: translate(-50%, -50%);
}

/* Full-width input fields */
input[type=text], input[type=password], input[type=email] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus, input[type=email]:focus
	{
	background-color: #ddd;
	outline: none;
}

/* Overwrite default styles of hr */
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Add a blue text color to links */
a {
	color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
	background-color: #f1f1f1;
	text-align: center;
}
</style>
</head>

<body onload='document.f.username.focus();'>
	<h2 align="left" style="font-family: sans-serif; color: white">HOWARD
		University Library</h2>
	<div class="center">
		<div class="container">
			<h3>Login with User Name and Password</h3>

			<form name='f' action='/autogeneratedmail/j_login' method='POST'>
				<table>
					<tr>
						<td>User name:</td>
						<td><input type='text' name='username' value=''></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type='password' name='password' /></td>
						<td><input name="submit" type="submit" value="Login" /></td>
					</tr>
					<tr>
						<td>Remember Me:</td>
						<td><input type="checkbox" name="remember-me" /></td>
					</tr>
					<input name="_csrf" type="hidden"
						value="0befb410-4e62-4e85-b914-a341579ead67" />
				</table>
			</form>
		</div>
	</div>
</body>
</html>