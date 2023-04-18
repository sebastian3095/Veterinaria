package modelo;


public class Mascotas {
    
    private String nombre;
    private String raza;
    private String color;
    private int edad;
    private int numeroMascota;

    public Mascotas() {
    }

    public Mascotas(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.numeroMascota=CrearObjeto.darNumeroM();
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
    
    
    
    
   public String botonE(){
        return "<form action=\"index.html\">"
                + "<input type=\"hidden\" name=\"txteliminar\" value=\""+numeroMascota+"\">"
                + "<input type=\"submit\" value=\""+numeroMascota+"\">"
                + "</form>";
    }
    
   
    
    
    
    @Override
    public String toString() {
        return "<td>"+nombre+"</td><td>"+raza+"</td><td>"+color+"</td><td>"+edad+"</td>";
    }
    
    
    
    
}