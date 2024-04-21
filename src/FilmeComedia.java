public class FilmeComedia extends Filme{
    
    private String tipoComedia; 

    public FilmeComedia(String titulo, int duracao, String tipoComedia) {
        super(titulo, duracao);
        this.tipoComedia = tipoComedia;
    }

    public String getTipoComedia() {
        return tipoComedia;
    }

    public void setTipoComedia(String tipoComedia) {
        this.tipoComedia = tipoComedia;
    }

    @Override
    public String toString() {
    String txt = super.toString() + "\nTipo de Comedia: " + tipoComedia;
    return txt;
    }
}
