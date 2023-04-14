package modelo;

public class Caninos extends Mascotas {

    private int nivelEntrenamiento;

    public Caninos() {
    }
    
    public Caninos(String nombre, String raza, String color, int edad, int nivelEntrenamiento) {
        
        super(nombre, raza, color, edad);
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
        return super.toString()+ "<br>Nivel de entrenamiento: "+ nivelEntrenamiento;
    }
    
    
    
}
