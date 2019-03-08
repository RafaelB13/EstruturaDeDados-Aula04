package Exercicios;


public class Q1_c {
	
	/*
	 * 1 � [Simples] Use as opera��es push, pop, stacktop e empty para construir opera��es que fa�am o seguinte:
       c. Dado um inteiro n, definir i como o en�simo elemento a partir do topo da pilha, deixando a pilha sem seus n elementos superiores.

	 */
	public static void main(String[] args) {
		PilhaV<Integer> p = new PilhaV<Integer>(10);

		int numero = 0;
		int n = 5;
		 
		while(p.inserir(numero++)) {}
				
		int i = 100;
		//se o i tem que ser o segundo elemento a partir do topo, eu tenho que remover
		//tr�s elementos
		
		//removendo o topo e n elementos a partir dele
		for(int j=0; j<=n; j++ )
			p.remover();
		
		//inserindo i no lugar do en�simo elemento a partir do topo
		p.inserir(i);				
		
	
	}
}


