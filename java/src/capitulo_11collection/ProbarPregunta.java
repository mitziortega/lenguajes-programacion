/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_11collection;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class ProbarPregunta {
     public static void main(String[] args) {
        ArrayList<pregunta> preguntas=GeneradorPreguntas.obtenerTodasLasPreguntas();
        
        for(pregunta p:preguntas){
            System.out.println("Pregunta: "+p.getTitulo());
            for(opcion o:p.getopciones()){
                System.out.println(o.getTitulo()); 
            }
        }
    }
    
}
