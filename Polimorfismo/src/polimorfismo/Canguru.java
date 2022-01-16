package polimorfismo;

public final class Canguru extends Mamifero {

    //METODOS 
    public void usarBolsa() {
        System.out.println("O canguru está usando a bolsa!");
    }
    
    //METODOS SOBRESCRITOS
    @Override
    public void locomover() {
        System.out.println("Cangurus saltam!");
    }
}
