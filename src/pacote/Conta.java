package pacote;



public class Conta {
    
    int conta;
    String nome;
    float saldo;
    float cheque;

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
    
    public boolean credito ( float valor){
        if(this.saldo + this.cheque >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    
    public void debito(float valor){
        this.saldo += valor;
    }

    public float getCheque() {
        return cheque;
    }

    public void setCheque(float cheque) {
        this.cheque = cheque;
    }
    
    
   
    
    public String imprimeConta(){
        return "Conta: " + this.conta + " - " + this.nome + " - Saldo: R$ " + this.saldo;
    }

          
}
