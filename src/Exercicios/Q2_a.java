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
public class Q2_a {
    
    public static void main(String[] args) {
        
        PilhaV<Character> p = new PilhaV<>(10);
        
        //String s = "{[A+B*(C+D)+E]}";
        String s = "(A+B}}";
        
        boolean flagErro = false;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(( c == '{') ||( c == '[') ||( c == '(')){
                p.inserir(c);
            }else if((c == '}') || ( c == ']') || ( c == ')') ){
                char r = p.remover();
                if(((c=='}') && (r != '{')) || ((c==']')&&(r!='[')) || ((c=='(')&&(r!=')'))){
                    flagErro = true;
                    break;
                }
            }
        }
        
        if(!p.estaVazia()){
            flagErro = true;
        }
        
        if(flagErro){
            System.out.println("A String "+ s + "possui erro");
        }else
            System.out.println("A String nao possui erro");
        
    }
    
}
