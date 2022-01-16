package controleremoto;

public final class ControleFuncoesEncapsuladas implements ControleInterface {
    
    //DECLARANDO ATRIBUTOS DO CONTROLE
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //DECLARANDO METODOS AUXILIARES 
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //DECLARANDO METODO CONSTRUTOR
    public ControleFuncoesEncapsuladas(){
        this.setLigado(false);
        this.setVolume(50);
    }
    
    //DECLARANDO SOBRESCRIÇÃO DOS MÉTODOS ABSTRATOS

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("--------------------MENU--------------------");
            System.out.println("A televisão está ligada? R:" + isLigado());
            System.out.println("A televisão está reproduzingo? R:" + isTocando());
            System.out.println("O volume atual da televisão está em " + getVolume());
            System.out.print("Volume: ");
            
            for (int i = 0; i < getVolume(); i++) {
                System.out.print("|");
            }
            
            System.out.println("\n--------------------------------------------");
        } else {
            System.out.println("A televisão está desligada! Impossível abrir o menu!");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()) {
            System.out.println("Fechando menu...");
        } else {
            System.out.println("A televisão está desligada! Impossível fechar o menu!");
        }
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 1);
            
            System.out.print("Volume: ");
            
            for (int i = 0; i < getVolume(); i++) {
                System.out.print("|");
            }
            
            System.out.print("\n");
        } else {
            System.out.println("A televisão está desligada! Impossível aumentar o volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 1);
            
            System.out.print("Volume: ");
            
            for (int i = 0; i < getVolume(); i++) {
                System.out.print("|");
            }
            
            System.out.print("\n");
        } else {
            System.out.println("A televisão está desligada! Impossível diminuir o volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado()) {
            this.setVolume(0);
            System.out.println("O volume está mutado!");        
        } else {
            System.out.println("A televisão está desligada! Impossível mutar o volume!");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado()) {
            if (this.getVolume() == 0){
                this.setVolume(50);
                System.out.println("O volume está desmutado!");
            } else {
                System.out.println("O volume não está mutado! Impossível desmutar!");
            }      
        } else {
            System.out.println("A televisão está desligada! Impossível desmutar o volume!");
        }
    }

    @Override
    public void play() {
        if (this.isLigado()) {
            if (this.isTocando()) {
                System.out.println("A televisão já está reproduzindo! Impossível dar play!");
            } else {
                this.setTocando(true);
                System.out.println("A televisão está reproduzindo agora!");
            }
        } else {
            System.out.println("A televisão está desligada! Impossível dar play!");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado()) {
            if (this.isTocando()) {
                this.setTocando(false);
                System.out.println("A televisão está pauaada agora!");               
            } else {
                System.out.println("A televisão já está pausada! Impossível pausar!");
            }
        } else {
            System.out.println("A televisão está desligada! Impossível pausar!");
        }
    }
    
}
