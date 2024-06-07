<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['codigo_cancion']) and !empty($_POST['nombre']) and !empty($_POST['compositor']) and !empty($_POST['genero']) and !empty($_POST['estreno']) )  {

        $codigo = $_POST['codigo_cancion'];
        $nombre = $_POST['nombre'];
        $compositor = $_POST['compositor'];
        $estreno = $_POST['estreno'];
        $genero = $_POST['genero'];
        

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO cancion (codigo_cancion, nombre, compositor, estreno, genero) VALUES(:cod, :nom, :com, :est, :gen) ");
            $consulta->bindParam(':cod', $codigo);
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':com', $compositor);
            $consulta->bindParam(':est', $estreno);
            $consulta->bindParam(':gen', $genero);
            $proceso = $consulta->execute();

            if( $proceso && $consulta->rowCount()!=0){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##CANCION##INSERT"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##CANCION##INSERT"
                              ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
?>
