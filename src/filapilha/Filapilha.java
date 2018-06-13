/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filapilha;

import Fila.Fila;
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
        Fila<String> fila = new Fila<>();
        fila.enfileirar("Teste 1");
        fila.enfileirar("Teste 2");
        fila.enfileirar("Teste 3");
        fila.enfileirar("Teste 4");
        fila.enfileirar("Teste 5");
        fila.enfileirar("Teste 6");
        fila.enfileirar("Teste 7");

       int pos = 0; 
       fila.desenfileirar();
       fila.desenfileirar();
       fila.desenfileirar();
       fila.desenfileirar();
       fila.desenfileirar();
       fila.desenfileirar();
        for (String elemento : fila) {
            System.out.println(elemento);
            pos++;
        }
        
        /*Pilha<String> pilha = new Pilha<String>();
        
        pilha.empilhar("Primeiro");
        pilha.empilhar("Primeiro 2");
        pilha.empilhar("Primeiro 3");
        String elementoTopo = pilha.desempilhar();
        System.out.println("Topo: "+elementoTopo);
        if(pilha.vazio()) {
            System.out.println("Zerada!");
        }*/
        /*String elementoTopo = pilha.desempilhar();
        
        if(pilha.vazio()) {
            System.out.println("Zerada!");
        }*/
        
        /*for (String elemento : pilha) {
            System.out.println(elemento);
        }*/
    }
    
}
