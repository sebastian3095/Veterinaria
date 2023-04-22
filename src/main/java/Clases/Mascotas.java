

package Clases;

import servlets.*;


public class Mascotas {
    
    private String nombre;
    private String raza;
    private String color;
    private int edad;
    private int numeroMascota;
    private String tipoMascota;

    public Mascotas() {
        
    }

    public Mascotas(String nombre, String raza, String color, int edad, String tipoMascota) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.tipoMascota=tipoMascota;
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

    public String getTipoMascota() {
        return tipoMascota;
    }
    
    
    
    
   public String botonE(){
        return "<form action=\"index.html\">"
                + "<input type=\"hidden\" name=\"txteliminar\" value=\""+numeroMascota+"\">"
                + "<input type=\"submit\" value=\"Eliminar\">"
                + "</form>";
    }
    
   
    
    
    
    @Override
    public String toString() {
        return "<td>"+nombre+"</td><td>"+raza+"</td><td>"+color+"</td><td>"+edad+"</td>";
    }
    
    
    
}
