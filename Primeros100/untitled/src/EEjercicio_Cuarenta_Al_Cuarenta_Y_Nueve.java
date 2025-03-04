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
        int cont = 0, x = 0;

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



}
