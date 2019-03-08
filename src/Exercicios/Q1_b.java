package Exercicios;


public class Q1_b {
	/*
	 * 1 � [Simples] Use as opera��es push, pop, stacktop e empty para construir opera��es que fa�am o seguinte:
     b - Definir i com o segundo elemento a partir do topo da pilha, deixando a pilha inalterada.

	 */
	public static void main(String[] args) {
		PilhaV<Integer> p = new PilhaV<Integer>(10);
		int numero = 0;
		
		while(p.inserir(numero++)) {}
				
		int i = 100;
		//se o i tem que ser o segundo elemento a partir do topo, eu tenho que remover
		//tr�s elementos
		
		//removendo o topo (e salvando em uma vari�vel)
		int aux = p.remover();
		//removendo o primeiro elemento a partir do do topo  (e salvando em uma vari�vel)
		int aux2 = p.remover();
		//removendo o segundo elemento a partir do topo (n�o preciso salvar)
		p.remover();
		
		//inserindo i no lugar do segundo elemento a partir do topo
		p.inserir(i);				
		
		//coloca os dois elementos no mesmo local
		p.inserir(aux2);
		p.inserir(aux);

}

}
