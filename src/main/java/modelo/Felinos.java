package modelo;


public class Felinos extends Mascotas{


    private boolean toxoplasmosis;

    public Felinos() {
    }

    public Felinos(boolean toxoplasmosis, String nombre, String raza, String color, int edad) {
        super(nombre, raza, color, edad);
        this.toxoplasmosis = toxoplasmosis;
    }

    @Override
    public String toString() {
        return "Felinos{" + "toxoplasmosis=" + toxoplasmosis + '}';
    }

    
    
    
    
}