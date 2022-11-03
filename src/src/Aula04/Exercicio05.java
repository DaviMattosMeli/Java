package Aula04;

import java.util.Scanner;

public class Exercicio05 {

    public static Scanner leia = new Scanner (System.in);
    public static void main(String[] args) {


        int num1  = 0, soma = 0;

        System.out.print("Entre com um numero qualquer. Para encerrar o programa entre com numero 0");
        do {

            System.out.print(" numero: ");
            num1 = leia.nextInt();

            if (num1 > 1) {
                soma += num1;
            }
        }while(num1 != 0);

        System.out.println("A soma dos numeros positivos é: " + soma);
    }

}