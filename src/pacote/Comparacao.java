/*
Faça um programa que compare textos e valores (Strings e int)
 */
package pacote;

public class Comparacao {
    public static void main (String[] args){
        int num1 = 5;
        int num2 = 20;
        String nome1 = "Leo";
        String nome = "Leo";
    
    
        if(num1 == num2){
            System.out.println("Os numeros não iguais");
        }else{
            System.out.println("Os numeros não são iguais");
        }
        if(nome1.equals(nome)){
            System.out.println("Os nomes são iguais");
        }else{
            System.out.println("Os nomes não são iguais");
        }
    }
}
