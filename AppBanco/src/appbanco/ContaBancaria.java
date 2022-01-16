package appbanco;

public class ContaBancaria {
    
    //DECLARANDO ATRIBUTOS DA CONTA
    public int numConta;
    protected String tipoConta;
    private boolean statusConta;
    private String donoConta;
    private float saldoConta;  
    
    //DECLARANDO MÉTODOS AUXILIARES GETTERS E SETTERS
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public final void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public final void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }
    
    //DECLARANDO MÉTODO CONSTRUTOR
    public ContaBancaria(){
        this.setStatusConta(false);
        this.setSaldoConta(0);
    }
    
    //DECLARANDO MÉTODO PARA DEMONSTRAR O ESTADO DA CONTA
    public void statusConta() {
        System.out.println("---------------------------------------");
        System.out.println("Numero da conta: " + getNumConta());
        System.out.println("Tipo da conta: " + getTipoConta());
        System.out.println("Status da conta: " + isStatusConta());
        System.out.println("Dono da conta: " + getDonoConta());
        System.out.println("Saldo da conta: " + getSaldoConta());
        System.out.println("---------------------------------------");
    }
    
    //DECLARANDO MÉTODOS ESPECÍFICOS
    public void abrirConta(String tipoConta) {
        this.setStatusConta(true);
        this.setTipoConta(tipoConta);
        
        //Conta corrente recebe 50 reais aos ser aberta, e conta poupanca receve 150 reais.
        if (getTipoConta().equals("CC")) {
            this.setSaldoConta(50);
        } else if (getTipoConta().equals("CP")) {
            this.setSaldoConta(150);
        }
        
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void depositarConta(float deposito) {
        if (isStatusConta()){
            this.setSaldoConta(this.getSaldoConta() + deposito);
            System.out.printf("Depósito de R$%.2f reais realizado com sucesso!\n", deposito);
        } else {
            System.out.println("Conta fechada! Impossível realizar depósito!");
        }
    }
    
    public void sacarConta(float saque) {
        if (isStatusConta()) {
            if (getSaldoConta() > 0 && saque <= getSaldoConta()){
                if (saque <= 1000) {
                    this.setSaldoConta(this.getSaldoConta() - saque);
                    System.out.printf("Saque de R$%.2f reais realizado com sucesso!\n", saque);
                } else {
                    System.out.println("Impossível sacar! Saque máximo permitido: R$1000,00!");
                }   
            }else {
                System.out.println("Impossível sacar! Saldo Insuficiente!");
            }
        } else {
            System.out.println("Conta fechada! Impossível realizar saque!");
        }
    }
    
    public void pagarMensal() {
        float CC = 12;
        float CP = 20;
        
        if (isStatusConta()) {
            if (getTipoConta().equals("CC") && getSaldoConta() >= 12){
                this.setSaldoConta(this.getSaldoConta() - CC);
                System.out.printf("Desconto mensal de R$%.2f reais realizado com sucesso!\n", CC);
            }else if (getTipoConta().equals("CP") && getSaldoConta() >= 20){
                this.setSaldoConta(this.getSaldoConta() - CP);
                System.out.printf("Desconto mensal de R$%.2f reais realizado com sucesso!\n", CP);
            }else {
                System.out.println("Saldo Insuficiente! Impossível debitar mensalidade!");
            }
        } else {
            System.out.println("Conta fechada! Impossível debitar mensalidade!");
        }
    }
    
    public void fecharConta() {
        if (getSaldoConta() == 0) {
            this.setStatusConta(false);
            System.out.println("Conta fechada com sucesso!");
        }else {
            System.out.println("Conta possui saldo! Impossível fechar conta!");
        }
    }
}
