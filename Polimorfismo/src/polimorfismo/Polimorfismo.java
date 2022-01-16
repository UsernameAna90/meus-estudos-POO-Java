package polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        
        //INSTANCIANDO UM MAMIFERO
        Mamifero m = new Mamifero();
        m.setCorPelo("Amarelo");
        m.setIdade(1);
        m.setMembros(4);
        m.setPeso(10.3f);
        m.emitirSom();
        m.alimentar();
        m.locomover();
        
        //INSTANCIANDO UM RÉPTIL
        Reptil r = new Reptil();
        r.setCorEscama("Verde");
        r.setIdade(5);
        r.setMembros(0);
        r.setPeso(0.3f);
        r.emitirSom();
        r.alimentar();
        r.locomover();
        
        //INSTANCIANDO UM PEIXE
        Peixe p = new Peixe();
        p.setCorEscama("Cinza");
        p.setIdade(3);
        p.setMembros(0);
        p.setPeso(0.8f);
        p.emitirSom();
        p.alimentar();
        p.locomover();
        p.soltarBolhas();
        
        //INSTANCIANDO UMA AVE
        Ave a = new Ave();
        a.setCorPena("Branca");
        a.setIdade(2);
        a.setMembros(2);
        a.setPeso(0.4f);
        a.emitirSom();
        a.alimentar();
        a.locomover();
        a.fazerNinho();
        
        //INSTANCIANDO UM CANGURU
        Canguru can = new Canguru();
        can.setCorPelo("Marrom");
        can.setIdade(3);
        can.setMembros(4);
        can.setPeso(49.5f);
        can.emitirSom();
        can.alimentar();
        can.locomover();
        can.usarBolsa();
        
        //INSTANCIANDO UM CACHORRO  
        Cachorro cac = new Cachorro();
        cac.setCorPelo("Preto");
        cac.setIdade(1);
        cac.setMembros(4);
        cac.setPeso(21.1f);
        cac.emitirSom();
        cac.alimentar();
        cac.locomover();
        cac.enterrarOsso();
        cac.abanarRabo();
        
        //INSTANCIANDO UMA COBRA
        Cobra rep = new Cobra();
        rep.setCorEscama("Vermelho");
        rep.setIdade(6);
        rep.setMembros(0);
        rep.setPeso(10.6f);
        rep.emitirSom();
        rep.alimentar();
        rep.locomover();
        
        //INSTANCIANDO UMA TARTARUGA
        Tartaruga tar = new Tartaruga();
        tar.setCorEscama("Vermelho");
        tar.setIdade(6);
        tar.setMembros(0);
        tar.setPeso(10.6f);
        tar.emitirSom();
        tar.alimentar();
        tar.locomover();
        
        //INSTANCIANDO UM PEIXE DOURADO
        PeixeDourado pei = new PeixeDourado();
        pei.setCorEscama("Dourado");
        pei.setIdade(1);
        pei.setMembros(0);
        pei.setPeso(0.9f);
        pei.emitirSom();
        pei.alimentar();
        pei.locomover();
        pei.soltarBolhas();
        
        //INSTANCIANDO UMA ARARA
        Arara ara = new Arara();
        ara.setCorPena("Verde");
        ara.setIdade(3);
        ara.setMembros(2);
        ara.setPeso(0.7f);
        ara.emitirSom();
        ara.alimentar();
        ara.locomover();
        ara.fazerNinho();
    }
    
}
