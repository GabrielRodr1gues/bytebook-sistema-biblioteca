import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("UC HUB - Biblioteca Universitaria");

        // Dados iniciais para demonstracao
        biblioteca.cadastrarLivro("Clean Code", "Robert C. Martin", "Programacao");
        biblioteca.cadastrarLivro("Java Como Programar", "Paul Deitel", "Programacao");
        biblioteca.cadastrarLivro("O Senhor dos Aneis", "J. R. R. Tolkien", "Fantasia");
        biblioteca.cadastrarUsuario("Gabriel Oliveira", "gabriel@uc.br", "81999990001", "2024001");
        biblioteca.cadastrarUsuario("Ana Souza", "ana@uc.br", "81999990002", "2024002");
        biblioteca.cadastrarFuncionario("Maria Silva", "maria@uc.br", "81999990010", "Bibliotecaria", "FUNC001");

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=============================");
            System.out.println("  UC HUB - Biblioteca");
            System.out.println("=============================");
            System.out.println("1. Livros");
            System.out.println("2. Usuarios");
            System.out.println("3. Funcionarios");
            System.out.println("4. Emprestimos");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.println("\n-- LIVROS --");
                System.out.println("1. Cadastrar livro");
                System.out.println("2. Listar livros");
                System.out.println("3. Buscar por titulo");
                System.out.print("Escolha: ");
                int sub = scanner.nextInt();
                scanner.nextLine();

                if (sub == 1) {
                    System.out.print("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();
                    biblioteca.cadastrarLivro(titulo, autor, categoria);

                } else if (sub == 2) {
                    biblioteca.listarLivros();

                } else if (sub == 3) {
                    System.out.print("Digite o titulo: ");
                    String titulo = scanner.nextLine();
                    biblioteca.buscarLivroPorTitulo(titulo);
                }

            } else if (opcao == 2) {

                System.out.println("\n-- USUARIOS --");
                System.out.println("1. Cadastrar usuario");
                System.out.println("2. Listar usuarios");
                System.out.println("3. Buscar por matricula");
                System.out.print("Escolha: ");
                int sub = scanner.nextInt();
                scanner.nextLine();

                if (sub == 1) {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Matricula: ");
                    String matricula = scanner.nextLine();
                    biblioteca.cadastrarUsuario(nome, email, telefone, matricula);

                } else if (sub == 2) {
                    biblioteca.listarUsuarios();

                } else if (sub == 3) {
                    System.out.print("Matricula: ");
                    String matricula = scanner.nextLine();
                    biblioteca.buscarUsuarioPorMatricula(matricula);
                }

            } else if (opcao == 3) {

                System.out.println("\n-- FUNCIONARIOS --");
                System.out.println("1. Cadastrar funcionario");
                System.out.println("2. Listar funcionarios");
                System.out.print("Escolha: ");
                int sub = scanner.nextInt();
                scanner.nextLine();

                if (sub == 1) {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Matricula funcional: ");
                    String matricula = scanner.nextLine();
                    biblioteca.cadastrarFuncionario(nome, email, telefone, cargo, matricula);

                } else if (sub == 2) {
                    biblioteca.listarFuncionarios();
                }

            } else if (opcao == 4) {

                System.out.println("\n-- EMPRESTIMOS --");
                System.out.println("1. Realizar emprestimo");
                System.out.println("2. Registrar devolucao");
                System.out.println("3. Listar emprestimos");
                System.out.print("Escolha: ");
                int sub = scanner.nextInt();
                scanner.nextLine();

                if (sub == 1) {
                    biblioteca.listarLivros();
                    System.out.print("ID do livro: ");
                    int idLivro = scanner.nextInt();
                    scanner.nextLine();

                    biblioteca.listarUsuarios();
                    System.out.print("Matricula do usuario: ");
                    String matriculaEmp = scanner.nextLine();
                    int indiceUsuario = -1;
                    for (int i = 0; i < biblioteca.getUsuarios().size(); i++) {
                        if (biblioteca.getUsuarios().get(i).getMatricula().equals(matriculaEmp)) {
                        indiceUsuario = i;
                        }
                    }

                    System.out.print("Data do emprestimo (ex: 20/05/2026): ");
                    String data = scanner.nextLine();
                    biblioteca.realizarEmprestimo(idLivro, indiceUsuario, data);

                } else if (sub == 2) {
                    biblioteca.listarEmprestimos();
                    System.out.print("ID do emprestimo: ");
                    int idEmp = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Data da devolucao (ex: 20/05/2026): ");
                    String data = scanner.nextLine();
                    biblioteca.registrarDevolucao(idEmp, data);

                } else if (sub == 3) {
                    biblioteca.listarEmprestimos();
                }

            } else if (opcao != 0) {
                System.out.println("Opcao invalida.");
            }
        }

        System.out.println("Sistema encerrado.");
        scanner.close();
    }
}
