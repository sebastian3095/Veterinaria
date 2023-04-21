
package servlets;

import Clases.*;
import servlets.*;
import Clases.Caninos;
import Clases.Felinos;
import Clases.Mascotas;



public class CrearObjeto {
    
    private static Mascotas mascota;
    private static String nombre;
    private static String raza;
    private static String color;
    private static int edad;
    private static String tipoMascota;
    private static boolean tienetoxoplasmosis;
    private static int nivelEntrenamiento;
    private static int contadorCaninos=0;
    private static int contadorFelinos=0;
    private static int numeroMascota;

    
    
    public static void pp(String nombre, String raza, String color, int edad,String tipoMascota, boolean tieneToxoplasmosis, int nivelEntrenamiento){
        CrearObjeto.nombre = nombre;
        CrearObjeto.raza = raza;
        CrearObjeto.color = color;
        CrearObjeto.edad = edad;
        CrearObjeto.tipoMascota=tipoMascota;
        CrearObjeto.tienetoxoplasmosis= tieneToxoplasmosis;
        CrearObjeto.nivelEntrenamiento=nivelEntrenamiento;
    }
    
    public static void definirMascota(){
        
        if(tipoMascota.equals("gato")){
            Felinos gato = new Felinos(nombre, raza, color, edad, tienetoxoplasmosis);
            mascota=gato;
            contadorFelinos++;
        }else{
            Caninos perro=new Caninos(nombre,raza,color,edad,nivelEntrenamiento);
            mascota=perro;
            contadorCaninos++;
        }
        
    }
    
    public static void definirNumeroM(int numero){
        CrearObjeto.numeroMascota=numero;
    }
    
    public static int darNumeroM(){
        return CrearObjeto.numeroMascota;
    }
    
    public static String botonE(){
        return "<form>"
                + "<input type=\"hidden\" name=\"txteliminar\" value=\""+edad+"\">"
                + "<input type=\"submit\" value=\""+numeroMascota+"\">"
                + "</form>";
        //return "<button value=\""+edad+"\" name=\"bttnEliminar\">eliminar</button>";
    }
    
    public static Mascotas getMascota(){
        return mascota;
    }
    
    

}
