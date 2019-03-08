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
public class Q1_e {
    
    
    public static void main(String[] args) {
        
        int tam = 5;
        PilhaV<Integer> p = new PilhaV<>(tam);
    
        int i = 100;
        int n = 0;
        
        
        while (p.inserir(n++)) { 
        }
        
        for (int j = 0; j < tam; j++) {
            p.remover();
        }
        
        p.inserir(i);
    }
    
    
    
    
    
}
