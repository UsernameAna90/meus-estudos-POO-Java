package appbanco;

public class AppBanco {

    public static void main(String[] args) {
        //INSTANCIANDO UMA CONTA BANCARIA
        ContaBancaria ana = new ContaBancaria();
        
        //ABRINDO E PERSONALIZANDO A CONTA
        ana.abrirConta("CC");
        ana.setDonoConta("Ana Andrade");
        ana.setNumConta(010110);
        
        //MOVIMENTANDO A CONTA
        ana.sacarConta(20);
        ana.depositarConta(100);
        ana.sacarConta(200);
        ana.depositarConta(1000);
        ana.sacarConta(1010);
        ana.pagarMensal();
        ana.fecharConta();
        ana.sacarConta(1000);
        ana.sacarConta(118);
        ana.fecharConta();
        
        ana.statusConta();
    }
    
}
