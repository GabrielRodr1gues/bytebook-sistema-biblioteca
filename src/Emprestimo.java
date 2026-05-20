// Classe que representa um Emprestimo de livro
// Conceito: Associação entre objetos (liga Livro e Usuario)
public class Emprestimo {

    private int id;
    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;
    private String dataDevolucao;
    private boolean devolvido;

    // Construtor
    public Emprestimo(int id, Livro livro, Usuario usuario, String dataEmprestimo) {
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = "";
        this.devolvido = false;
    }

    // Método para exibir informações do emprestimo
    public void exibirInfo() {
        System.out.println("ID Emprestimo: " + id);
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Data do emprestimo: " + dataEmprestimo);
        if (devolvido) {
            System.out.println("Status: Devolvido em " + dataDevolucao);
        } else {
            System.out.println("Status: Em aberto");
        }
    }

    // Registra a devolucao do livro
    public void registrarDevolucao(String data) {
        this.dataDevolucao = data;
        this.devolvido = true;
        this.livro.setDisponivel(true);
        System.out.println("Devolucao registrada com sucesso!");
    }

    // Getters e Setters
    public int getId() { return id; }

    public Livro getLivro() { return livro; }

    public Usuario getUsuario() { return usuario; }

    public boolean isDevolvido() { return devolvido; }

    public String getDataEmprestimo() { return dataEmprestimo; }

    public String getDataDevolucao() { return dataDevolucao; }
}
