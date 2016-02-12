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
public class ValidarEdad {
 
    public static void checarEdadNegativa(int edad) throws  ValorNegativoException{
  if(edad<0)throw new ValorNegativoException();
    }
   public static void ChecarMenorEdad(int edad)throws EdadMenorException{
       if (edad<18)throw new EdadMenorException();
   }     
    

}