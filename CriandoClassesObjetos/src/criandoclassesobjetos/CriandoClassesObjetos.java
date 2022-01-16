package criandoclassesobjetos;

public class CriandoClassesObjetos {

    public static void main(String[] args) {
        // Instanciando a ClasseCaneta, criando um objeto
        ClasseCaneta c1 = new ClasseCaneta();
        
        c1.cor = "preta";
        c1.modelo = "padrão";
        c1.ponta = (float) 0.5;
        
        c1.status();
        c1.tampar();
        c1.escrever();
    }
    
}
