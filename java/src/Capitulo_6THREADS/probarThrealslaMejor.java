/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_6THREADS;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class probarThrealslaMejor {
    
    
    
    
    
    //esta es la mejor  forma No 3  
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
                int x=1;
            for(int i=0;i<30;i++){
                System.out.println(x++);
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Probar_mis_THREADS.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
              Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
                System.out.println("todos vamos a morir");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Probar_mis_THREADS.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }  
            }
        }};
        t1.start();

      
        

//una clase interna anonima se agraga donde se requiereuna refefernciadonde este un constructor con un metodo
    }
}
