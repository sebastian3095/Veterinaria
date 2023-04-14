package modelo;


public class Felinos extends Mascotas{


    private boolean toxoplasmosis;

    public Felinos() {
    }

    public Felinos(String nombre, String raza, String color, int edad, boolean toxoplasmosis) {
        super(nombre, raza, color, edad);
        this.toxoplasmosis = toxoplasmosis;
    }

    public boolean isToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(boolean toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }

    @Override
    public String toString() {
        return "Felinos{" + "toxoplasmosis=" + toxoplasmosis + '}';
    }

    
    
    
    
}