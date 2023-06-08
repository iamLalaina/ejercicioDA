/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio.da;
//Importamos una librería que usaremos que consiste en una clase y su paquete, utilizada para almacenar los valores/caracteres de la cadena:
import java.util.HashMap; 

/**
 *
 * @author Liliana
 */
//Este es el nombre de mi proyecto y por ende mi primer clase que es publica:
public class EjercicioDA {
    //Le creamos un metodo estatico, le colocamos el tipo de dato (int entero para resultado) y el nombre de nuestra clase con su tipo de dato (string) y el que lo identifica (s) para tomar la cadena:
    public static int lengthOfLongestSubstring(String s) {
        //Utilizamos la librería que improtamos para crear un "dicionario" que hace un seguimiento del ultimo caracter en la cadena y agregamos las demás variables que necesitamos en 0 para que inicie desde cero y no repetir caracteres:
        HashMap<Character, Integer> diccionario = new HashMap<>();
        int longitudMaxima = 0;
        int inicio = 0;
//Iniciamos el ciclo for, para encontrar caracteres repetitivos, si es así se actualiza 'inicio' al siguiente caracter:
        for (int fin = 0; fin < s.length(); fin++) {
            if (diccionario.containsKey(s.charAt(fin)) && diccionario.get(s.charAt(fin)) >= inicio) {
                inicio = diccionario.get(s.charAt(fin)) + 1;
            } //Si no se cumple con la condicion anterior entonces sigue con la siguiente que es calcularle la longitud
            else {
                longitudMaxima = Math.max(longitudMaxima, fin - inicio + 1);
            }
//Se termina el ciclo actualizando el diccionario
            diccionario.put(s.charAt(fin), fin);
        }
//Retornamos la clase terminando el for
        return longitudMaxima;
    }
//Esta es nuestra clase estatica principal en donde se ejecutara e imprimira en base lo que le asignemos a la variable cadena y las instrucciones anteriores:
    public static void main(String[] args) {
        
        String cadena = "abcabebb";
        int longitud = lengthOfLongestSubstring(cadena);
        System.out.println(longitud);  // Salida: 3
        
        //System.out.println("Hello World!");
    }
}
