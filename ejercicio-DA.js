//Mismo: iniciamos una funcion

function lengthOfLongestSubstring(s) {

    //Variables
  let diccionario = {};
  let longitudMaxima = 0;
  let inicio = 0;

  //Iniciamos for
  for (let fin = 0; fin < s.length; fin++) {
    // IF
    if (s[fin] in diccionario && diccionario[s[fin]] >= inicio) {
      inicio = diccionario[s[fin]] + 1;
    } //ELse
    else {
      longitudMaxima = Math.max(longitudMaxima, fin - inicio + 1);
    }
//Terminamos el ciclo
    diccionario[s[fin]] = fin;
  }
//Terminamos la funcion
  return longitudMaxima;
}

//Planteamos un ejemplo
let cadena = "abcabebb";
let longitud = lengthOfLongestSubstring(cadena);
//Ejecutamos:
console.log(longitud);  // Salida: 3