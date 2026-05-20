// Classe Usuario herda de Pessoa
// Conceito: Herança e Polimorfismo (override de exibirInfo)
public class Usuario extends Pessoa {

    private String matricula;

    // Construtor chama o construtor da classe pai com super()
    public Usuario(String nome, String email, String telefone, String matricula) {
        super(nome, email, telefone);
        this.matricula = matricula;
    }

    // Override do método da classe pai - Polimorfismo
    @Override
    public void exibirInfo() {
        System.out.println("--- Usuario ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Matricula: " + matricula);
    }

    // Getters e Setters
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
}
