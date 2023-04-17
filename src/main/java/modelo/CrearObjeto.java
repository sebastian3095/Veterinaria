
package modelo;

/**
 *
 * @author sebas
 */
public class CrearObjeto {
    
    private static Mascotas mascota;
    private static String nombre;
    private static String raza;
    private static String color;
    private static int edad;
    private static String tipoMascota;
    private static boolean toxoplasmosis;
    private static int nivelEntrenamiento;

    
    
    

   
    
    public static void pp(String nombre, String raza, String color, int edad,String tipoMascota, boolean toxoplasmosis, int nivelEntrenamiento){
        CrearObjeto.nombre = nombre;
        CrearObjeto.raza = raza;
        CrearObjeto.color = color;
        CrearObjeto.edad = edad;
        CrearObjeto.tipoMascota=tipoMascota;
        CrearObjeto.toxoplasmosis=toxoplasmosis;
        CrearObjeto.nivelEntrenamiento=nivelEntrenamiento;
    }
    
    public static void definirMascota(){
        
        if(tipoMascota.equals("gato")){
            Felinos gato= new Felinos(nombre,raza,color,edad,toxoplasmosis);
            mascota=gato;
        }else{
            Caninos perro=new Caninos(nombre,raza,color,edad,nivelEntrenamiento);
            mascota=perro;
        }
        
    }
    
    public static Mascotas getMascota(){
        return mascota;
    }
    
    

}
