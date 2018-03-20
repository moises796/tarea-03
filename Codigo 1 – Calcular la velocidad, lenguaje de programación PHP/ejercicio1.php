<!DOCTYPE html>
<html>
<head>
	<title>Ejercicio 1</title>
</head>
<body>
<center>
<form action="" method="POST">
<h1>PROGRAMA DE CALCULO DE VELOCIDADES</h1>
<label>Ingresa la distancia en km:</label>
<input type="text" name="dist"><br>
<label>Ingresa el tiempo en hora</label>
<input type="text" name="tiempo"><br>
<input type="submit" name="btn" value="CALCULAR">
</form>
</body>
</html>

<?php
if (isset($_POST['btn'])) {
	$dist=$_POST['dist'];
$tiempo=$_POST['tiempo'];

$vel=$dist/$tiempo;
echo "<br><h2>La velocidad es de: ".round($vel,2). "km/h</h2>";
}


?>