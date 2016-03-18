/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_11collection;
import java.util.*;

/**
 *
 * @author T-101
 */
public class GeneradorPreguntas {
    public static ArrayList<pregunta>obtenerTodasLasPreguntas(){
        
        opcion op1=new opcion("Moscu", true);
        opcion op2=new opcion("Florencia", false);
        opcion op3=new opcion("Paris", false);
        opcion op4=new opcion("Londres", false); 
        
        opcion op4p2=new opcion("Buenos Aires", false);
        opcion op5p2=new opcion("Tokio", false);
        opcion op6p2=new opcion("Beijing", true);
        opcion op7p2=new opcion("Pyongyang", false); 
        
        ArrayList<opcion> opciones=new ArrayList<opcion>();
        
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
        ArrayList<opcion> opcionesp2=new ArrayList<opcion>();
        opcionesp2.add(op4p2);
        opcionesp2.add(op5p2);
        opcionesp2.add(op6p2);
        opcionesp2.add(op7p2);
        ArrayList<pregunta> preguntas=new ArrayList<pregunta>();
        pregunta p1=new pregunta ("Capital De Rusia", opciones);
        pregunta p2=new pregunta("Cual es la Capital de China", opcionesp2);
        preguntas.add(p1);
        preguntas.add(p2);
        return preguntas;
    }
    
}
