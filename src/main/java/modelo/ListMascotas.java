package modelo;

import java.util.ArrayList;

public class ListMascotas implements Ipromedio {
    
    int i=0;
    private ArrayList<Mascotas> listaMascotas = new ArrayList<>();                  
    
    public void agregarMascota(Mascotas mascota) {
        listaMascotas.add(mascota);
    }

    public String consultarMascotas() {
        System.out.println("Mascotas en lista:");
        for (Mascotas mascota : listaMascotas) {
            return mascota.toString();
        }
        return null;
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
    
    public int prueba(){
        i++;
        return i;
    }

}
