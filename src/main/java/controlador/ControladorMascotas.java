package controlador;

import java.util.ArrayList;
import modelo.Mascotas;


public class ControladorMascotas {



    private ArrayList<Mascotas> listaMascotas = new ArrayList<>();

    
        public void agregarMascota(Mascotas mascota) {
            listaMascotas.add(mascota);
        }

        public void consultarMascotas() {
            System.out.println("Mascotas en lista:");
            for (Mascotas mascota : listaMascotas) {
                System.out.println(mascota.toString());
            }
        }

        public void eliminarMascota(Mascotas mascota) {
            listaMascotas.remove(mascota);
        }

        public double calcularEdadPromedio() {
            int totalMascotas = listaMascotas.size();
            int totalEdad = 0;
            for (Mascotas mascota : listaMascotas) {
                totalEdad += mascota.getEdad();
            }
            return totalEdad / totalMascotas;
        }

    
}