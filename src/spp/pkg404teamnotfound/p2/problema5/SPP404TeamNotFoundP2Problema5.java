/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.pkg404teamnotfound.p2.problema5;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPP404TeamNotFoundP2Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matriz();
    }
     public static void matriz(){
        int m,n;
        
        System.out.println("Introduzca el tamaño m*n de las matrices\n");
        m=asignarTamaño("m (filas)");
        n=asignarTamaño("n (columnas)");
        System.out.println("\nValores de la matriz: ");
        int[][]A=asignarValores(m,n);
         System.out.println("\n\nel contenido de la matriz es: ");
        mostrarArray(A);
        int suma=0,cont=0;
        for(int j=0; j<A.length;j++){
            for(int i=0;i<A[j].length;i++){
                suma=suma+A[j][i];
               
            } cont++;
            System.out.println("La suma de la fila "+cont+" es: "+suma);
            suma=0;
        }
    }

    
    public static int solicitaDatos(){
        Scanner kb=new Scanner(System.in);
        boolean flag;
        int num=0;
        do{      
            try{ 
                num = kb.nextInt(); 
                flag = true;
            }catch (Exception ex) { 
                flag = false;
                System.out.println("\nEl valor insertado es inválido. Introduzca un entero válido.\n" +ex+ "\n");
                kb.nextLine();   
            }
            
        }while(flag==false); 
        return num;
    }
public static void mostrarArray(int [][]matrix){ 
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print("["+matrix[i][j]+"]");
                if (j+2>matrix[i].length){
                    System.out.println("\t");
                }  
            }
        } 
        
    }
public static int[][] asignarValores(int m, int n){
        int[][] matrix = new int [m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Introduzca valores para la posición "+i+", "+j);
                matrix [i][j]=solicitaDatos();
            }    
        }
        
        return matrix;
    }
public static int asignarTamaño(String dimension){
        int x;
        boolean flag;
        System.out.println("Valor de "+dimension);
        do{
            x=solicitaDatos();
            flag=true;
            if(x<1){
                System.out.println("Introduzca un entero positivo(no hay longitudes negativas  o nulas de matrices)");
                flag=false;
            }
            
        }while(flag==false);
        
        return x; 
    }
}