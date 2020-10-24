/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecamatrizjair;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Jair
 */
public class BibliotecaMatrizJair {

    
    public static void main(String[] args) throws IOException {
        
        Procedimientos llamadoMatriz = new Procedimientos();
        
        int[][] matriz;      int[][] matriz4;    int[][] matriz7;
        int[][] matriz2;     int[][] matriz5;    int[][] matriz8;
        int[][] matriz3;     int[][] matriz6;    int[][] matriz9;
        int[] arreglo;
        
        matriz = llamadoMatriz.declararMatriz();
        matriz2 = llamadoMatriz.declararMatriz();
        
        matriz7 = matriz;
        matriz8 = matriz2;
        matriz9 = matriz;
        
        System.out.println("matriz 1:");
        llamadoMatriz.imprimirMatriz(matriz);
        llamadoMatriz.MatrizCuadratica(matriz);
        
        System.out.println("matriz 2:");
        llamadoMatriz.imprimirMatriz(matriz2);
        llamadoMatriz.MatrizCuadratica(matriz2);
        
        matriz3 = llamadoMatriz.sumaMatriz(matriz, matriz2);
        llamadoMatriz.imprimirMatriz(matriz3);
        llamadoMatriz.MatrizCuadratica(matriz3);
        
        matriz3 = llamadoMatriz.restaMatriz(matriz, matriz2);
        llamadoMatriz.imprimirMatriz(matriz3);
        llamadoMatriz.MatrizCuadratica(matriz3);
       
        System.out.println("Multiplicaion Matriz:");
        matriz3 = llamadoMatriz.multiplicacionMatriz(matriz, matriz2);
        llamadoMatriz.imprimirMatriz(matriz3);
        llamadoMatriz.MatrizCuadratica(matriz3);
        
        System.out.println("Suma de filas de matriz1");
        llamadoMatriz.sumaFilas(matriz);
        System.out.println("Suma de columas de matriz1");
        llamadoMatriz.sumaCol(matriz);
        
        System.out.println();
        System.out.println("Suma de filas de matriz2");
        llamadoMatriz.sumaFilas(matriz2);
        System.out.println("Suma de columas de matriz2");
        llamadoMatriz.sumaCol(matriz2);
        
        System.out.println();
        if(llamadoMatriz.MatrizSimetrica(matriz)){
            System.out.println("--La matriz1 es simétrica--.");
        } else {
            System.out.println("--La Matriz1 no es simétrica--");
        }
        
        if(llamadoMatriz.MatrizSimetrica(matriz2)){
            System.out.println("--La matriz2 es simétrica--.");
        } else {
            System.out.println("--La Matriz2 no es simétrica--");
        }
        
        System.out.println("Matriz1 inversa:");
        matriz4 = llamadoMatriz.matrizInversa(matriz7);
        llamadoMatriz.imprimirMatriz(matriz4);
        
        System.out.println("Matriz2 inversa:");
        matriz5 = llamadoMatriz.matrizInversa(matriz8);
        llamadoMatriz.imprimirMatriz(matriz5);
        
        System.out.println("Matriz transpuesta");
        matriz6 = llamadoMatriz.matrizTranspuesta(matriz9);
        llamadoMatriz.imprimirMatriz(matriz6);
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite la dimension que desea para generar una matriz en caracol"));
        System.out.println("Matriz caracol:");
        llamadoMatriz.mostrarMatrizCaracol(llamadoMatriz.MatrizCaracol(n, 1), n, n);
        
        
    }
    
}
