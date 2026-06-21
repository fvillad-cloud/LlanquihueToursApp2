/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Persona;

/**
 * Clase encargada de la persistencia de datos.
 * Se encarga de leer el archivo CSV y transforma los datos
 * en una lista dinámica de objetos "Persona".
 *
 * @author Francisco
 */
public class GestorDeDatos {
    public ArrayList<Persona> cargarDatos(String rutaArchivo){
        
        ArrayList<Persona> listaDePersonas = new ArrayList<>();
        
        try {
            BufferedReader scan = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            
            while((linea = scan.readLine()) != null){
                String[] partes = linea.split(";");
                
                if(partes.length==6){
                    String id = partes[0];
                    String nombre = partes[1];
                    int edad = Integer.parseInt(partes[2]);
                    String rut = partes[3];
                    String telefono = partes[4];
                    String clasificacion = partes[5];
                    
                    Persona persona = new Persona(id, nombre, edad, rut, telefono, clasificacion);
                    listaDePersonas.add(persona);
                }
            }
            scan.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: "+e.getMessage());
        }
        //retorna una lista con los datos. 
        return listaDePersonas;
    }
}
