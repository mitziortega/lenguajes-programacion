/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;

/**
 *
 * @author T-101
 */
public class EdadMenorException  extends Exception {
    public EdadMenorException(){
         super("NO PUEDO REGISTRAR A UN MENOR DE EDAD");
   }
}