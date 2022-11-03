package Aula04;

import java.util.Scanner;

public class Exercicio03 {


    public static Scanner leia = new Scanner (System.in);
    public static void main(String[] args) {

        int idade = 0, menor = 0, maior = 0;

        System.out.println("Entre com uma idade válida. Para encerrar o programa entre com um valor negativo");

        while (idade >= 0) {

            System.out.print(" Idade: ");
            idade = leia.nextInt();

            if (idade < 21) {
                menor = menor + 1;
            }

            if (idade > 50) {
                maior += 1;
            }
        }
        System.out.println("Total de pessoas menores de 21 anos: \n" + (menor - 1));
        System.out.println("Total de pessoas maiores de 50 anos: \n" + maior);
    }
}