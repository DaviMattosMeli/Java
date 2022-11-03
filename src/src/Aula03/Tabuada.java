package Aula03;

import java.util.Scanner;

public class Tabuada {

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;

        System.out.println("Digite um número");
        numero = leia.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + "x" + i + " = " + (numero*i));
        }
    }
}
