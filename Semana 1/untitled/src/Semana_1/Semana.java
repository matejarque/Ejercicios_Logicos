package Semana_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Semana {


    //               +++++++++++++++++ DIA 1 +++++++++++++++++


    //             +++++++++++++++++ Ejercicio 1 +++++++++++++++++
    private Double ejercicioUno(double numeroIngresado){
        double  calculo = (Math.PI * (Math.pow(numeroIngresado,2)));
        System.out.println("El Area del circulo es:");
        return calculo;
    }



    //             +++++++++++++++++ Ejercicio 2 +++++++++++++++++
    /* Crear un programa que encuentre el número más grande de un arreglo de enteros. */
    private void ejercicioDos(double numeroIngresado) {
        int[] arreglo = new int[4];


        for (int i = 0; i < arreglo.length; i++) {
            int numero = (int) (Math.random() * 10) + 1;
            arreglo[i] = numero;
        }


        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        System.out.println("El número mayor del arreglo es: " + mayor);
    }



    //             +++++++++++++++++ Ejercicio 3 +++++++++++++++++
    /*Crear un programa que cuente cuántas veces aparece un número específico en un arreglo.*/
    private void ejercicioTres(int numeroIngresado) {
        int[] arreglo = new int[9];
        int contador = 0;

        for (int i = 0; i < arreglo.length; i++) {
            int numero = (int) (Math.random() * 5) + 1;
            arreglo[i] = numero;
        }
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == numeroIngresado){
                contador++;
            }
        }
        System.out.println("El numero " + numeroIngresado + " se encontro " + contador +" veces");

    }


    //             +++++++++++++++++ Ejercicio 4 +++++++++++++++++
    /*Escribir un programa que verifique si una palabra es un palíndromo.*/
    private boolean ejercicioCuatro(String palabra){
        boolean resultado = false;



        return resultado;
    }


    //             +++++++++++++++++ Ejercicio 5 +++++++++++++++++
    /*Crear un programa que calcule la media de un arreglo de números.*/
    //paso 1: crear las variables: arreglo, variable para suma y tamaño del arreglo
    //paso 2: llenar el arreglo con enteros
    //paso 3: sumar el contenido del arreglo
    //paso 4: dividirlo por el tamaño del arreglo
    //paso 5: mostrar el resultado.
    private int ejercicioCinco() {
        int[] arreglo = new int[9];
        for (int i = 0; i < arreglo.length; i++) {
            int numero = (int) (Math.random() * 10 ) + 1;
            arreglo[i] = numero;
        }

        int suma = 0;
        int tamArreglo = arreglo.length;
        for(int i = 0; i < arreglo.length; i++){
            suma = arreglo[i] + suma;
        }

        return suma/tamArreglo;
    }




    //               +++++++++++++++++ DIA 2 +++++++++++++++++
    //             +++++++++++++++++ Ejercicio 6 +++++++++++++++++
    /*Crear un programa que invierta una cadena de texto.*/
    private void ejercicioSeis(String cadena){
        ArrayList<Character> arreglo = new ArrayList<>();
        ArrayList<Character> arregloAuxiliar = new ArrayList<>();

        //se va convirtiendo la cadena ingresada a caracter y guardando en un arreglo
        for (int i  = 0; i < cadena.length(); i++){
            arreglo.add(cadena.charAt(i));
        }

        int count = 0;//contador necesario para ir cargando el arreglo

        //Bucle donde se invierte el orden de datos de cada posicion
        for(int i = cadena.length() - 1; i >= 0; i--){
            arregloAuxiliar.add(count, arreglo.get(i));
            count++;
        }

        // Convierte arregloAuxiliar a un String si no se realiza este paso y queda solo con el bucle anterior la salida seria ['x', 'x', 'x']
        StringBuilder resultadoInvertido = new StringBuilder();
        for (Character ch : arregloAuxiliar) {
            resultadoInvertido.append(ch);
        }

        System.out.println("La cadena ingresada fue: " + cadena + " y la cadena invertida es: " + resultadoInvertido.toString());
    }



    //             +++++++++++++++++ Ejercicio 7 +++++++++++++++++
    /*Crear un programa que calcule la suma de los números impares en un rango dado.*/
    private int ejercicioSiete(Integer rangoNumeros){
        int auxiliar = 0;
        int suma = 0;
        int numerosImpares = 0;
        for(int i = 0; i < rangoNumeros; i++){
            numerosImpares = i;
            auxiliar = i % 2;
            if(auxiliar == 1){
                suma = numerosImpares + suma;
            }
        }

        return suma;
    }


    //             +++++++++++++++++ Ejercicio 8 +++++++++++++++++
    /*Crear un programa que encuentre la posición de un número en un arreglo.*/
    private boolean ejercicioOcho(Integer numeroBuscar){
        boolean resultado = true;
        int[] arreglo = new int[10];
        //para comprobar si funciona decidi cargar el arreglo de forma sencilla, asi siempre voy a saber que numeros contiene.
        for (int i = 0; i < 10; i++) {
            arreglo[i] = i;
        }

        int encontradoOno = (Arrays.binarySearch(arreglo, numeroBuscar));
        if(encontradoOno < 0){
            resultado = false;
        }

        return resultado;
    }





    //             +++++++++++++++++ Ejercicio 9 +++++++++++++++++
    /*Crear un programa que imprima los números primos en un rango.*/
    private void ejercicioNueva(Integer fin) {
        // Inicializa el arreglo para almacenar los números primos
        ArrayList<Integer> numerosPrimos = new ArrayList<>();

        // Recorre cada numero en el rango desde 2 hasta 'fin'
        for (int i = 2; i < fin; i++) {
            boolean esPrimo = true;


            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            //si es primo se agrega a la lista.
            if (esPrimo) {
                numerosPrimos.add(i);
            }
        }
        //se muestran los numeros primos
        System.out.println("Nmeros primos hasta " + fin + ": " + numerosPrimos);
    }


    //             +++++++++++++++++ Ejercicio 10 +++++++++++++++++
    /*Crear un programa que calcule la secuencia de Fibonacci hasta el n-ésimo término.*/
    private void ejercicioDiez(Integer rangoNumeros){
        int[] arreglo = new int[rangoNumeros];

        if (rangoNumeros > 0) {
            arreglo[0] = 0;
        }

        if (rangoNumeros > 1) {
            arreglo[1] = 1;
        }

        for (int i = 2; i < rangoNumeros; i++) {
            arreglo[i] = arreglo[i - 1] + arreglo[i - 2];
        }

        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }




    //             +++++++++++++++++ Ejercicio 10 +++++++++++++++++
    /*Crear un programa que calcule la longitud de una cadena sin usar el método length().*/

    private int ejercicioOnce(String cadenaIngresada){

        ArrayList<Character> arreglo = new ArrayList<>();
        int contadorLongitud = 0;
        arreglo.add(cadenaIngresada.charAt(0));



        for(int i=0;i < cadenaIngresada.length();i++){
            contadorLongitud++;
        }


        return contadorLongitud;
    }




















}
