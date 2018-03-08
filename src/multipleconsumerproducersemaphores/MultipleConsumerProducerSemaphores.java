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
public class MultipleConsumerProducerSemaphores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product pq = new Product();
        Producer prod = new Producer(pq);
        Consumer con = new Consumer(pq);
        
    }
    
}
