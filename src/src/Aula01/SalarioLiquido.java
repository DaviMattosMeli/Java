package Aula01;

import java.util.Scanner;

public class SalarioLiquido {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float salarioBruto, adicionalNoturno, horasExtras, desconto, salarioLiquido;

        System.out.println("Digite o salário bruto: ");
        salarioBruto= leia.nextFloat();
        System.out.println("Digite o adicional noturno: ");
        adicionalNoturno = leia.nextFloat();
        System.out.println("Digite a quantidade de horas extras: ");
        horasExtras= leia.nextFloat();
        System.out.println("Digite o valor dos descontos: ");
        desconto= leia.nextFloat();

        salarioLiquido = (salarioBruto + adicionalNoturno) + (horasExtras * 5) - desconto ;
        System.out.println("Seu salário líquido é: " + salarioLiquido);


    }

}