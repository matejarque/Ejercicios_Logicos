package DEjercicios_TreintaYUNO_Al_Cuarenta;

public class Treinta {
    // Quiero algo que me ayude a saber si un número es una "torre digital". //
    /*Un número es una "torre digital" si cada uno de sus dígitos es mayor o igual al anterior cuando lo lees de izquierda a derecha.*/


    /*
    * Realizar un programa que dado por teclado un limite numerico por teclado(Por ejemplo 100)
        muestre en pantalla todos los numeros hasta ese limite empezando por 1.
    * */

    private void TrintaYUno(int limite){
        if (limite <= 0) {
            System.out.println("El valor ingresado debe ser mayor que 0");
            return;
        }
        for(int i = 1; i <= limite; i++){
            System.out.println(i);
        }
    }

}
