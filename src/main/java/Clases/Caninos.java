

package Clases;


public class Caninos extends Mascotas{
    
    int nivelEntrenamiento;

    public Caninos(int nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public Caninos() {
    }

    public Caninos(String nombre, String raza, String color, int edad, int nivelEntrenamiento) {
        super(nombre, raza, color, edad);
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    @Override
    public int getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    @Override
    public boolean getTieneToxoplasmosis() {
        return false;
    }


    

    
    
    
}
