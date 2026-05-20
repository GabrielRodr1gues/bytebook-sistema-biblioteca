import java.util.ArrayList;

// Classe principal que gerencia todo o sistema da biblioteca
// Conceito: Composição (contém listas de outros objetos)
public class Biblioteca {

    private String nome;
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Emprestimo> emprestimos;
    private int contadorLivro;
    private int contadorEmprestimo;

    // Construtor
    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<Livro>();
        this.usuarios = new ArrayList<Usuario>();
        this.funcionarios = new ArrayList<Funcionario>();
        this.emprestimos = new ArrayList<Emprestimo>();
        this.contadorLivro = 1;
        this.contadorEmprestimo = 1;
    }

    // ---- LIVROS ----

    public void cadastrarLivro(String titulo, String autor, String categoria) {
        Livro livro = new Livro(contadorLivro, titulo, autor, categoria);
        livros.add(livro);
        contadorLivro++;
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void listarLivros() {
        if (livros.size() == 0) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        System.out.println("=== Lista de Livros ===");
        for (int i = 0; i < livros.size(); i++) {
            System.out.println("--------------------");
            livros.get(i).exibirInfo();
        }
    }

    public void buscarLivroPorTitulo(String titulo) {
        boolean encontrou = false;
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                livros.get(i).exibirInfo();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Livro nao encontrado.");
        }
    }

    public Livro buscarLivroPorId(int id) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getId() == id) {
                return livros.get(i);
            }
        }
        return null;
    }

    // ---- USUARIOS ----

    public void cadastrarUsuario(String nome, String email, String telefone, String matricula) {
        Usuario usuario = new Usuario(nome, email, telefone, matricula);
        usuarios.add(usuario);
        System.out.println("Usuario cadastrado com sucesso!");
    }

    public void listarUsuarios() {
        if (usuarios.size() == 0) {
            System.out.println("Nenhum usuario cadastrado.");
            return;
        }
        System.out.println("=== Lista de Usuarios ===");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println("--------------------");
            usuarios.get(i).exibirInfo();
        }
    }

    public void buscarUsuarioPorMatricula(String matricula) {
        boolean encontrou = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getMatricula().equals(matricula)) {
                usuarios.get(i).exibirInfo();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Usuario nao encontrado.");
        }
    }

    public Usuario getUsuarioPorIndice(int indice) {
        if (indice >= 0 && indice < usuarios.size()) {
            return usuarios.get(indice);
        }
        return null;
    }

    // ---- FUNCIONARIOS ----

    public void cadastrarFuncionario(String nome, String email, String telefone, String cargo, String matricula) {
        Funcionario funcionario = new Funcionario(nome, email, telefone, cargo, matricula);
        funcionarios.add(funcionario);
        System.out.println("Funcionario cadastrado com sucesso!");
    }

    public void listarFuncionarios() {
        if (funcionarios.size() == 0) {
            System.out.println("Nenhum funcionario cadastrado.");
            return;
        }
        System.out.println("=== Lista de Funcionarios ===");
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("--------------------");
            funcionarios.get(i).exibirInfo();
        }
    }

    // ---- EMPRESTIMOS ----

    public void realizarEmprestimo(int idLivro, int indiceUsuario, String data) {
        Livro livro = buscarLivroPorId(idLivro);
        Usuario usuario = getUsuarioPorIndice(indiceUsuario);

        if (livro == null) {
            System.out.println("Livro nao encontrado.");
            return;
        }
        if (usuario == null) {
            System.out.println("Usuario nao encontrado.");
            return;
        }
        if (!livro.isDisponivel()) {
            System.out.println("Livro nao esta disponivel.");
            return;
        }

        livro.setDisponivel(false);
        Emprestimo emprestimo = new Emprestimo(contadorEmprestimo, livro, usuario, data);
        emprestimos.add(emprestimo);
        contadorEmprestimo++;
        System.out.println("Emprestimo realizado com sucesso!");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Usuario: " + usuario.getNome());
    }

    public void registrarDevolucao(int idEmprestimo, String data) {
        boolean encontrou = false;
        for (int i = 0; i < emprestimos.size(); i++) {
            if (emprestimos.get(i).getId() == idEmprestimo) {
                if (emprestimos.get(i).isDevolvido()) {
                    System.out.println("Este emprestimo ja foi encerrado.");
                } else {
                    emprestimos.get(i).registrarDevolucao(data);
                }
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Emprestimo nao encontrado.");
        }
    }

    public void listarEmprestimos() {
        if (emprestimos.size() == 0) {
            System.out.println("Nenhum emprestimo registrado.");
            return;
        }
        System.out.println("=== Lista de Emprestimos ===");
        for (int i = 0; i < emprestimos.size(); i++) {
            System.out.println("--------------------");
            emprestimos.get(i).exibirInfo();
        }
    }

    public String getNome() { return nome; }
    public ArrayList<Usuario> getUsuarios() { return usuarios; }
}
