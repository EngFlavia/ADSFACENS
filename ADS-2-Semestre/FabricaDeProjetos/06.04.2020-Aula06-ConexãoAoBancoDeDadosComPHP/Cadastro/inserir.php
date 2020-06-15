<?php

	$nome   = $_GET['nome'];
	$email  = $_GET['email'];
	$data   = $_GET['data_nasc'];
	$cidade = $_GET['cidade'];


	$server = "localhost";
	$user   = "root";
	$pass   = "";
	$db     = "pessoas";

	$conn   = new mysqli($server, $user, $pass, $db);
	$conn->set_charset("utf8");

	if (!$conn) {
		echo "Não conectou! ";
	}


	$insert = "insert into Pessoas values (null, '$nome', '$email', '$data', '$cidade');";

	if(mysqli_query($conn, $insert)) 
		echo "<h1>Cadastrado com sucesso! :)</h1>";
	else
		echo "Faiô " . mysqli_error($conn);

?>