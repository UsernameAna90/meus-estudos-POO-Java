package relacionamentoclasses;

public class RelacionamentoClasses {

    public static void main(String[] args) {
        
        //CRIANDO UM VETOR PARA ARMAZENAR OS OBJETOS "LUTADORES"
        Lutador l[] = new Lutador[6];
        
        // CRIANDO LUTADORES
        l[0] = new Lutador("Pretty Boy", "Francês", 31, 1.75f,  68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasileiro", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "Norte-americano", 35, 1.65f, 80.9f, 12, 2 ,1);
        l[3] = new Lutador("Dead Code", "Australiano", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Ufocobol", "Brasileiro", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", "Norte-americano", 30, 1.81f, 105.7f, 12, 2, 4);
        
        //CRIANDO CLASSE "LUTA"
        Luta UEC01 = new Luta();
        
        //CRIANDO LUTAS ENTRE OS LUTADORES
        UEC01.marcarLuta(l[5], l[4]);
        UEC01.lutar();
    }
}
