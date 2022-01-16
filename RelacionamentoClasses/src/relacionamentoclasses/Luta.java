package relacionamentoclasses;

public class Luta {
    
    //DECLARANDO ATRIBUTOS
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovado;
    
    //DECLARANDO METODOS AUXILIARES

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    //DECLARANDO MÉTODOS ESPECIAIS
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovado = true;
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.aprovado = false;
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar() {
        if (this.aprovado == true) {
            desafiado.apresentar();
            desafiante.apresentar();
            
            System.out.println("------------- RESULTADO DA LUTA -------------");
            boolean c1 = desafiado.getPeso() > desafiante.getPeso() && desafiado.getAltura() > desafiante.getAltura();
            boolean c2 = (desafiado.getPeso() > desafiante.getPeso() || desafiado.getAltura() > desafiante.getAltura()) &&
                         desafiado.getVitorias() > desafiante.getVitorias();
            
            if (c1){
                desafiado.ganharLuta();
                desafiante.perderLuta();
                System.out.println("Vitória do desafiado " + desafiado.getNome() + "!");
            } else if (c2) {
                desafiado.ganharLuta();
                desafiante.perderLuta();
                System.out.println("Vitória do desafiado " + desafiado.getNome() + "!");
            } else {
                desafiado.perderLuta();
                desafiante.ganharLuta();
                System.out.println("Vitória do desafiante " + desafiante.getNome() + "!");
            }
        } else {
            System.out.println("Luta não aprovada!");
        }
    }
}
