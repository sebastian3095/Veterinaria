package modelo;


public class Mascotas {
    
    private String nombre;
    private String raza;
    private String color;
    private int edad;

    public Mascotas() {
    }

    public Mascotas(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String datos(){
        return nombre+raza+color+edad;
    }
    
    
    
    @Override
    public String toString() {
        return "Mascotas{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + '}';
    }
    
    
    
    
}