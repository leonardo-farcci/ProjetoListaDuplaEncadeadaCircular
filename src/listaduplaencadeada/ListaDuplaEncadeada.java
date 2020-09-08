/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaduplaencadeada;

/**
 *
 * @author lab212
 */
public class ListaDuplaEncadeada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l = new Lista();
        l.inserirInicio(1);
        l.inserirFim(10);
        l.inserirInicio(0);
        l.inserirFim(12);
        System.out.println(l.exibir());
        l.removerFim();
        l.removerInicio();
        System.out.println(l.exibir());
    }

}
