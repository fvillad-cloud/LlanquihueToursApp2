/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Persona;

/**
 * Clase encargada de manejar la lógica del programa.
 * Se encarga de procesar, filtrar y mostrar la informacion de las personas, a
 * partir del arcivo .CSV
 * @author Francisco
 */
public class PersonaService {
    //Atributo privado que almacena la lista de personas.   
    private ArrayList<Persona> personas;

    public PersonaService(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
    /**
     * Entrega por consola el listado de todas las personas registradas.
     * Incluye una validación previa en caso de que la lista se encuentre vacía.
     */
    public void listarPersonas(){
        if (personas.isEmpty()){
            System.out.println("No hay datos de personas para mostrar.");
        }else{
            for (Persona persona:personas){
                System.out.println(persona);
            }
        }
    }
    
   /**
     * Busca y despliega las personas que coincidan con una clasificación específica.
     * El filtro es tolerante a variaciones de minusculas o mayusculas
     * * @param busquedaClasificacion Criterio a buscar (ej: "guia", "operador" o "proveedor")
     */
    
    public void buscarPorClasificacion(String busquedaClasificacion){
        boolean encontrado = false;
        
        for (Persona persona:personas){
            if(persona.getClasificacion().equalsIgnoreCase(busquedaClasificacion))
            {
                System.out.println(persona);
                encontrado=true;
            }
        }
        
        if(!encontrado){
            System.out.println("No se encontraron coincidencias para: "+busquedaClasificacion);
        }
    }
     
    
}
