package Exercicios;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 312182006
 */
public class Q1_f {
    
    public static void main(String[] args) {
        
        int tam = 5;
        PilhaV<Integer> p = new PilhaV<>(tam);
        PilhaV<Integer> p2 = new PilhaV<>(tam);
        
        
        
        int i = 0;
        int n = 100;
        
        while(p.inserir(i++)){}
        
        
        
        int valores = p.remover();
        
        
        while(!p.estaVazia()){
            p2.inserir(valores);
            System.out.println("P2: "+valores);
            i--;
        }
        
        
        
        
        
        
                
        
    }
    
    
}
