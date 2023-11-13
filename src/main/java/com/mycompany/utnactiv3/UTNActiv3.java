

package com.mycompany.utnactiv3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class UTNActiv3 {

    public static void main(String[] args) {
       List <String> palabras = List.of("matraz", "embudo", "probeta", "vaso ppdo", "pipeta");
      
       System.out.println(convertir(palabras)); 
       convertir(palabras).stream().forEach((palabra)->System.out.println(palabra));
       
       List <String> frases = List.of("Ana", "Luciano", "Luis", "Carolina", "Alma", "Leo", "Susana"); 
       System.out.println(aplanar(frases, 3));
       
    }
    
    public static String aplanar (List<String> lista, int nro){
        //obtengo una lista con las palabras de + de 3 letras
        List<String>filtrada = lista.stream().filter((p) -> p.length()>nro).collect(Collectors.toList());
        //transformo la lista anterior en un solo String
        String resultado = filtrada.stream().collect(Collectors.joining(", "));        
        return resultado;        
    }
    
    public static List<String> convertir(List<String> lista){
        List<String> palMayusc = lista.stream().map((palabra)->palabra.toUpperCase()).collect(Collectors.toList());
        return palMayusc;
    }
}
