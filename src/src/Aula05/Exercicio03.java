package Aula05;

import java.util.Scanner;

public class Exercicio03 {

    public static Scanner leia = new Scanner (System.in);
    public static void main(String[] args) {


        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int tamanho = 3;
        int somaSecundaria = 0, somaPrincipal = 0, i,j;


        System.out.print("Elementos da diagonal principal:");
        for (i = 0; i < tamanho; i++) {

            somaPrincipal = somaPrincipal + matriz[i] [i];
            System.out.print(matriz[i] [i] + " | ");
        }

        System.out.println("Elementos da diagonal secundária:");
        for (i = 0; i < tamanho; i++) {
            somaSecundaria = somaSecundaria + matriz[i] [tamanho -1 - i];
            System.out.print(matriz [i] [tamanho - 1 - i] + " | ");
        }
        System.out.print("Soma dos elementos diagonal principal:" + somaPrincipal);
        System.out.print("Soma dos elementos diagonal secundaria:" + somaSecundaria);

    }

}