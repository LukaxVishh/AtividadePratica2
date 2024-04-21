public class FilmeAcao extends Filme{

    private String tipoAcao; 
    
    public FilmeAcao(String titulo, int duracao, String tipoAcao) {
        super(titulo, duracao);
        this.tipoAcao = tipoAcao;
    }
    
    public String getTipoAcao() {
        return tipoAcao;
    }
    
    public void setTipoAcao(String tipoAcao) {
        this.tipoAcao = tipoAcao;
    }
    
    @Override
    public String toString() {
    String txt = super.toString() + "\nTipo de Acao: " + tipoAcao; 
    return txt;
    }
   
}

