package Aula02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        int num1;
        double raizQuadrada, elevadoQuadrado;

        Scanner leia = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.0");

        System.out.println("Digite um número: ");
        num1 = leia.nextInt();

        if(num1 % 2 == 0){

            raizQuadrada = Math.sqrt(num1);
            System.out.println("O número é par e a sua raiz quadrada é: " + decimalFormat.format(raizQuadrada));
        }
        else if(num1 % 2 == 1){
            elevadoQuadrado = Math.pow(num1,2);
            int elevadoQuadradoInteiro = (int) Math.round(elevadoQuadrado);
            System.out.println("O número é ímpar e o seu número elevado a quadrado é: "+  elevadoQuadradoInteiro);
        }
    }
}
