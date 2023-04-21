

package Clases;


public class Felinos extends Mascotas{

    boolean tieneToxoplasmosis;

    public Felinos(String nombre, String raza, String color, int edad, boolean tieneToxoplasmosis) {
        super(nombre, raza, color, edad);
        this.tieneToxoplasmosis = tieneToxoplasmosis;
    }
    
    public Felinos(boolean tieneToxoplasmosis) {
        this.tieneToxoplasmosis = tieneToxoplasmosis;
    }

    public Felinos() {
    }

    

    @Override
    public int getNivelEntrenamiento() {
        return 0;
    }

    @Override
    public boolean getTieneToxoplasmosis() {
        return tieneToxoplasmosis;
    }

    
    
    
}
