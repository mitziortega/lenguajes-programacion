/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_6THREADS;

/**
 *
 * @author T-101
 */
public class Probar_mis_THREADS {
    public static void main(String[] args) {
        //Ciclo ded evida del trhread sin contar pausa
        //1 creado
        Mi_primer_THREAD t1=new Mi_primer_THREAD();
        //opcionalmente lo bautiszamos
        t1.setName("chana");
        //INICIALIZADO
        t1.start();
        //en ejecucion (cuando corras este programa y se active su  metodo run
        //5. muerte cuando coplete la tarea que tiene 
    }
 
}
