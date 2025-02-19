package CEjercicios_VeintiUno_Al_Treinta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class veinte {



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

    /*Crear un programa que reciba una lista de números y los ordene de mayor a menor utilizando el método de ordenación por burbuja.*/
    private void ejercicioVeintiSeis(List<Integer> listNumeros) {
        Collections.sort(listNumeros);
        System.out.println(listNumeros);
    }


    /*Crear un programa que determine si un número es un número Armstrong.*/
    /*Un número Armstrong es aquel que es igual a la suma de sus propios dígitos elevados
    a la potencia de la cantidad de dígitos. Verificar si un número lo es.*/
    private void ejercicioVeintiSiete(int num) {
        String parce = Integer.toString(num), auxLetra;
        int cantidadDigitos = parce.length(), aux = 0, suma = 0;
        for (int i = 0; i < parce.length(); i++) {
            auxLetra = String.valueOf(parce.charAt(i));
            aux = Integer.parseInt(auxLetra);
            suma += Math.pow(aux, cantidadDigitos);
        }
        if(suma == num){
            System.out.println("El numero ingresado es un numero Armstrong");

        }else {
            System.out.println("El numero ingresado no es un numero Armstrong");
        }
    }

    /*Crear un programa que calcule el área de un trapecio.*/
    private void ejercicioVeintiOcho(Double baseMayor, double baseMenor, double altura){
        System.out.println("El area del trapecio es:" + ((baseMayor + baseMenor) * altura) / 2 );
    }



    /*Crear un programa que calcule el número de días entre dos fechas dadas..*/
    private void ejercicioVeintiNueve(int numMaximo){

    }

}
