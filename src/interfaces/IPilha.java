package interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 11645
 */
public interface IPilha<Tipo> extends Iterable<Tipo>{
    public Tipo topo();
    public boolean vazio();
    public int tamanho();
    public void empilhar(Tipo elemento);
    public Tipo desempilhar();
    public void limpar();
}
