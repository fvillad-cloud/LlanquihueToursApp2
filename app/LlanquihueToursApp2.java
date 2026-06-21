/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

// Importaciones de las clases necesarias de la aplicación.
import data.GestorDeDatos;
import java.util.*;
import model.Persona;
import service.PersonaService;

/**
 * Clase principal de la aplicación LlanquihueToursApp2. Funciona como el punto de entrada al programa y es en donde
 * se instancian objetos.
 * @author Francisco
 */
public class LlanquihueToursApp2 {

   //Metodo principal Main que inicializa la ejecucion del programa
    public static void main(String[] args) {
        // Inicialización del Scanner para leer la entrada del usuario por consola
        Scanner tc = new Scanner(System.in);
        
        // Ruta del archivo CSV que contiene los datos.
        String rutaArchivo = "datos.csv";
        
        // Instanciación del gestor de datos y carga inicial desde el archivo CSV
        GestorDeDatos gestor = new GestorDeDatos();
        ArrayList<Persona> personas = gestor.cargarDatos(rutaArchivo);
        
        // Se pasa la lista de personas al servicio encargado de la lógica de busqueda y procesamiento de los datos
        PersonaService personaService = new PersonaService(personas);
        
        int opcion=0;
        
        // Ciclo interactivo que mantiene la aplicación ejecutándose hasta que se elija la opción "Salir"
        do{
            //muestra menú usuario
            System.out.println("\n=== Gestion de Personas ===");
            System.out.println("1. Listar a todas las personas.");
            System.out.println("2. Buscar persona por clasificacion (guia, operador o proveedor).");
            System.out.println("3. Salir.");
            System.out.print("Seleccione una opcion: ");
            
            try {
                opcion = Integer.parseInt(tc.nextLine());
                //evalúa ópcion seleccionada por el usuario
                switch(opcion){
                    //Llama a listarPersonas() para desplegar la informacion completa.
                    case 1:
                        personaService.listarPersonas();
                        break;
                        
                    //Solicita el criterio de busqueda 
                    case 2:
                        System.out.print("Ingrese clasificacion (guia, operador o proveedor): ");
                        String clasificacion = tc.nextLine();
                        personaService.buscarPorClasificacion(clasificacion);
                        break;
                        
                    //Mensaje de despedida antes de salir
                    case 3:
                        System.out.println("Saliendo del sistema, hasta pronto...");
                        break;            
                    //Manejo de numeros fuera de rango
                    default:
                        System.out.println("Opcion invalida, intente nuevamente.");
                        break;
                    
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero valido.");
            }
        }while(opcion!=3); //ciclo se repite mientras la opcion no sea 3
        
        tc.close(); // cierra escaner.
    }
    
}
