/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleconsumerproducersemaphores;
import java.util.concurrent.Semaphore;
/**
 *
 * @author nicol
 */
public class Product {
    static Semaphore semProd = new Semaphore(1);
    static Semaphore semCon = new Semaphore(0);
    
    int productId;
    
    public void put(int producId)
    {
        try
        {
            semProd.acquire();
            this.productId = productId;
            System.out.println(Thread.currentThread().getName()+" Putting(In Q) Product ID:"+productId);
            semCon.release();
            
        }catch (InterruptedException  e){
            e.printStackTrace();
        }
    }
    
    public void get()
    {
        try
        {
            semCon.acquire();
            System.out.println(Thread.currentThread().getName()+" Getting(From Q) Product ID:"+productId);
            semProd.release();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
