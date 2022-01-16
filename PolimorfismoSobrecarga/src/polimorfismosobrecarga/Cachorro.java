package polimorfismosobrecarga;

public class Cachorro extends Lobo {
    
    //METODOS SOBRESPOSTOS
    @Override
    public void emitirSom() {
        System.out.println("AU! AU! AU! AU! AU!");
    }
    
    //METODOS DE SOBRECARGA
    public void reagir(String frase) {
        if (frase.equals("Cachorrinho bonitinho!") || frase.equals("Bom menino!")) {
            System.out.println("O cachorrinho está abanando o rabo!");
        } else {
            System.out.println("O cachorrinho está rosnando!");
        }
    }
    
    public void reagir(int hora, int minuto) {
        if (hora < 12) {
            System.out.println("O cachorrinho está abanando o rabo!");
        } else if (hora >= 18) {
            System.out.println("O cachorrinho está te ignorando!");
        } else {
            System.out.println("O cachorrinho está abanando o rabo e latindo!");
        }
    }
    
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("O cachorrinho está abanando o rabo!");
        } else {
            System.out.println("O cachorrinho está rosnando e latindo!");
        }
    }
}
