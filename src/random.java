import java.security.PublicKey;
import java.util.Random;

public class random {

    public static void main(String[]args){

        int comi;

        Random numero = new Random();

        comi = numero.nextInt(10);

        System.out.println("Escreva quantas vezes eu comi: "+comi);


    }


}
