/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diretor;

import java.util.Arrays;
import java.util.List;
import modelo.Bebida;
import builder.BebidaInterface;

/**
 *
 * @author mvictor
 */
public class Diretor {
    
    private BebidaInterface bebidaBuilder;
    
    public void setBebidaBuilder(BebidaInterface bebidaBuilder){
        this.bebidaBuilder = bebidaBuilder;
    }
    
    public Bebida getBebida(){
        return bebidaBuilder.getBebida();
    }
  
    public void construirCafe(){
        bebidaBuilder.buildNome("Café");
        bebidaBuilder.buildPreco(2.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Café Expresso", "Água Quente"
        ));
    }
    
    
    //cafes
    /**
     * Construir Café com leite.
     */
    public void construirCafeComLeite(){
        bebidaBuilder.buildNome("Café com Leite");
        bebidaBuilder.buildPreco(4.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Café Expresso", "Leite Quente"
        ));
    }
    
    public void construirCafeDescafeinado(){
        bebidaBuilder.buildNome("Café Descafeinado");
        bebidaBuilder.buildPreco(5.0);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Nescafé", "Água Fervente"
        ));
    }
    
    
    //capucino
    public void construirCappucinoTradicional(){
        bebidaBuilder.buildNome("Cappucino Tradicional");
        bebidaBuilder.buildPreco(5.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Chocolate", "Café Expresso",
            "Espuma", "Canela em Pó"
        ));
    }
    
    public void construirLatte(){
        bebidaBuilder.buildNome("Latte");
        bebidaBuilder.buildPreco(10.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Café Expresso", "Leite Vaporizado"
        ));
    }
    
    public void construirMocha(){
        bebidaBuilder.buildNome("Mocha");
        bebidaBuilder.buildPreco(12.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Café Expresso", "Leite Vaporizado",
            "Chocolate", "Chantilly"
        ));
    }
    
    public void construirMacchiato(){
        bebidaBuilder.buildNome("Macchiato");
        bebidaBuilder.buildPreco(3.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Café Expresso", "1/2 Leite Vaporizado"
        ));
    }
    
    
    //cha
    
    public void construirChaPreto(){
        bebidaBuilder.buildNome("Chá Preto");
        bebidaBuilder.buildPreco(10.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Camellia sinensis", "Leite","Açucar"
        ));
    }
    
    public void construirChaVerde(){
        bebidaBuilder.buildNome("Chá Verde");
        bebidaBuilder.buildPreco(10.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Camellia sinensis", "Água Gelada","Açucar"
        ));
    }
    
    public void construirChaHortela(){
        bebidaBuilder.buildNome("Chá de Hortelã");
        bebidaBuilder.buildPreco(12.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Hortelã", "Água Gelada","Açucar"
        ));
    }
    
    public void construirChaCamomila(){
        bebidaBuilder.buildNome("Chá de Camomila");
        bebidaBuilder.buildPreco(22.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Camomila", "Água Gelada","Açucar"
        ));
    }
    
    public void construirChaErvaDoce(){
        bebidaBuilder.buildNome("Chá de Erva Doce");
        bebidaBuilder.buildPreco(22.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Erva Doce", "Água Quente","Açucar"
        ));
    }
    
    public void construirChaGengibre(){
        bebidaBuilder.buildNome("Chá de Gengibre");
        bebidaBuilder.buildPreco(5.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Gengibre", "Nóz de Moscada", "Alho",
            "Água Quente","Açucar"
        ));
    }
    
    //chocolate
    public void construirChocolate(){
        bebidaBuilder.buildNome("Chocolate");
        bebidaBuilder.buildPreco(5.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Chocolate", "Leite Quente","Essencia de Baunilha"
        ));
    }
    
    public void construirSolveteDeChocolate(){
        bebidaBuilder.buildNome("Solvete de Chocolate");
        bebidaBuilder.buildPreco(4.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Chocolate", "Cobertura de Baunilha","Granulado",
            "Smafs"
        ));
    }
    
    public void construirMilkShake(){
        bebidaBuilder.buildNome("Milk Shake de Chocolate");
        bebidaBuilder.buildPreco(10.50);
        bebidaBuilder.buildIngredientes(Arrays.asList(
            "Chocolate batido", "Cobertura de Baunilha","Granulado",
            "Smafs", "Leite em Pó"
        ));
    }
    
    
}
