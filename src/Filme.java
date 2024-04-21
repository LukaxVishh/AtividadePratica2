public class Filme {

    private String titulo;
    private int duracao; 
    
    public Filme(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getDuracao() {
        return duracao;
    }
    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    @Override
    public String toString() {
        String txt = "\nTitulo: " + titulo + "\nDuracao: " + duracao + "minutos";
        return txt;
    }
}