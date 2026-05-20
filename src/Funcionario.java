// Classe Funcionario herda de Pessoa
// Conceito: Herança e Polimorfismo (override de exibirInfo)
public class Funcionario extends Pessoa {

    private String cargo;
    private String matriculaFuncionario;

    // Construtor chama o construtor da classe pai com super()
    public Funcionario(String nome, String email, String telefone, String cargo, String matriculaFuncionario) {
        super(nome, email, telefone);
        this.cargo = cargo;
        this.matriculaFuncionario = matriculaFuncionario;
    }

    // Override do método da classe pai - Polimorfismo
    @Override
    public void exibirInfo() {
        System.out.println("--- Funcionario ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Cargo: " + cargo);
        System.out.println("Matricula: " + matriculaFuncionario);
    }

    // Getters e Setters
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getMatriculaFuncionario() { return matriculaFuncionario; }
    public void setMatriculaFuncionario(String m) { this.matriculaFuncionario = m; }
}
