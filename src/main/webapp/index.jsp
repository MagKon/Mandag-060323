<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<script type="text/javascript" src="Plugins/bootstrap-5.0.2-dist/js/bootstrap.js"></script>
<script type="text/javascript" src="Plugins/bootstrap-5.0.2-dist/js/bootstrap.bundle.js"></script>
<script type="text/javascript" src="Plugins/JQuery-3.6.3/JQuery-3.6.3.min.js"></script>
<link rel="stylesheet" href="Plugins/bootstrap-5.0.2-dist/css/bootstrap.css">

<html>
<body>

<h2>HTML Forms</h2>

<form action="hello-servlet" method="post" target="_blank" class="form-control">
    <label for="fname" class="form-label">First name:</label><br>
    <input type="text" id="fname" name="fname" value="John" class="form-label"><br>
    <label for="lname" class="form-label">Last name:</label><br>
    <input type="text" id="lname" name="lname" value="Doe" class="form-label"><br><br>
    <input type="submit" value="Submit" class="btn btn-primary">
</form>

<p>If you click the "Submit" button, the form-data will be sent to a page called "hello-servlet".</p>

</body>
</html>