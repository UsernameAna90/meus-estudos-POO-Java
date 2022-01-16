package controleremoto;

public class ControleRemoto {

    public static void main(String[] args) {
        ControleFuncoesEncapsuladas c1 = new ControleFuncoesEncapsuladas();
        
        c1.ligar();
        c1.play();
        c1.pause();
        c1.maisVolume();
        c1.ligarMudo();
        
        c1.abrirMenu();
        c1.desligar();
        c1.menosVolume();
    }
    
}
