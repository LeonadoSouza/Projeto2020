
package pacote;

public class BancoObjetos {
    public static void main (String[] args){
        
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        conta1.setConta(1);
        conta1.setNome("Jonas");
        conta1.setSaldo(200);
        
        
        conta2.setConta(2);
        conta2.setNome("Juca");
        conta2.setSaldo(500);
        
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        
        
    }

}
    

