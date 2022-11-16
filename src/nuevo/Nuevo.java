/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevo;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Nuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int matriz[][]= new int [3][3];
        Scanner one = new Scanner(System.in);
        
        float sumaFila = 0;
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print("Ingrese el número de fila "+(i)+" Columna "+j+":");
                matriz[i][j]=one.nextInt();
            }
        }
        for(int i = 0 ; i<matriz.length; i++){
            sumaFila=0;
            for(int j=0 ; j<matriz[i].length; i++){
                sumaFila += matriz[i][j];
                System.out.print(String.format("%d",matriz[i][j]));
            }
            System.out.print(String.format("Suma fila: %f, promedio fila: %f",sumaFila,sumaFila / matriz.length));
            System.out.println();
        }
    }
    
}
