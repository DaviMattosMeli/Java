package Aula06_Exercicio02;

public class Funcionario{
    int id;
    String setor;
    String nome;
    int idade;

    String funcao;

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(long cpf) {
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Funcionario(int id, String setor, String nome, int idade, String funcao) {
        this.id = id;
        this.setor = setor;
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
    }

    public void visualizar(){
        System.out.println("\n*********************************");
        System.out.println("Dados do Cliente: ");
        System.out.println("ID do Cliente: " + this.id);
        System.out.println("CPF do Cliente: " + this.setor);
        System.out.println("Nome do Cliente: " + this.nome);
        System.out.println("Idade do Cliente: " + this.idade);
        System.out.println("Sexo do cliente: " + this.funcao);
    }


}
