package CadastroCliente;

import CadastroCliente.ClienteModel;

public class PessoaFisica extends ClienteModel {
    private int cpf;
    public PessoaFisica(String nome, int sexo, int telefone, String endereco, String email, int cpf) {
        super(nome, sexo, telefone, endereco, email);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void visualizar(){
        super.visualizar();
        System.out.println("CPF: " + this.cpf);
    }
}