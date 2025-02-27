package BEjercicios_Once_Al_Veinte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Diez {


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











}
