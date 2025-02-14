package Semana_1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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




    //             +++++++++++++++++ Ejercicio 11 +++++++++++++++++
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


    //             +++++++++++++++++ Ejercicio 12 +++++++++++++++++
    /*Crear un programa que ordene un arreglo de enteros de menor a mayor.*/

    private void ejercicioDoce(int[] arreglo){

        int[] arregloAux = new int[arreglo.length];
        Arrays.sort(arreglo);
        for(int i = 0; i < arreglo.length; i++){
            arregloAux[i] = arreglo[i];
        }

    }


    //             +++++++++++++++++ Ejercicio 13 +++++++++++++++++
    /*Crear un programa que calcule el máximo común divisor (MCD) de dos números.*/

    private void ejercicioTrece(double num1, double num2){
        double maximo;
        double minimo;
        double auxiliar;
        do{
            maximo = Math.max(num1, num2);
            minimo = Math.min(num1, num2);
            auxiliar = Math.IEEEremainder(maximo, minimo); //retorna el residuo pero se podria usar modulo (%)
            num1 = minimo;
            num2 = auxiliar;

        }while(auxiliar != 0);

    }
    //             +++++++++++++++++ Ejercicio 14 +++++++++++++++++
    /*Crear un programa que elimine los duplicados de un arreglo de enteros.*/
    private void ejercicioCatorce(int[] arreglo) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            arrayList.add(arreglo[i]);
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (i == 0 || arreglo[i] != arreglo[i - 1]) {
                arrayList.add(arreglo[i]);
            }


            System.out.println(arrayList);

        }
    }
        //             +++++++++++++++++ Ejercicio 15 +++++++++++++++++
        /*Crear un programa que encuentre los dos números más cercanos entre sí en un arreglo.*/






        //             +++++++++++++++++ DIA 4 +++++++++++++++++
        //             +++++++++++++++++ Ejercicio 16 +++++++++++++++++
        /*  Crear un programa que calcule el promedio de los dígitos de un número entero.*/

        private void ejercicioDieciseis(int numEntero){

        }







        /*Crear un programa que cuente cuántas veces aparece una subcadena en una cadena dada.*/

        private void ejercicioDiecisiete(String cadenaIngresar, String subcadena) {
            int contador = 0;
            int indice = cadenaIngresar.indexOf(subcadena);

            while (indice != -1) {
                contador++;
                indice = cadenaIngresar.indexOf(subcadena, indice + 1);
            }

            System.out.println("La subcadena aparece " + contador + " veces");
        }





    /*Crear un programa que simule un conversor de unidades (metros a kilómetros, gramos a kilogramos, etc.).*/
        private void ejercicioDieciocho() {
            Scanner sc = new Scanner(System.in);
            int numeroAConvertir;
            String medida;
            double conversion = 0;

            do {
                System.out.println("Digite el numero que desea convertir: ");
                numeroAConvertir = sc.nextInt();
                sc.nextLine();

                System.out.println("Digite la medida (metros, gramos o mililitros):");
                medida = sc.next().trim().toLowerCase();

                if (numeroAConvertir >= 1) {
                    switch (medida) {
                        case "metros":
                        case "gramos":
                        case "mililitros":
                            conversion = numeroAConvertir / 1000.0; // Usa 1000.0 para conversión decimal
                            break;
                        default:
                            System.out.println("Unidad no valida.");
                            continue;
                    }

                    // Imprimir resultado
                    System.out.println("La medida ingresada fue: " + medida +
                            ", el numero a convertir fue: " + numeroAConvertir +
                            ", resultado: " + conversion + " " + medida.substring(0, medida.length() - 1) + "k");
                } else {
                    System.out.println("El numero debe ser mayor o igual a 1");
                }

            } while (numeroAConvertir != 0);

            sc.close();
            System.out.println("Programa finalizado.");
        }




        /*Crear un programa que determine si un número es un número perfecto.*/
        private void ejercicioDiecinueve(int num) {
            int suma = 0;

            // Recorremos los números desde 1 hasta num-1 para encontrar los divisores propios
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    suma += i;
                }
            }

            // Verificamos si es un numero perfecto
            if (suma == num) {
                System.out.println("El numero es perfecto");
            } else {
                System.out.println("El número no es perfecto");
            }
        }

        /*Crear un programa que divida un número entre 2 hasta que el resultado sea menor que 1.*/
        private void ejercicioVeinte(int num) {

            while (num  >= 1) {
                System.out.println(num);
                num = num / 2;
            }

        }

    //             +++++++++++++++++ DIA 5 +++++++++++++++++


        /*Crear un programa que encuentre el número de ocurrencias de una palabra en una lista de palabras.*/
        private int ejercicioVeintiUno(ArrayList<String> listaPalabras) {
            int count = 0;
            for(int i = 0; i < listaPalabras.size(); i++){
                if(listaPalabras.get(i).toLowerCase().trim().equals("hola")){
                    count++;
                }
            }
            return count;
        }

        /*Crear un programa que calcule el área de un triángulo dada su base y altura.*/

    private void ejercicioVeintiDos(double base, double altura) {
        double area = (base * altura) / 2; 
        System.out.println("El área del triángulo es: " + area);
    }



    /*Crear un programa que imprima la tabla de multiplicar de un número.*/
    private void ejercicioVeintiTres(int num) {
        for (int i = 1; i < 11; i++) {
            System.out.println( num + " x " + i);
        }
    }

    /*Crear un programa que realice un conteo regresivo de 10 a 0.*/
    private void ejercicioVeintiCuatro() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }








































    }










