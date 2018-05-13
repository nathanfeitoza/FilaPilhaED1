/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filapilha;

import Pilha.Pilha;

/**
 *
 * @author nathan
 */
public class Filapilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>();
        
        pilha.empilhar("Primeiro");
        pilha.empilhar("Primeiro 2");
        pilha.empilhar("Primeiro 3");
        String elementoTopo = pilha.desempilhar();
        System.out.println("Topo: "+elementoTopo);
        if(pilha.vazio()) {
            System.out.println("Zerada!");
        }
        /*String elementoTopo = pilha.desempilhar();
        
        if(pilha.vazio()) {
            System.out.println("Zerada!");
        }*/
        
        for (String elemento : pilha) {
            System.out.println(elemento);
        }
    }
    
}
