package Aula02;

import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args) {

        int num1, num2, num3, maior ;

        Scanner numbers = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        num1 = numbers.nextInt();
        System.out.println("Digite um valor: ");
        num2 = numbers.nextInt();
        System.out.println("Digite um valor: ");
        num3 = numbers.nextInt();


        maior = num1;

        if(maior < num2)
            maior = num2;
        if(maior < num3)
            maior = num3;

        System.out.println("O maior número digitado é: " + maior );
    }



}

