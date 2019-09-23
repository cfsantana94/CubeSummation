<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://code.jquery.com/jquery-3.4.1.js"
	integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
	crossorigin="anonymous"></script>
<title>Cube Summary Carlos Santana</title>

<script>
	$(function() {
		$(".send_info").click(function(event) {
			let data = $("textarea[name='data']").val();
			$(".response").val("");
			if (data.length > 0) {
				let url = $(".form_submit").attr("action");
				$.post(url, {
					data : data
				}, function(response) {
					$(".response").val(response);
				});
			} else {
				alert("Ingrese valores");
			}
		});
	});
</script>
</head>
<body class="container">

	<div class="row">
		<div class="col-md-6 col-xs-12 px-2">
			<form class="form_submit" method="post" action="/cubo-web/run_cubo">
				<div class="form-group">
					<label for="comment">Input:</label>
					<textarea name="data" class="form-control" rows="10"></textarea>
				</div>
				<button type="button" class="send_info btn btn-info">Enviar</button>
			</form>
		</div>
		<div class="col-md-6 col-xs-12 px-2">
			<div class="form-group">
				<label for="comment">Output:</label>
				<textarea disabled name="data" class="form-control response" rows="10"></textarea>
			</div>
		</div>
	</div>
</body>
</html>