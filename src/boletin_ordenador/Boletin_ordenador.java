package boletin_ordenador;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class Boletin_ordenador {


    public static void main(String[] args) {
        
        
        Ordenador ordenador1 = new Ordenador(5,16,true,"b07",49,"Asus",15.9f);
      //  Ordenador ordenador2 = new Ordenador();
        
        Scanner ler = new Scanner(System.in);
        
     //   ordenador1.CalcularPrezo();
      //  System.out.println("el precio seria = "+ordenador1.CalcularPrezo());
        ordenador1.VisualizarAtributos();
       // System.out.println("el ordenador esta formado = "+ordenador1.VisualizarAtributos());
        
        
        
        
        
        
        
    
    }
    
}
