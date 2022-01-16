package polimorfismosobrecarga;

public class PolimorfismoSobrecarga {

    public static void main(String[] args) {
        
        //INSTANCIANDO MAMIFERO
        Mamifero m = new Mamifero();
        m.setPeso(15.6f);
        m.setIdade(3);
        m.setMembros(4);
        m.emitirSom();
        
        //INSTANCIANDO LOBO
        Lobo l = new Lobo();
        l.setPeso(27.2f);
        l.setIdade(5);
        l.setMembros(4);
        l.emitirSom();
        
        //CACHORRO
        Cachorro c = new Cachorro();
        c.setPeso(10.6f);
        c.setIdade(1);
        c.setMembros(4);
        c.emitirSom();
        c.reagir(15, 15);
        c.reagir("Bom menino!");
    }
    
}
