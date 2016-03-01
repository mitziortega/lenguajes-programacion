/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ET;

/**
 *
 * @author T-101
 */
public class Direccion {

    public Direccion(String calle, int numero, String municipio) {
        this.calle = calle;
        this.numero = numero;
        this.municipio = municipio;
    }
    String calle;
    int numero;
    String municipio;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
}
