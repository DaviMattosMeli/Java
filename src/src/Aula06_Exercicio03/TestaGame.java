package Aula06_Exercicio03;

import Aula06_Exercicio01.Cliente;

public class TestaGame {

    public static void main(String[] args) {
        Game game01 = new Game(1,"Luta","Mortal Kombat",16,"USA");
        Game game02 = new Game(2,"Corrida","Gran Turismo",15,"USA");

        game01.visualizar();
        game02.visualizar();

    }
}
