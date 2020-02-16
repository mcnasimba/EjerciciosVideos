/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjmeplosBasicos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {
    
    public int valor;
    public int valor2;
    
    
    public Principal(){
        valor=1;
        valor2=2;
    }
    public static void main(String args[]){
        
       
        //Intercambiar filas de un vector
        
        int filaIntercambiar;
        int filaDestino; 
        int aux; 
        
        int [][]vector= new int[5][6];
        Scanner leer = new Scanner(System.in);
        
       
        
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <6; j++) {
                vector[i][j]= (int) (Math.random()*10+1);
            }
        }
        
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <6; j++) {
                System.out.print(vector[i][j]+"\t");
            }
            System.out.println("");
        }
        
         System.out.println("Ingrese fila a Intercambiar");
        filaIntercambiar = leer.nextInt();
        
        System.out.println("Ingrese fila Destino");
        filaDestino = leer.nextInt();
        
        for (int i = 0; i < 6; i++) {
            aux = vector[filaDestino][i];
            vector[filaDestino][i]=vector[filaIntercambiar][i];
            vector[filaIntercambiar][i]=aux;
        }
        
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <6; j++) {
                System.out.print(vector[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
