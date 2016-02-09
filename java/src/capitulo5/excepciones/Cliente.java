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
public class Cliente {
    private String email;
   private int edad;
/**
 * 
 * @param email
 * @param edad 
 */
    public Cliente(String email, int edad) {
        this.email = email;
        this.edad = edad;
    }

    public Cliente() {
    }

    /**este metodo nos regresa el email que se debio habr proporcionado por el metodo set correspodiente
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * este metodo necita proporciones  que proporcione un string
     * que va a ser el email que le va a asignar al cliente
     * 
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        ValidarEdad valida=new ValidarEdad();
        validar.checarEdad=
        this.edad = edad;
    }
   
     
    
}
