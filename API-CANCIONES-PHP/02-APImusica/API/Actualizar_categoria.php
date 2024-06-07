<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['codigo_genero']) and !empty($_POST['nombre_genero']) ) {

      $codigo = $_POST['codigo_cancion'];
      $nombre = $_POST['nombre_genero'];
     
        try {
            $consulta = $base_de_datos->prepare("UPDATE genero SET nombre_genero=:nom  WHERE codigo_genero = :cod ");
            $consulta->bindParam(':cod', $codigo);
            $consulta->bindParam(':nom', $nombre);
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##PERSON##UPDATE"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##PERSON##UPDATE"
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
