window.onload = function () {
      
     contenidoPersonas = document.getElementById("personasMostrar");
     contenidoInsertar = document.getElementById("form_insertar");
     contenidoModificar = document.getElementById("form_modificar");
     titulo = document.getElementById("titulo_modificar");
     imagenCarga = document.getElementById('imagen_carga');
}

function cargarPersonas() {
      contenidoModificar.style.display = "none";
      contenidoInsertar.style.display = "none";
      
      fetch("https://codetesthub.com/API/Obtener.php")
      .then(res => res.json())
      .then(data => {
        const users = data; 

      
        contenidoPersonas.style.display = "block";
        const tableBody = document.getElementById('tablaPersonas').getElementsByTagName('tbody')[0];

        tableBody.innerHTML = '';
        
        // Iterar sobre los datos de los usuarios y construir las filas de la tabla
        users.forEach(user => {
            
          const row = document.createElement('tr');
          row.innerHTML = `
            <td>${user.cedula}</td>
            <td>${user.nombres}</td>
            <td>${user.apellidos}</td>
            <td>${user.telefono}</td>
            <td>${user.email}</td>
            
            <!-- Puedes agregar más celdas aquí si hay más datos -->
          `;
          imagenCarga.style.display = "none";
          tableBody.appendChild(row);
          
        });
      })
      .catch(error => {
        console.error('Error al obtener los datos de la API:', error);
      });
            

            }


function mostrarInsert() {
   let cedula = document.getElementById("cedula"); 
    let nombre1 = document.getElementById("nombre");
    let apellidos1 = document.getElementById("apellido");
    let telefono1 = document.getElementById("telefono");
    let direccion1 = document.getElementById("direccion");
    let email1 = document.getElementById("email");

    cedula.value = "";
    nombre1.value = "";
    apellidos1.value = "";
    telefono1.value = "";
    direccion1.value = "";
    email1.value = "";
    contenidoModificar.style.display = "none";
    contenidoPersonas.style.display = "none";
    
    contenidoInsertar.style.display = "block";
    imagenCarga.style.display = "none";

}


