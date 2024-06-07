<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['codigo_genero']) and !empty($_POST['nombre']) )  {

        $codigo = $_POST['codigo_genero'];
        $nombre = $_POST['nombre_genero'];
       
        

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO genero (codigo_genero, nombre_genero) VALUES(:cod, :nom) ");
            $consulta->bindParam(':cod', $codigo);
            $consulta->bindParam(':nom', $nombre);
            $proceso = $consulta->execute();

            if( $proceso && $consulta->rowCount()!=0){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##CATEGORIA##INSERT"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##CATEGORIA##INSERT"
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
