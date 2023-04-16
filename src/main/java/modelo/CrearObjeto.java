
package modelo;

/**
 *
 * @author sebas
 */
public class CrearObjeto {
    
    private Mascotas mascota;
    private String nombre;
    private String raza;
    private String color;
    private int edad;
    private String tipoMascota;
    private boolean toxoplasmosis;
    private int nivelEntrenamiento;

    public CrearObjeto(String nombre, String raza, String color, int edad,String tipoMascota, boolean toxoplasmosis, int nivelEntrenamiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.tipoMascota=tipoMascota;
        this.toxoplasmosis=toxoplasmosis;
        this.nivelEntrenamiento=nivelEntrenamiento;
    }
    
    public void definirMascota(){
        
        if(tipoMascota.equals("gato")){
            Felinos gato= new Felinos(nombre,raza,color,edad,toxoplasmosis);
            mascota=gato;
        }else{
            Caninos perro=new Caninos(nombre,raza,color,edad,nivelEntrenamiento);
            mascota=perro;
        }
        
    }
    
    public Mascotas getMascota(){
        return mascota;
    }
    
    

}
