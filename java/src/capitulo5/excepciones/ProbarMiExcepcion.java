/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMiExcepcion {
    public static void main(String[] args) {
       try {  
           Cliente c=new Cliente();
      c.setEdad(-19);
        } catch (ValorNegativoException ex) {
            System.out.println(ex.getMessage());
           
        }
   
                }
    
    
 
    
}
