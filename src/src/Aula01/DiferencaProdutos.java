package Aula01;


    import java.util.Scanner;

    public class DiferencaProdutos {

        public static void main(String[] args) {

            Scanner leia = new Scanner(System.in);

            int numero1, numero2, numero3, numero4;

            System.out.println("Digite o primeiro número: ");
            numero1= leia.nextInt();
            System.out.println("Digite o segundo número: ");
            numero2= leia.nextInt();
            System.out.println("Digite o terceiro número: ");
            numero3= leia.nextInt();
            System.out.println("Digite o quarto número: ");
            numero4= leia.nextInt();

            System.out.println("A diferença do produto entre " + numero1 + " e " + numero2 + " pelo produto entre " + numero3 + " e " + numero4 + " é = " + ((numero1 * numero2)-(numero3 * numero4)) );

        }

    }

