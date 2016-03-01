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
public class CLIENTE {
 private String NOMBRE;
 private String  APATERNO;
 private int edad;
 private float sueldo;
 Direccion direccion;

    public CLIENTE(String NOMBRE, String APATERNO, int edad, float sueldo, Direccion direccion) {
        this.NOMBRE = NOMBRE;
        this.APATERNO = APATERNO;
        this.edad = edad;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPATERNO() {
        return APATERNO;
    }

    public void setAPATERNO(String APATERNO) {
        this.APATERNO = APATERNO;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(direccion direccion) {
        this.direccion = direccion;
    }

    