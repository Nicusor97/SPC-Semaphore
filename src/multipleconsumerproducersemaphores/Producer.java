/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleconsumerproducersemaphores;

/**
 *
 * @author nicol
 */
public class Producer extends Thread{
    
    Product lista_produse;
    public Producer(Product lista_produse)
    {
        this.lista_produse = lista_produse;
        this.setName("Producer Thread");
        this.start();
    }
    
    public void run()
    {
        for (int i=0; i< 5; i++)
        {
            lista_produse.put(i);
        }
    }
}
