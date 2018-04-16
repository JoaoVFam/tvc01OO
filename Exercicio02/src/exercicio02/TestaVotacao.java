/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

/**
 *
 * @author ice
 */
public class TestaVotacao {
    public static void main(String[] args){
        Votacao v = new Votacao(55);
        v.computaVotos();
        v.apurarEleicao();
    }
}
