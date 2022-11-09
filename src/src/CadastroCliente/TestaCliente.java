package CadastroCliente;

import CadastroCliente.ClienteModel;


public class TestaCliente {
    public static void main(String[] args) {
        ClienteModel c1 = new ClienteModel("Davi", 1, 123456789,"Rua Generation", "davi@meli.com");
        ClienteModel c2 = new ClienteModel("Alany", 2, 987654321,"Avenida Osasco", "alany@gmail.com");

        c1.visualizar();
        c2.visualizar();
    }
}