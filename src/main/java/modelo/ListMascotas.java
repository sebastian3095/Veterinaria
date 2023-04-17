package modelo;

import java.util.ArrayList;

public class ListMascotas implements Ipromedio {
    
    int i=0;
    public ArrayList<Mascotas> listaMascotas = new ArrayList<>();                  
    
    public void agregarMascota(Mascotas mascota) {
        listaMascotas.add(mascota);
    }
    /*
    public String consultarMascotas() {
        System.out.println("<h1>Mascotas en lista:</h1>");
        for (Mascotas mascota : listaMascotas) {
            return mascota.toString();
        }
        return null;
    }
    */
    
    public Mascotas consultarMascotas(int i) {
        
        return listaMascotas.get(i);
            //System.out.println(listaMascotas.get(i)); 
        
    }
    

    public void eliminarMascota(Mascotas mascota) {
        listaMascotas.remove(mascota);
    }

    public double promedio() {
        int totalMascotas = listaMascotas.size();
        int totalEdad = 0;
        for (Mascotas mascota : listaMascotas) {
            totalEdad += mascota.getEdad();
        }
        return totalEdad / totalMascotas;
    }
    

}
