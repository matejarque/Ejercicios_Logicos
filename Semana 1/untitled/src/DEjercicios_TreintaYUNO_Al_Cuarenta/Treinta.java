package DEjercicios_TreintaYUNO_Al_Cuarenta;
import java.util.Scanner;

public class Treinta {
    // Quiero algo que me ayude a saber si un número es una "torre digital". //
    /*Un número es una "torre digital" si cada uno de sus dígitos es mayor o igual al anterior cuando lo lees de izquierda a derecha.*/
Scanner teclado = new Scanner(System.in);
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

}
