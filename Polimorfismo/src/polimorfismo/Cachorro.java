package polimorfismo;

public final class Cachorro extends Mamifero{
    
    //METODOS
    public final void enterrarOsso() {
        System.out.println("O cachorro está enterrando o osso!");
    }
    
    public final void abanarRabo() {
        System.out.println("O cachorro está abanando o rabinho!");
    }
    
    //METODOS SOBRESCRITOS
    @Override
    public void emitirSom() {
        System.out.println("Cachorros latem!");
    }
    
}
