/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut1_ta3_Ejercicio2;

import java.util.*;

public class Ejercicio2 {

    public static void main(String args[]) {
        int i, palabra = 0;
        String str = "me quiero 111 ir ahora 123";
        String cadena = "";
        int beginIndex = 0;
        int endIndex = 0;
        String[] array_palabras = new String[10];
        
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
                }
                beginIndex = i + 1;
               
                
            }
            
        }
        System.out.println(palabra);
    }
}
