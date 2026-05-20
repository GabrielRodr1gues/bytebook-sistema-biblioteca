// Classe que representa um Livro do acervo da biblioteca
// Conceito: Encapsulamento (atributos privados, getters e setters)
public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private String categoria;
    private boolean disponivel;

    // Construtor
    public Livro(int id, String titulo, String autor, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponivel = true;
    }

    // Método para exibir informações do livro
    public void exibirInfo() {
        System.out.println("ID: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoria: " + categoria);
        if (disponivel) {
            System.out.println("Status: Disponivel");
        } else {
            System.out.println("Status: Emprestado");
        }
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }
}
