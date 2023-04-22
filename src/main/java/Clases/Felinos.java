

package Clases;


public class Felinos extends Mascotas{


    private boolean toxoplasmosis;

    public Felinos() {
        
    }

    public Felinos(String nombre, String raza, String color, int edad, boolean toxoplasmosis,String tipoMascota) {
        super(nombre, raza, color, edad, tipoMascota);
        this.toxoplasmosis = toxoplasmosis;
    }

    public boolean isToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(boolean toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }
    
    private String tieneT(){
        if(toxoplasmosis){
            return "si";
        }else{
            return "no";
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "<td>Tiene Toxoplasmosis: "+ tieneT()+"</td>";
    }

    
    
    
    
}