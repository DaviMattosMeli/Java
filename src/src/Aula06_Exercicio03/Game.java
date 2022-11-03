package Aula06_Exercicio03;

public class Game{
    int id;
    String categoria;
    String nome;

    int classificaoIndicativa;

    String paisDeDesenvolvimento;

    public Game(int id, String categoria, String nome, int classificaoIndicativa, String paisDeDesenvolvimento) {
        this.id = id;
        this.categoria = categoria;
        this.nome = nome;
        this.classificaoIndicativa = classificaoIndicativa;
        this.paisDeDesenvolvimento = paisDeDesenvolvimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getClassificaoIndicativa() {
        return classificaoIndicativa;
    }

    public void setClassificaoIndicativa(int classificaoIndicativa) {
        this.classificaoIndicativa = classificaoIndicativa;
    }

    public String getPaisDeDesenvolvimento() {
        return paisDeDesenvolvimento;
    }

    public void setPaisDeDesenvolvimento(String paisDeDesenvolvimento) {
        this.paisDeDesenvolvimento = paisDeDesenvolvimento;
    }

    public void visualizar(){
        System.out.println("\n*********************************");
        System.out.println("Dados do Cliente: ");
        System.out.println("ID do Cliente: " + this.id);
        System.out.println("CPF do Cliente: " + this.categoria);
        System.out.println("Nome do Cliente: " + this.nome);
        System.out.println("Idade do Cliente: " + this.classificaoIndicativa);
        System.out.println("Sexo do cliente: " + this.paisDeDesenvolvimento);
    }


}
