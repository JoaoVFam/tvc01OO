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
public class TestePrograma {
    public static void main(String[] args){
        ArrayList<Eletrodomestico> eletros = new ArrayList<Eletrodomestico>();
        for(int i=0; i<5; i++){
            Eletrodomestico e = new Eletrodomestico("nome"+i, 120, 160);
            eletros.add(e);
        }
        
        Casa c = new Casa(eletros);
        c.imprimeConsumoTotal();
    }
    
}
