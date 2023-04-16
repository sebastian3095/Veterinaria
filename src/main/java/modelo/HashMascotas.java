
package modelo;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author sebas
 */
public class HashMascotas {
    
    Hashtable<String, Mascotas> lista= new Hashtable<String, Mascotas>();

    public void agregarMascota(String nombre, Mascotas mascota){
        
        lista.put(nombre, mascota);
        
    }
    
    public String consultarMascotas(){
        
        Enumeration e = lista.keys();
        
        while(e.hasMoreElements()){
            return e.n;
        }
        
    }
    
    
}
