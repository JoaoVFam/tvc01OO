/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import java.util.*;

/**
 *
 * @author ice
 */
public class Votacao {
    ArrayList<Integer> votos;
    private int numEleitores;

    public Votacao(int numEleitores) {
        this.votos = new ArrayList<>();
        this.numEleitores = numEleitores;
    }
    
    
    public int computaVotos(){
        Scanner s = new Scanner(System.in);
        int i;
        for(i=0; i<numEleitores; i++){
            System.out.println("Voto:");
            int voto = s.nextInt();
            if(voto >= 0)
                this.votos.add(voto);
        }
        return i;
    }
    
    public void apurarEleicao(){
        int nulos=0, brancos=0, candidato1=0, candidato2=0, candidato3=0;
        for(int i=0; i<numEleitores; i++){
            switch(this.votos.get(i)){
                case 0: brancos++;
                break;
                case 1: candidato1++;
                break;
                case 2: candidato2++;
                break;
                case 3: candidato3++;
                break;
                default: nulos++;
            }
        }
        System.out.println("apurando eleicao");
        System.out.println("Numero de votos:");
        System.out.println("cadidato 1: "+ candidato1);
        System.out.println("cadidato 2: "+ candidato2);
        System.out.println("cadidato 3: "+ candidato3);
        System.out.println("votos brancos: "+ brancos);
        System.out.println("votos nulos: "+ nulos);
        
    }
}
