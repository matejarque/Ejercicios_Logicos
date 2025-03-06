import java.util.ArrayList;
import java.util.Scanner;
public class EEjercicio_Cuarenta_Al_Cuarenta_Y_Nueve {
    Scanner teclado = new Scanner(System.in);



    /*
    * Revisar si un numero es positivo
    * */
    private String Cuarenta(int num){
        String numero = "";
        if(num > 0){
            numero = "Positivo";
        }else if(num < 0){
            numero = "Negativo";
        }else{
            System.out.println("El numero es 0");
        }
        return numero;
    }

    /*
    * Juego del ahorcado:

    Diseña un juego en el que el usuario intente adivinar una palabra letra por letra.

    Incluye un límite de intentos y muestra el progreso del usuario después de cada intento.
    * */
    private void CuarentaYUno(){

        String palabra = "computadora";
        boolean acierto, palabraCompleta = true;
        char[] ahorcado = new char[palabra.length()];
        for(int i = 0; i < palabra.length(); i++){
            ahorcado[i] = '_';
        }
        char letra;
        int cont = 0;

        do{
            acierto = false;
            palabraCompleta = true;
            System.out.println("Introduce una letra para adivinar la palabra");
            letra = teclado.next().charAt(0);

            for(int i = 0; i < palabra.length(); i++){

                if(palabra.charAt(i) == letra){
                    System.out.println("La letra introducida es correcta");
                    ahorcado[i] = letra;
                    acierto = true;
                }
            }
            if(acierto != true){
                cont++;
            }

            System.out.println("Intentos: " + cont);
            System.out.println("Progreso:");
            for (int i = 0; i < ahorcado.length; i++) {
                System.out.print(ahorcado[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < ahorcado.length; i++) {
                if (ahorcado[i] == '_') {
                    palabraCompleta = false;
                    break;
                }
            }
            if (palabraCompleta) {
                System.out.println("¡Felicidades! Has adivinado la palabra: " + palabra);
                break;
            }


        }while(cont < 6);
    }


/*
* Se Solicita crear una aplicación de salud y fitnes que solicite lo siguiente:
        Nombre del usuario
        Pasos caminados en el dia
    Ademas definieros las siguientes constantes:
    META_PASOS_DIARIOS = 10000
    CALORIAS_POR_PASO = 0.03 //valor aproximado en kilocalorías

    Con los valores anteriores debemos calcular las calorías quemadas según los pasos caminados.
    calorías_quemadas = pasos_diarios*CALORIAS_POR_PASO
    y verificaremos si se cumplio la meta de pasos diarios
    meta_alcanzada = pasos_diarios >= META_PASOS_DIARIOS
* */

    private void cuarentaYDos(int pasosCaminados, String usuario) {
        final int META_PASOS_DIARIOS = 10000;
        final double CALORIAS_POR_PASO = 0.04;

        String meta_alcanzada = (pasosCaminados >= META_PASOS_DIARIOS)
                ? "¡Objetivo completo! ¡Felicidades!"
                : "¡Objetivo incompleto!";

        double caloriasCalculadas = pasosCaminados * CALORIAS_POR_PASO;

        String calorias_quemadas = (caloriasCalculadas >= 10)
                ? String.format("%.2f calorías", caloriasCalculadas)
                : "Lo siento, gastaste menos de 10 calorías";

        System.out.println("Usuario: " + usuario);
        System.out.println("Meta alcanzada: " + meta_alcanzada);
        System.out.println("Calorías quemadas: " + calorias_quemadas);
    }

/*
* Sistema reserva hotel

Se solicita crear un sistema de reservación de un hotel, se debe pedir la siguiente información al usuario:
Nombre de cliente
Dias de estadia en el hotel
cuarto con vista al mar?

El hotel tiene las siguientes tarifas: Cuarto sin vista al mar 150.50 por dia- cuarto con vista al mar 190.50 por dia
El sistema debe calcular el costo total de la estadia dependiendo si escogio un cuarto con vista al mar o no, además de indicar si escogio un cuarto con vista al mar o no
*
* */

    private void cuarentaYTres(String nombreCliente, int cantidadDias, boolean vistaAlMar) {
        Double tarifa = (vistaAlMar == true)
                ? cantidadDias * 190.50
                : cantidadDias * 150.50;
        String vista = (vistaAlMar == true)
                ? "Con vista al mar"
                : "Sin vista al mar";

        System.out.println("------- Detalles de la Reservación -------");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Cantidad de días: " + cantidadDias);
        System.out.println("Tipo de cuarto: " + vista);
        System.out.println("Tarifa total: $" + String.format("%.2f", tarifa));
        System.out.println("------------------------------------------");

    }

/**Retornar el mayor de dos numeros ingresados*/
    private String cuarentaYCuatro(int num1, int num2){
        String mayor = (num1 > num2) ? "El numero mayor es" + num1 : "El numero mayor es" + num2;
        return mayor;
    }
/*
* 	Sistema de envios
    Crea un programa para determinar el costo de envió de un paquete según el destino (Nacional o internacional) y el peso del paquete
    Costo tarifas - Nacional = 10 x kilo // internacional 20 x Kilo

    Debe imprimir el costo de envió del paquete
* */
    private void cuarentaYCinco(Double peso, String destino){
        double tarifa;
        if ("nacional".equalsIgnoreCase(destino)) {
            tarifa = 10 * peso;
        } else {
            tarifa = 20 * peso;
        }
        System.out.println("-------------TARIFA DEL ENVIO--------------------");
        System.out.println("Tipo de envio: " + destino);
        System.out.printf("Tarifa: %.2f%n", tarifa);
        System.out.println("--------------------------------------------------");
    }


 /*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */


    private void cuarentaYSeis(){
        for (int i = 1; i <= 100; i++){  // Corregido para incluir el 100
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            }else if(i % 3 == 0){
                System.out.println("fizz");
            }else if(i % 5 == 0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }



}
