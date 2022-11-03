package Aula06.Aula06_Exercicio01;

public class Cliente {
    int id;
    long cpf;
    String nome;
    int idade;
    String sexo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Cliente(int id, int cpf, String nome, int idade, String sexo){
       this.id=id;
       this.cpf = cpf;
       this.nome = nome;
       this.idade = idade;
       this.sexo = sexo;
   }

   public void visualizar(){
       System.out.println("\n*********************************");
       System.out.println("Dados do Cliente: ");
       System.out.println("ID do Cliente: " + this.id);
       System.out.println("CPF do Cliente: " + this.cpf);
       System.out.println("Nome do Cliente: " + this.nome);
       System.out.println("Idade do Cliente: " + this.idade);
       System.out.println("Sexo do cliente: " + this.sexo);
   }


}
