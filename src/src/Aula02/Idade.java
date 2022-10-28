package Aula02;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float idade;

        System.out.println("Insira a sua idade");
        idade = leia.nextFloat();


        if(idade >= 10 && idade <= 14) {
            System.out.println("10-14: Infantil");
        }
        else if(idade >=15 && idade <=17) {
            System.out.println("15-17: Adolescente");
        }else if(idade >=18 && idade <= 25) {
            System.out.println("18-15: Adulto");
        }
        else if(idade >= 65) {
                System.out.println("65+ : 7Idoso");
        }else {
            System.out.println("Tente novamente");
        }


    }

}