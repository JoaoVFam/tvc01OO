/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import java.util.*;

/**
 *
 * @author ice
 */
public class Casa {
    public static int numEletros;
    
    private ArrayList<Eletrodomestico> eletroDomesticos;
    
    
    Casa(ArrayList<Eletrodomestico> eletros){
        this.eletroDomesticos = eletros;
        this.numEletros = eletros.size();
    }
    
    public void addEletro(Eletrodomestico eletro){
        this.eletroDomesticos.add(eletro);
    }
    
    public float calculaConsumoTotal(){
        float consumoTotal = 0;
        for(int i=0; i<this.eletroDomesticos.size(); i++){
            consumoTotal += this.eletroDomesticos.get(i).calculaConsumoMensal();
        }
        return consumoTotal;
    }
    
    public void imprimeConsumoTotal(){
        float consumoTotal = this.calculaConsumoTotal();
        System.out.println("Consumo total no mês: "+ consumoTotal);
        for(int i=0; i<this.eletroDomesticos.size(); i++){
            float consumoRelativo;
            Eletrodomestico eletro = this.eletroDomesticos.get(i);
            consumoRelativo = (eletro.calculaConsumoMensal()*100)/this.calculaConsumoTotal();
            System.out.println("Consumo relativo do eletrodomestico "+ eletro.getNome() +": "+consumoRelativo+"%");
        }
    }
}