function insertarPersona(){

    let cedula = parseInt(document.getElementById("cedula").value);
    let nombre1 = document.getElementById("nombre").value;
    let apellidos1 = document.getElementById("apellido").value;
    let telefono1 = document.getElementById("telefono").value;
    let direccion1 = document.getElementById("direccion").value;
    let email1 = document.getElementById("email").value;

    
     
      let datos = new FormData();
      datos.append("cedula", cedula); // Se indica el valor de cedula
      datos.append("nombres", nombre1); // Se indica el valor de nombres
      datos.append("apellidos", apellidos1); // Se indica el valor de apellidos
      datos.append("telefono", telefono1); // Se indica el valor de telefono
      datos.append("direccion", direccion1); // Se indica el valor de direccion
      datos.append("email", email1); // Se indica el valor de email
  
      let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json"
        },
        body: datos
    };
  
      fetch("https://codetesthub.com/API/Insertar.php", configuracion)
        .then(res => res.json())
        .then(data => {

          let mensajeExito = document.getElementById('mensajeExito');
          mensajeExito.style.display = 'block';
          
         
          setTimeout(() => {
              mensajeExito.style.display = 'none';
          }, 3000);
            
            console.log('Respuesta JSON Servidor: ');
            console.log(data);
            

        }).catch(error => {
          console.error('Error al insertar los datos:', error);

          if (data.status) { // Suponiendo que la API devuelve { success: true } en caso de éxito
            mensajeExito.style.display = 'block';
            mensajeExito.innerHTML = "Persona registrada con éxito";
            
            setTimeout(() => {
                mensajeExito.style.display = 'none';
            }, 3000);
        }else {
          mensajeExito.style.display = 'block';
          mensajeExito.style.backgroundColor = 'red';
          mensajeExito.innerHTML = "No se pudo insertar, compruebe campos llenos y cedula valida";
          setTimeout(() => {
            mensajeExito.style.display = 'none';
        }, 3000);
        } 
         
         
      });
  }

  function mostrarActualizar() {
    titulo.innerHTML = "Modificar Persona";
    imagenCarga.style.display = "none";
    contenidoPersonas.style.display = "none";
    contenidoInsertar.style.display = "none";
 
    const miBoton = document.getElementById('miBoton');
    miBoton.removeEventListener('click', eliminarPersona ); // Eliminar event listener existente
    miBoton.addEventListener('click', actualizarPersona );
    miBoton.style.backgroundColor = 'blue';
    contenidoModificar.style.display = "block";

    let cedulaB = document.getElementById("cedula1");
   
    let nombre = document.getElementById("nombre1");
    let apellidos = document.getElementById("apellido1");
    let telefono = document.getElementById("telefono1");
    let direccion = document.getElementById("direccion1");
    let email = document.getElementById("email1");

    cedulaB.value = "";
    nombre.value = "";
    apellidos.value = "";
    telefono.value = "";
    direccion.value = "";
    email.value = "";
}

  function mostrarEliminar() {
    titulo.innerHTML = "Eliminar Persona";
    imagenCarga.style.display = "none";
    contenidoPersonas.style.display = "none";
    contenidoInsertar.style.display = "none";
    const miBoton = document.getElementById('miBoton');
    miBoton.removeEventListener('click', actualizarPersona );
    miBoton.addEventListener('click', eliminarPersona );
    miBoton.style.backgroundColor = 'red';
    contenidoModificar.style.display = "block";

    let cedulaB = document.getElementById("cedula1");
   
    let nombre = document.getElementById("nombre1");
    let apellidos = document.getElementById("apellido1");
    let telefono = document.getElementById("telefono1");
    let direccion = document.getElementById("direccion1");
    let email = document.getElementById("email1");

    cedulaB.value = "";
    nombre.value = "";
    apellidos.value = "";
    telefono.value = "";
    direccion.value = "";
    email.value = "";
  }

  function actualizarPersona(){
   
    
    let cedulaB = parseInt(document.getElementById("cedula1").value);
   
    let nombre = document.getElementById("nombre1").value;
    let apellidos = document.getElementById("apellido1").value;
    let telefono = document.getElementById("telefono1").value;
    let direccion = document.getElementById("direccion1").value;
    let email = document.getElementById("email1").value;

      let datos = new FormData();
      datos.append("cedula", cedulaB); // Se indica el valor de cedula
      datos.append("nombres", nombre); // Se indica el valor de nombres
      datos.append("apellidos", apellidos); // Se indica el valor de apellidos
      datos.append("telefono", telefono); // Se indica el valor de telefono
      datos.append("direccion", direccion); // Se indica el valor de direccion
      datos.append("email", email); // Se indica el valor de email
  
      let configuracion = {
          method: "POST",
          headers: {
              "Accept": "application/json"
          },
          body: datos
      };
  
      fetch("https://codetesthub.com/API/Actualizar.php", configuracion)
          .then(res => res.json())
          .then(data => {
            imagenCarga.style.display = "none";
              console.log('Respuesta JSON Servidor: ');
              console.log(data);

              if (data.status) { // Suponiendo que la API devuelve { success: true } en caso de éxito
                mensajeExito.style.display = 'block';
                mensajeExito.innerHTML = "Persona actualizada con éxito";
                
                setTimeout(() => {
                    mensajeExito.style.display = 'none';
                }, 3000);
            }else {
              mensajeExito.style.display = 'block';
              mensajeExito.style.backgroundColor = 'red';
              mensajeExito.innerHTML = "No se pudo actualizar, compruebe campos llenos y cedula valida";
              setTimeout(() => {
                mensajeExito.style.display = 'none';
            }, 3000);
            } 
                
          });
  }

  function eliminarPersona(){
    let cedulaA = parseInt(document.getElementById("cedula1").value);
      let datos = new FormData();
      datos.append("cedula", cedulaA); // Se indica el valor de cedula
  
      let configuracion = {
          method: "POST",
          headers: {
              "Accept": "application/json"
          },
          body: datos
      };
  
      fetch("https://codetesthub.com/API/Eliminar.php", configuracion)
          .then(res => res.json())
          .then(data => {
            imagenCarga.style.display = "none";
              console.log('Respuesta JSON Servidor: ');
              console.log(data);

              if (data.status) { // Suponiendo que la API devuelve { success: true } en caso de éxito
                mensajeExito.style.display = 'block';
                mensajeExito.innerHTML = "Persona registrada con éxito";
                
                setTimeout(() => {
                    mensajeExito.style.display = 'none';
                }, 3000);
            }else {
              mensajeExito.style.display = 'block';
              mensajeExito.style.backgroundColor = 'red';
              mensajeExito.innerHTML = "No se pudo insertar, compruebe campos llenos y cedula valida";
              setTimeout(() => {
                mensajeExito.style.display = 'none';
            }, 3000);
            } 
          });
  }
  
  function buscarPersona() {
     
  
    let nombre_nuevo = document.getElementById("nombre1");
    let apellidos_nuevo = document.getElementById("apellido1");
    let telefono_nuevo = document.getElementById("telefono1");
    let direccion_nuevo = document.getElementById("direccion1");
    let email_nuevo = document.getElementById("email1");
    let cedulaB = parseInt(document.getElementById("cedula1").value);
    
    fetch("https://codetesthub.com/API/Obtener.php")
      .then(res => res.json())
      .then(data => {
        let personaEncontrada = false;
        console.log(cedulaB);
        
        for (let index = 0; index < data.length; index++) {
            console.log(data[index].cedula);
          if (data[index].cedula === cedulaB) {
            nombre_nuevo.value = data[index].nombres;
            apellidos_nuevo.value = data[index].apellidos;
            telefono_nuevo.value = data[index].telefono;
            direccion_nuevo.value = data[index].direccion;
            email_nuevo.value = data[index].email;
            personaEncontrada = true;
            break; 
          }
        }
        if (!personaEncontrada) {
         
          mensajeExito.style.display = 'block';
          mensajeExito.style.backgroundColor = 'red';
          mensajeExito.innerHTML = "Persona no encontrada";
          setTimeout(() => {
            mensajeExito.style.display = 'none';
        }, 3000);
        
          
        }
      })
      .catch(error => {
        console.error("Error al buscar la persona:", error);
       
      });
  }
  