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
    private void TreintaYCuatro(){
        int numeroIngresado, numeroTres = 0;
        ArrayList<Integer> arreglo = new ArrayList<>();
        for(int x = 0; x < 15; x++){
            System.out.println("ingrese un numero:");
            arreglo.add(teclado.nextInt());
            if(arreglo.get(x) == 3){
                numeroTres++;
            }
        }
        System.out.println("La cantidad de veces que se ingreso el numero tres fue:" + numeroTres);

    }
/*
    En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos, de secundaria.
    Cada fila corresponde a las notas y al promedio de cada alumno. Se necesita un programa que permita
    a un profesor cargar, en las 3 posicines (columnas) de cada fila, las notas del alumn y que en la ultima columna
    se calculen los promedios. Una vez realizados los calculos, se desea mostrar las 3 notas de cada alumno y el promedio
    correspondiente recorriendo la matriz

*/

    private void TreintaYCinco(){}

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
































}
