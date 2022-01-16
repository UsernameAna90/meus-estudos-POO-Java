package herancaparte2;

public class HerancaParte2 {

    public static void main(String[] args) {
        
        //Pessoa p1 = new Pessoa(); Classes abstratas não podem ser instanciadas
        
        //INSTANCIANDO CLASSE POBRE VISITANTE
        Visitante v1 = new Visitante("Ana", 21, "Feminino");
        System.out.println(v1.toString());
        
        //INSTANCIANDO CLASSE DIFERENTE PROFESSOR
        Professor p1 = new Professor("lucas", 25, "Masculino", "Ciência de Dados", 7000f);
        System.out.println(p1.toString());
        p1.receberAumento(1000f);
        System.out.println(p1.getSalario());
        
        //INSTANCIANDO CLASSE DIFERENTE ALUNO
        Aluno a1 = new Aluno();
        a1.setNome("Pedro");
        a1.setIdade(33);
        a1.setSexo("Masculino");
        a1.setMatricula(true);
        a1.setCurso("Engenharia de Dados");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        
        //INSTANCIANDO CLASSE DIFERENTE BOLSISTA
        Bolsista b1 = new Bolsista("Emanuel", 25, "Masculino", "Ciência da Computação", "Bolsa de 100%");
        b1.informacoes();
        b1.pagarMensalidade();
        
        //INSTANCIANDO CLASSE DIFERENTE TECNICO
        Tecnico t1 = new Tecnico("Rodrigo", 19, "Masculino", "Engenharia Mecatrônica", "Ativo");
        t1.fazerAniversario();
        t1.informacoes();
    }
    
}
