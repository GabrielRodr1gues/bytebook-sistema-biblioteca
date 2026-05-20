// Classe base que representa uma Pessoa no sistema
// Conceito: Herança - Usuario e Funcionario herdam desta classe
public class Pessoa {

    // Atributos privados - Encapsulamento
    private String nome;
    private String email;
    private String telefone;

    // Construtor
    public Pessoa(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }

    // Getters e Setters - Encapsulamento
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}
