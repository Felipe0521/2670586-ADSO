let contenidoPrincipal;
let contenidoPokemon;
let pointProximo = "";
let pointAnterior = "";
window.onload = function () {
      contenidoPrincipal = document.getElementById("contenedorPrincipal");
      contenidoPokemon = document.getElementById("contenedorPokemones");
      imagenPokemon = document.getElementById("imagen_pokemon");
      nombrePokemon = document.getElementById("nombre_pokemon");
      imagenCarga = document.getElementById('imagen_carga');
      let endpoint = "https://pokeapi.co/api/v2/pokemon";
      consumoApi(endpoint);
}



function consumoApi(endpoint) {
     

      //consumo -AJAX
      // con fecth se hace el consumo, por defecto hace get (recibe la ruta y un arreglo)
      fetch(endpoint)
      // se hace una promesa cuando llegue una respuesta sea igual a la variable res y se convierta a formato json
      .then(res => res.json())
      .then(data => {
         
            
            //ejecutar en caso de tener el json de la api
            /*
            console.log(data);
            console.log("----------------")
            console.log(data.next);
            console.log("----------------")
            console.log(data.results)
            */

            pointProximo = data.next;
            pointAnterior = data.previous;
            
            
           contenidoPrincipal.innerHTML = "";
           for (let index = 0; index < data.results.length; index++) {
            
            let html_temp = `<div>
            <button id = "botones" class = "btn btn-light m-1 btn-outline-primary text-dark  " onclick = "cargarDetalle('${data.results[index].url}')"> ${data.results[index].name} </button> 
           </div>`;
           contenidoPrincipal.innerHTML += html_temp;
           

           }
      });

}
function hola() {
      alert("proximamente detalles");
}

function cargarDetalle(endpoint) {
     

      fetch(endpoint)
      // se hace una promesa cuando llegue una respuesta sea igual a la variable res y se convierta a formato json
      .then(res => res.json())
      .then(data => {
           
            imagenCarga.style.display = "none";
            imagenPokemon.style.display = "block";
            
             nombrePokemon.innerHTML = data.name;
            imagenPokemon.src = data.sprites.other.dream_world.front_default;
      });
}

function pasar_pagina(numero) {
      if (numero > 0) {
            if (pointProximo != null) {
                  
                  imagenPokemon.style.display = "none";
                  nombrePokemon.innerHTML = "";
                  imagenCarga.style.display = "block";
                  consumoApi(pointProximo);
            }
           
           
      }else{
            if (pointAnterior != null) {
                  imagenPokemon.style.display = "none";
                  nombrePokemon.innerHTML = "";
                  imagenCarga.style.display = "block";
                  consumoApi(pointAnterior);
                  
            }
           
      }
}