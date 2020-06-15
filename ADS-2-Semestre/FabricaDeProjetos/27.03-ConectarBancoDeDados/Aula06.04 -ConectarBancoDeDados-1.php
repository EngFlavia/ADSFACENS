<!DOCTYPE html>
<html>
<head>
	<title> Conexão com banco de dados </title>
    <link rel="Stylesheet" type="text/css" href="Stylesheet.css">
   
    
</head>
<body>
    <h1> Conexão com banco de dados </h1>
    
    <?php
 
    $server = "localhost";
    $user = "root";
    $password = "";
    $db = "seresvivos";

    $conn = new mysquli($server, $user, $password, $db );
    $conn ->set_charset("utf8");

    if ($conn) {
        echo "Conectou! <br><br>";
    }
    else {
        echo "Não conectou";
    }
    $result = $conn -> query ("select from animals;"  );

    echo "<table>";
    echo "<tr>";
    echo "<tb>Nome</th>";
    echo "<tb>Peso</th>";
    echo "<tb>Cor</th>";
    echo "</tr>";

    while ($row = $result->fetch_assoc()) {
        echo "<tr>";
        echo "<td>". $row["nome_animal"]."</td>";
        echo "<td>". $row["peso"]."</td>";
        echo "<td>". $row["cor"]."</td>";
        echo "</tr>";

    }

    echo "</table>";

    ?>

</body>
</html>
	