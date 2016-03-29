/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo_11collection;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class PersistenciaUsuario {
  ArrayList<usuario> usuarios;  
    
    
    ///primero ponemos el metodo de buscar todos
      ArrayList <usuario> buscarTodos()throws Exception{
    ///paso numero 1
    //leemos el archivo donde esta guardado el arraylist
          
    File=new File("archivaldo.raton");
            
            //leemos el contenido
             FileImputStream fis=new FileImputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
       usuarios=(ArrayList <usuario>)ois.readObject();
       return usuarios;
       
       
            
            
}
}