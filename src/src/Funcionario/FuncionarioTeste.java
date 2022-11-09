package Funcionario;

import Funcionario.FuncionarioModel;

public class FuncionarioTeste {

    public class TestaFuncionarios {
        public static void main(String[] args) {
            FuncionarioModel f1 = new FuncionarioModel("Willian", "11/12/1985", 1,999999999,"willian@caetano.com",1);
            FuncionarioModel f2 = new FuncionarioModel("Caetano", "11/12/1985", 1,333333333,"caetano@willian.com",2);

            f1.visualizar();
            f2.visualizar();
        }
    }
}
