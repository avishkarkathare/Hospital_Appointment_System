<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_js_css.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>

</head>
<body>
	<%@include file="navbar.jsp"%>

	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card paint-card">
					<div class="card-body">

						<p class="fs-4 text-center">User Register</p>

						
						<form action="sign" method="post">

							<div class="mb-3">
								<label class="form-label">Name</label> <input
									required="required" name="name" type="text"
									class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Mobile Number</label> <input
									required="required" name="number" type="number"
									class="form-control">
							</div>


							<div class="mb-3">
								<label class="form-label">Email Address</label> <input
									required="required" name="email" type="email"
									class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Password</label> <input
									required="required" name="password" type="password"
									class="form-control">
							</div>

							<button type="submit" class="btn bg-success text-white col-md-12"
								onclick="myFunction()">Register</button>

						</form>


					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
		function myFunction() {
			alert("Register Successfully");
		}
	</script>
</body>
</html>