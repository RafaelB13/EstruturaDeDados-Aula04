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
public class Q1_g {

    public static void main(String[] args) {
        int tam = 10;

        PilhaV<Integer> p = new PilhaV<>(tam);
        PilhaV<Integer> p2 = new PilhaV<>(tam);

        int numero = 100;
        int n = 0;

        while (p.inserir(n++)) {
            System.out.println("Posicao: " + n);
        }

        int a = p.remover();
        int b = p.remover();
        int c = p.remover();
        p.remover();

        p.inserir(numero);
        p.inserir(c);
        p.inserir(b);
        p.inserir(a);

    }

}
