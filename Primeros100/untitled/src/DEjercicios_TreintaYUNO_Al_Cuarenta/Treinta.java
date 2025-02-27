package DEjercicios_TreintaYUNO_Al_Cuarenta;
import com.sun.security.jgss.GSSUtil;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Treinta {
    // Quiero algo que me ayude a saber si un número es una "torre digital". //
    /*Un número es una "torre digital" si cada uno de sus dígitos es mayor o igual al anterior cuando lo lees de izquierda a derecha.*/
    private Scanner teclado = new Scanner(System.in);
    private void treinta(){

    }

    /*
    * Realizar un programa que dado por teclado un limite numerico por teclado(Por ejemplo 100)
        muestre en pantalla todos los numeros hasta ese limite empezando por 1.
    * */

    private void TreintaYUno(int limite){
        if (limite <= 0) {
            System.out.println("El valor ingresado debe ser mayor que 0");
            return;
        }
        for(int i = 1; i <= limite; i++){
            System.out.println(i);
        }
    }


    /*Realizar un programa que muestre por pantalla los numeros del 200 al 250 saltando de dos en dos*/
    private void TrintaYDos(){
        for(int i = 200; i <= 250; i+=2){
            i++;
            System.out.println(i);
        }
    }

    /*
    Realizar un programa que muestre en pantalla palabras que sean ingresadas por
    teclado hasta que se ingrese la palabra salir
    */
    private void TreintaYTres(){
        String palabra;
        do{
            System.out.println("Ingrese una palabra:");
            palabra = teclado.nextLine();
        }while (!palabra.equals("salir"));
    }



    /*
    * Realizar un programa que permita cargar 15 numeros en un vector. Una vez cargados se necesita que el programa cuente
        e informe por pantalla cuantas veces se cargo el numero 3
    * */
    private int TreintaYCuatro(){
        int[] arreglo = new int[14];
        System.out.println("Ingrese 15 numero apra poder cargar el arreglo");
        int numeroTres = 0;
        for(int i = 0; i <= arreglo.length; i++){
            arreglo[i] = teclado.nextInt();
            if(arreglo[i] == 3){
                numeroTres++;
            }
        }
        System.out.println("El numero tres se encontro:");
        return numeroTres;
    }
/*
    En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos, de secundaria.
    Cada fila corresponde a las notas y al promedio de cada alumno. Se necesita un programa que permita
    a un profesor cargar, en las 3 posicines (columnas) de cada fila, las notas del alumno y que en la ultima columna
    se calculen los promedios. Una vez realizados los calculos, se desea mostrar las 3 notas de cada alumno y el promedio
    correspondiente recorriendo la matriz

*/

    private void TreintaYCinco(){
        Double[][] matriz = new Double[4][4];
        Double suma = 0.0;
        System.out.println("Ingrese las notas de cada alumno");
        //carga de los alumnos
        for(int i = 0; i <= 4; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Nota del alumno " + j);
                matriz[i][j] = teclado.nextDouble();
                suma += matriz[i][j];
            }
            matriz[i][3] = suma / 3;
            suma = 0.0;
        }

        for(int i = 0; i <= 4; i++){
            System.out.println("Nota del alumno numero: " + i);
            for(int j = 0; j < 3; j++){
                System.out.println(matriz[i][j]);
            }
            System.out.println("Promedio del alumno en base a sus notas: " +  matriz[i][3]);
        }

    }

    /*
    Arbolito de navidad
    * */
    private void TreintaYSeis(){
        int altura = 5;
        for (int x = 0; x < altura; x++){
            for (int y = 0; y < altura - x - 1; y++){
                System.out.print(" ");
            }
            for (int z = 0; z < 2 * x + 1; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*

    *Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, Leonardo
    * Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludminla. Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar por pantalla
    *
    * */

    private void TrintaYSiete(){
        String[] matrizNombres = new String[7];
        System.out.println("Ingrese los nombres de las personas");
        for(int i = 0; i < 8; i++){
            matrizNombres[i] = teclado.nextLine();
        }
        System.out.println("Nombres ingresados: ");
        for(int i = 0; i < 8; i++){
            System.out.println(matrizNombres[i]);
        }
    }
































}
