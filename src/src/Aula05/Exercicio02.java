package Aula05;

import java.util.Scanner;

public class Exercicio02 {

    public static Scanner leia = new Scanner (System.in);
    public static void main(String[] args) {


        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int tamanho = 10, soma = 0, media = 0;

        for (int i = 0; i < tamanho; i++) {
            if (i % 2 != 0) {
                System.out.println(" " + vetor[i]);
            }
        }
        System.out.println("\n");

        for (int i = 0; i < tamanho; i++) {
            if (vetor [i] % 2 == 0) {
                System.out.print(" " + vetor[i]);

            }
            soma += vetor[i];
        }

        media = (soma/10);
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);


    }

}
