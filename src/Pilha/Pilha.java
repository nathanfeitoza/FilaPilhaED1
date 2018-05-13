/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

import interfaces.IPilha;
import java.security.InvalidParameterException;
import java.util.Iterator;

/**
 *
 * @author nathan
 */
public class Pilha<Tipo> implements IPilha<Tipo>{
     private Tipo[] elements;
    private int inicial = 10;
    private int contador;
    private int capacidadeTotal = 10;

    public Pilha() {
        this.elements = (Tipo[]) new Object[inicial];
    }

    /*public Pilha(int capacidadeInicial) {
      this.elements = (Tipo[]) new Object[capacidadeInicial];
      this.capacidadeTotal = capacidadeInicial;
    }*/
    
    private void Redimensionar()
    {
        if(this.contador == this.capacidadeTotal)
        {
            Tipo[] arr_aux = (Tipo[]) new Object[(this.elements.length + 1) * 2];
            for(int i = 0; i < this.elements.length; i++)
            {
                arr_aux[i] = this.elements[i];
            }
            this.elements = arr_aux;
        }
    }
    protected void adicionar(int posicao, Tipo elemento) throws InvalidParameterException {
        int quantidade = this.tamanho(); 
        boolean checarCapacidade = (this.capacidadeTotal - 1) >= posicao;
        if(checarCapacidade)
        {
            if(this.contador != posicao)
            {
                for(int i = this.contador; i > posicao; i--)
                {
                    Tipo arr_aux = this.elements[i];
                    this.elements[i] = this.elements[i - 1];
                    this.elements[i - 1] = arr_aux;
                }
            }
            if(posicao <= (this.capacidadeTotal))
            {
                this.elements[posicao] = elemento;
                this.contador++;

                if(posicao > (this.contador - 1))
                {
                   this.contador = this.capacidadeTotal;
                }
            }
            else
            {
                throw new InvalidParameterException("Valor maior que o permitido");
            }
           
        }
        else
        {
              throw new InvalidParameterException("Capacidade total do vetor atingida");
        }

    }
    protected void remover(){
        int posicao = 0;
        this.elements[posicao] = null;
        for(int i = posicao; i < this.contador; i++)
        {
            this.elements[i] = this.elements[i + 1];
        }
        this.contador--;
    }
    protected Tipo obter(int posicao) throws InvalidParameterException {
        Tipo algo = null;
        
        if(posicao <= this.tamanho() && this.tamanho() != 0)
        {
            algo = this.elements[posicao];
        }
        else
        {
           throw new InvalidParameterException("Posição não encontrada");
        }
        return algo;
    }
    @Override
    public int tamanho() {
        try
        {
            return this.contador;    
        } catch(Exception e)
        {
            return 0;
        }
    }

    @Override
    public Tipo topo() {
        return this.obter(0);    
    }

    @Override
    public boolean vazio() {
        return this.contador == 0;
    }

    @Override
    public void empilhar(Tipo elemento) {
        this.adicionar(0, elemento);
    }

    @Override
    public Tipo desempilhar() {
        Tipo obter_valor = this.obter(0);
        this.remover(); 
        return obter_valor;
    }

    @Override
    public void limpar() {
        this.elements = (Tipo[]) new Object[this.inicial];
        this.contador = 0;    
    }

    @Override
    public Iterator<Tipo> iterator() {
        return new IteradorPilha();
    }
    
    private class IteradorPilha implements Iterator<Tipo>{
        
        int pos = 0;
        @Override
        public boolean hasNext() {
            return pos < tamanho();
        }

        @Override
        public Tipo next() {
            return elements[pos++]; //return elementos[i];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}
