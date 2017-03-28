/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut1_ta3_ejercicio3;

import java.util.*;

public class Ejercicio3 {

    public static void main(String args[]) {
        int i, palabra = 0;
        String str = "me quiero 111 ir ahora 123";
        String cadena = "";
        int beginIndex = 0;
        int endIndex = 0;
        int vocales = 0;
        
        for (i = 0; i < str.length(); i++) {
            //System.out.print(str.charAt(i));
            if (str.charAt(i) == ' ' || i == str.length()-1 ){
                
                if (i == str.length()-1 ) {
                    cadena = str.substring(beginIndex, i + 1);
                }else{
                    cadena = str.substring(beginIndex, i);
                }
                
                System.out.println("Palabra: " + cadena);

                boolean esLetra = true;
                for (int j = 0; j < cadena.length(); j++) {
                    if (!Character.isLetter(cadena.charAt(j))) {
                        esLetra = false;
                    }
                }
                if (esLetra) {
                    palabra = palabra + 1;
                    vocales = vocales + esVocal(cadena);
                }
                beginIndex = i + 1;
               
            }
            
        }
        System.out.println("Cantidad de palabras: " + palabra);
        System.out.println("Cantidad de vocales: " + vocales);
    }
    
    public static int esVocal(String pPalabra){
        String[] vocales = {"a","e","i","o","u"};
        int contador = 0;
        
        for(int i = 0; i<pPalabra.length(); i++){
            
            for(int j = 0; j< vocales.length; j++){
               
                if ( String.valueOf(pPalabra.charAt(i)).equals(String.valueOf(vocales[j]))  ){
                    contador++;
                    
                }
            }
            
        }

        return contador;
    }
    
    //terminar!!!!!!!!!!!!!!!
    public static int esCosonante(String pPalabra){
        String[] vocales = {"a","e","i","o","u"};
        int contador = 0;
        
        for(int i = 0; i<pPalabra.length(); i++){

            for(int j = 0; j< vocales.length; j++){
               
                if ( !String.valueOf(pPalabra.charAt(i)).equals(String.valueOf(vocales[j])) ){
                    contador++;
                    break;
                }
            }
            
        }

        return contador;
    }
    
}
/*
 System.out.println(String.valueOf(pPalabra.charAt(i)));
                System.out.println(vocales[j]); 
*/
