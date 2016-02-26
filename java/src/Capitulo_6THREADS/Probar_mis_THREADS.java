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
public class Probar_mis_THREADS implements  Runnable {
    //iplementar metodos abstractos
    public static void main(String[] args) {
        //Ciclo ded evida del trhread sin contar pausa
        //1 creado
        
        Mi_primer_THREAD t1=new Mi_primer_THREAD();
    //otro thread   
        Runnable r=new Probar_mis_THREADS();
         Thread t2=new Thread(r);
         Thread t3=new Thread (r);
         //El thread t2 tiene que haer que se impriman del 1 al 10 de 5 seg entre cada impresion
         ///el thread t3 tiene que hacer que se imprima 
         //la frase "todos vamos a morir "hasta el final de los tiempos cad segundo
     //opcionalmente lo bautiszamos
        t1.setName("chana");
        t2.setName("juana");
        t3.setName("pedro");
        //INICIALIZADO
        t1.start();
        t2.start();
        t3.start();
        //en ejecucion (cuando corras este programa y se active su  metodo run
        //5. muerte cuando coplete la tarea que tiene 
    }

    @Override
    public void run() {
        
        //prmeropreguntamos si es el threa t2 y si es que imprime
        
        if(Thread.currentThread().getName().equals("juana")){
            
            int x=1;
            for(int i=0;i<30;i++){
                System.out.println(x++);
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Probar_mis_THREADS.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }if (Thread.currentThread().getName().equals("pedro")){
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
}
