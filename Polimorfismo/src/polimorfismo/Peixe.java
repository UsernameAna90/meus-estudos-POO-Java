package polimorfismo;

public class Peixe extends Animal {
    
    //ATRIBUTOS
    protected String corEscama;
    
    //METODOS AUXILIARES
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //SOBRESCRICAO DOS METODOS HERDADOS
    @Override
    public void locomover() {
        System.out.println("Peixes nadam!");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixes se alimentam de algas!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de peixe!");
    }
    
    //METODOS
    public void soltarBolhas() {
        System.out.println("Soltando bolhinhas!");
    }
}
