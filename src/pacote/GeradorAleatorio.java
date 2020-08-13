/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.util.Random;

/**
 *
 * @author Leonardo
 */
public class GeradorAleatorio {
    public static void main (String[] args){
    Random gerador = new Random();
                
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt(5) + 1);
        }
    }
}
