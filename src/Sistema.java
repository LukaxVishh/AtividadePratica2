import java.util.List;

public class Sistema {
    
    public static void iniciaSistema() {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();

            switch (op) {
                case 1:
                    cadastrarFilme();
                    break;
                case 2:
                    buscarFilme();
                    break;
                case 3:
                    editarFilme();
                    break;
                case 4:
                    excluirFilme();
                    break;
                case 5:
                    listarFilmes();
                    break;
                case 6:
                    excluirTodosFilmes();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (op != 0);
    }

    private static void exibirMenu() {
        System.out.println("===== Menu =====");
        System.out.println("[1] - Cadastrar Filme");
        System.out.println("[2] - Buscar Filme");
        System.out.println("[3] - Editar Filme");
        System.out.println("[4] - Excluir Filme");
        System.out.println("[5] - Listar Filmes");
        System.out.println("[6] - Excluir Todos os Filmes");
        System.out.println("[0] - Sair");
        System.out.print("Escolha uma opcao: ");
    }

    private static void cadastrarFilme() {
        System.out.println("===== Cadastro de Filme =====");
        System.out.print("Titulo: ");
        String titulo = Console.lerString();
        System.out.print("Duracao (minutos): ");
        int duracao = Console.lerInt();
        System.out.print("Tipo de Filme (acao/comedia/drama): ");
        String tipo = Console.lerString();
        String especifico = "";

        switch (tipo) {
            case "acao":
                System.out.print("Tipo de Acao: ");
                especifico = Console.lerString();
                break;
            case "comedia":
                System.out.print("Tipo de Comedia: ");
                especifico = Console.lerString();
                break;
            case "drama":
                System.out.print("Tema do Drama: ");
                especifico = Console.lerString();
                break;
            default:
                System.out.println("Tipo de filme invalido.");
                return;
        }

        Filme filme;
        switch (tipo) {
            case "acao":
                filme = new FilmeAcao(titulo, duracao, especifico);
                break;
            case "comedia":
                filme = new FilmeComedia(titulo, duracao, especifico);
                break;
            case "drama":
                filme = new FilmeDrama(titulo, duracao, especifico);
                break;
            default:
                System.out.println("Tipo de filme invalido.");
                return;
        }
        CadastroFilmes.adicionarFilme(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }

    private static void buscarFilme() {
        System.out.print("Digite o titulo do filme a ser buscado: ");
        String titulo = Console.lerString();
        List<Filme> filmes = CadastroFilmes.obterTodosFilmes();
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(filme);
                return;
            }
        }
        System.out.println("Filme nao encontrado.");
    }

    private static void editarFilme() {
        System.out.print("Digite o titulo do filme a ser editado: ");
        String titulo = Console.lerString();
        List<Filme> filmes = CadastroFilmes.obterTodosFilmes();
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Filme encontrado. Digite as novas informacoes:");
                System.out.print("Novo Titulo: ");
                String novoTitulo = Console.lerString();
                System.out.print("Nova Duracao (minutos): ");
                int novaDuracao = Console.lerInt();
                filme.setTitulo(novoTitulo);
                filme.setDuracao(novaDuracao);
                System.out.println("Filme editado com sucesso!");
                return;
            }
        }
        System.out.println("Filme nao encontrado.");
    }

    private static void excluirFilme() {
        System.out.print("Digite o titulo do filme a ser excluido: ");
        String titulo = Console.lerString();
        if (CadastroFilmes.excluirFilme(titulo)) {
            System.out.println("Filme excluido com sucesso!");
        } else {
            System.out.println("Filme nao encontrado.");
        }
    }

    private static void listarFilmes() {
        List<Filme> filmes = CadastroFilmes.obterTodosFilmes();
        System.out.println("===== Lista de Filmes =====");
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
        System.out.println("============================");
    }

    private static void excluirTodosFilmes() {
        List<Filme> filmes = CadastroFilmes.obterTodosFilmes();
        for (Filme filme : filmes) {
            CadastroFilmes.excluirFilme(filme.getTitulo());
        }
        System.out.println("Todos os filmes foram excluidos com sucesso!");
    }
}
