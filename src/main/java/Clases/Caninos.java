

package Clases;


public class Caninos extends Mascotas {

    private int nivelEntrenamiento;
    

    public Caninos() {
        
    }
    
    public Caninos(String nombre, String raza, String color, int edad, int nivelEntrenamiento, String tipoMascota) {
        
        super(nombre, raza, color, edad, tipoMascota);
        this.nivelEntrenamiento = nivelEntrenamiento;

    }

    public int getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    public void setNivelEntrenamiento(int nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    @Override
    public String toString() {
        return super.toString()+ "<td>Nivel de entrenamiento: "+ nivelEntrenamiento+"</td>";
    }
    
    
    
}