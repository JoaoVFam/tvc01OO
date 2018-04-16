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
public class ContaPoupanca {
    public static float taxaJurosAnual;
    
    private String codigoBanco, codigoAgencia, numeroContaPoupanca; 
    private String nomeCliente;
    private String CPF;
    private float saldoAtual;
    
    public static void atualizaTaxaJuros(float value){
        taxaJurosAnual = value/100;
    }
    
    ContaPoupanca(String codigoBanco, String codigoAgencia, String numeroContaPoupanca, float saldoAtual){
        this.codigoBanco = codigoBanco;
        this.codigoAgencia = codigoAgencia;
        this.numeroContaPoupanca = numeroContaPoupanca;
        this.saldoAtual = saldoAtual;
    }
    
    public String getCogigoBanco(){
        return this.codigoBanco;
    }
    
    public void setCodigoBanco(String value){
        this.codigoBanco = value;
    }
    
    public String setCodigoAgencia(){
        return this.codigoAgencia;
    }
    
    public void setCodigoAgencia(String value){
        this.codigoAgencia = value;
    }
    
    public String getNumeroContaPoupanca(){
        return this.numeroContaPoupanca;
    }
    
    public void setNumeroContaPoupanca(String value){
        this.numeroContaPoupanca = value;
    }
    
    public String getCPF(){
        return this.CPF;
    }
    
    public void setCPF(String value){
        this.CPF = value;
    }
    
    public String getNomeCliente(){
        return this.nomeCliente;
    }
    
    public void setNomeCliente(String value){
        this.nomeCliente = value;
    }
    
    public float getSaldoAtual(){
        return this.saldoAtual;
    }
    
    public void setSaldoAtual(float value){
        this.saldoAtual = value;
    }
    
    public float calculaJurosMensal(){
        float jurosMensal = (this.saldoAtual * taxaJurosAnual)/12;
        this.saldoAtual+=jurosMensal;
        return jurosMensal;
    }
    
    public void geraDigitoCPF(){
        String cpf = this.CPF;
        int somatorio = 0, auxiliar = 10;
        for(int i = 0; i<2; i++){
            char digito = cpf.charAt(i);
            somatorio += digito*auxiliar;
            System.out.println(somatorio);   
            auxiliar--;
        }
        
        
    }
    
}
