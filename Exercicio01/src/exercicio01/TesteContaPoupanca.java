/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author ice
 */
public class TesteContaPoupanca {
    public static void main(String[] args){
        ContaPoupanca poup1 = new ContaPoupanca("CódigoBanco1", "codigoAgencia1", "numeroContaPoupanca1", 2000);        
        ContaPoupanca poup2 = new ContaPoupanca("CódigoBanco2", "codigoAgencia2", "numeroContaPoupanca2", 3000);
        poup1.setNomeCliente("Nome 1");
        poup2.setNomeCliente("Nome 2");
        
        
        ContaPoupanca.atualizaTaxaJuros(4);
        System.out.println("Juros mensal de poup1: "+poup1.calculaJurosMensal());
        System.out.println("Novo saldo de poup1: "+poup1.getSaldoAtual());
        
        ContaPoupanca.atualizaTaxaJuros(5);
        System.out.println("Juros mensal de poup2: "+poup2.calculaJurosMensal());
        System.out.println("Novo saldo de poup2: "+poup2.getSaldoAtual());
        
    }   
    
}
