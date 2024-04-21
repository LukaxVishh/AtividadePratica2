class FilmeDrama extends Filme {
    
    private String tema; 

    public FilmeDrama(String titulo, int duracao, String tema) {
        super(titulo, duracao);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
    String txt = super.toString() + "\nTema: " + tema;
    return txt;
    }
}
