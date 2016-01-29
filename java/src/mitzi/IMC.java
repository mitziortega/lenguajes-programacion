/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mitzi;


 /*
  clase modelo imc encapsulada
  y con dos constructores
1.agregar a los atributos modificador de acceso private
2.por cada atributo implementar un metodo get (getters)
3.por cada atributo implementar un metodo set (setters)
 */
public class IMC {
     private float peso;
   private float altura;

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    

     public String calcular(){
         float imc=peso/(altura*altura);
                return "Tu imc es:" +imc;
}

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
}