/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.collection;

/**
 *
 * @author T-101
 */
import java.util.*;
public class GeneradorPreguntas {
  public ArrayList<pregunta> obtenertodaspregunas(){
  //vamos a crear una sola pregunta con tres opciones
  opcion o1=new opcion("moscu", true);
  opcion o2=new opcion("florencia",false);
  opcion o3=new opcion("paris",false);
  ArrayList<opcion> opciones=new ArrayList<>();
  opciones.add(o1);
  opciones.add(o2);
  opciones.add(o3);
  pregunta p1=new pregunta("capital de rusia", opciones);
      return null;
  }
}
