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
public interface IFila<Tipo> extends Iterable<Tipo>{
    public void enfileirar(Tipo elemento);
    public Tipo desenfileirar();
    public int tamanho();
    public Tipo primeiro();
    public boolean vazio();
    public void limpar();
}
