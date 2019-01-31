<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<title>Financiamiento S.A.S</title>
</head>
<body>
	<div class="container">
		<div class="col-md-offset-3 col-md-6">
			<h1>Financiamiento S.A.S</h1>
			<h3>Cotización de prestamos</h3>
			<hr />

			<c:if test="${not empty error}">
				<div class="alert alert-danger">${error}</div>
			</c:if>

			<form role="form" method="post" action="indexFinanciamiento">
				<div class="form-group">
					<label for="monto">Ingrese monto a cotizar</label> <input
						type="text" class="form-control" name="monto"
						placeholder="Ingrese monto sin puntos ni separaciones">
				</div>

				<button type="submit" class="btn btn-success btn-block">Cotizar</button>

                <div class="form-group"></div><div class="form-group"></div>
                
                <div class="form-group">Monto del préstamo: ${montoRespuesta}</div>

				<table id="messages" border="1">
					<tr>
						<th>Socio que realiza el préstamo</th>
						<th>Cuota mensual</th>
						<th>Pago total del crédito</th>
						<th>Tasa de interés mensual</th>
					</tr>

						<tr>
							<td>${socioPresta}</td>
							<td>${cuotamensual}</td>
							<td>${pagoTotalCredito}</td>
							<td>${tasaInteresMensual}</td>
						</tr>

				</table>
			</form>
		</div>
	</div>
</body>
</html>