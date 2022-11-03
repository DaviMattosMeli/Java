package Aula06.Aula06_Exercicio01.Aula06_Exercicio03;

public class TestaGame {

    public static void main(String[] args) {
        Game game01 = new Game(1,"Luta","Mortal Kombat",16,"USA");
        Game game02 = new Game(2,"Corrida","Gran Turismo",15,"USA");

        game01.visualizar();
        game02.visualizar();

    }
}
