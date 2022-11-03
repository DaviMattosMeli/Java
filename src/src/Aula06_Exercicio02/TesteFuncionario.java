package Aula06_Exercicio02;

import Aula06_Exercicio01.Cliente;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario(1,"Tecnologia","Davi",27,"Programador");
        Funcionario funcionario02 = new Funcionario(2,"Telemarketing","Alany",25,"Operadora");

        funcionario01.visualizar();
        funcionario02.visualizar();

    }
}
