/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_6THREADS;

/**
 *
 * @author T-101
 *Creacion de un thread heredando la clase thread
*/
public class Mi_primer_THREAD extends Thread{
    @Override
    public void run(){
        System.out.println("soy un thread y me llamo" +this.getName());
        
    
}
}
