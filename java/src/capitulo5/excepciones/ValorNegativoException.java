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
public class ValorNegativoException extends Exception{
    public ValorNegativoException(){
        super("no puedes meter un valor negativo");
    }
    
    
}
