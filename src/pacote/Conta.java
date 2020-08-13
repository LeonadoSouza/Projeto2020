package pacote;

public class Conta {
    
    int conta;
    String nome;
    float saldo;

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void saque ( float valorSaque){
        this.saldo -= valorSaque;
    }
    
    public void deposito(float valorDeposito){
        this.saldo += valorDeposito;
    }
   
    @Override
    public String toString(){
        return "Conta: " + this.conta + " - " + this.nome + " - Saldo: R$ " + this.saldo;
    }
    
          
}
