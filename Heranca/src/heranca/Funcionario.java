package heranca;

public class Funcionario extends Pessoa{
    
    //ATRIBUTOS
    private String setor;
    private boolean trabalhando;
    
    //METODOS AUXILIARES
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    //METODOS COMPORTAMENTAIS
    public void pedirDemissao() {
        this.setTrabalhando(false);
    }
    
    
    
}
