package polimorfismo;

public class Ave extends Animal{
    
    //ATRIBUTOS
    protected String corPena;
    
    //METODOS AUXILIARES
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    //SOBRESCRICAO DOS METODOS HERDADOS
    @Override
    public void locomover() {
        System.out.println("Pássaros voam!");
    }

    @Override
    public void alimentar() {
        System.out.println("Pássaros se alimentam de frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de pássaro!");
    }
    
    //METODOS
    public void fazerNinho() {
        System.out.println("Fazendo um lindo ninho!");
    }
}
