/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

/**
 *
 * @author ice
 */
public class Eletrodomestico {
    private String nome;
    private float potencia, tempoDiario;
    
    Eletrodomestico(String nome, float potencia, float tempo){
            this.nome = nome;
            this.potencia = potencia;
            this.tempoDiario = tempo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float calculaConsumoMensal(){
        return potencia/(tempoDiario*30);
    }
    
    
}
