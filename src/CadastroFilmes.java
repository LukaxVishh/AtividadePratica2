import java.util.ArrayList;
import java.util.List;

public class CadastroFilmes {
    
    private static List<Filme> listaFilmes = new ArrayList<>();

    public static void adicionarFilme(Filme filme){
        listaFilmes.add(filme);
    }

    public static List<Filme> obterTodosFilmes(){
        return new ArrayList<>(listaFilmes);
    }

    public static List<FilmeAcao> obterFilmesAcao() {
        List<FilmeAcao> filmesAcao = new ArrayList<>();

        for(Filme filme : listaFilmes) {
            if (filme instanceof FilmeAcao) {
                filmesAcao.add((FilmeAcao) filme);
            }
        }

        return filmesAcao;
    }

    public static List<FilmeComedia> obterFilmesComedia() {
        List<FilmeComedia> filmesComedia = new ArrayList<>();

        for(Filme filme : listaFilmes) {
            if (filme instanceof FilmeComedia) {
                filmesComedia.add((FilmeComedia) filme);
            }
        }

        return filmesComedia;
    }

    public static List<FilmeDrama> obterFilmesDrama() {
        List<FilmeDrama> filmesDrama = new ArrayList<>();

        for(Filme filme : listaFilmes) {
            if (filme instanceof FilmeDrama) {
                filmesDrama.add((FilmeDrama) filme);
            }
        }

        return filmesDrama;
    }

    public static boolean excluirFilme(String titulo) {

        for (Filme filme : listaFilmes){
            if (filme.getTitulo().equals(titulo)) {
                listaFilmes.remove(filme);
                return true;
            }
        }

        return false;

    }
}