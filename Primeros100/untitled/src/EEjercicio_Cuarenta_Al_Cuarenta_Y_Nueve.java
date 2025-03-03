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





}
