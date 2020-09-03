
package pacote;

public class BancoObjetos {
    public static void main (String[] args){
        
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        conta1.setConta("1");
        conta1.setNome("Jonas");
        conta1.setSaldo(200);
        conta1.setCheque_especial(500);
        
        
        conta2.setConta("2");
        conta2.setNome("Juca");
        conta2.setSaldo(500);
        conta2.setCheque_especial(1000);
        
        System.out.println(conta1.imprimeConta());
        System.out.println(conta2.imprimeConta());
        
        
        conta1.credito(50);
        conta2.debito(200);
        
        System.out.println(conta1.imprimeConta());
        System.out.println(conta2.imprimeConta());
    }

}
    

