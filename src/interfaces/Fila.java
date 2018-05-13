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
public interface Fila<Tipo> extends Iterable<Tipo>{
    public void enfileirar(Tipo elemento);
    public Tipo desenfileirar();
    public int tamanho();
    public Tipo primeiro();
    public int vazio();
    public void limpar();
}
