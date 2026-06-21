/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase Persona representa a las personas que mantienen un vinculo laboral o comercial con Llanquihue Tours.
 * Posee 6 atributos básicos que caracterizan a cada individuo. Despliega la informacion por pantalla 
 * mediante el uso de toString().
 * @author Francisco
 */


public class Persona {
    //Atributos de instancia, privados para proteger de un acceso directo no autorizado.
    private String id;
    private String nombre;
    private int edad;
    private String rut;
    private String telefono;
    private String clasificacion;
    
    /**
     * 
     * @param id, representa un identificador interno utilizado por Llanquihue Tours
     * @param nombre, representa el nombre completo de la persona.
     * @param edad, representa la edad en años enteros de la persona.
     * @param rut, representa la identificacion nacional de la persona.
     * @param telefono, representa el numero de contacto de la persona.
     * @param clasificacion, representa el rol de la persona en la empresa: Guia, Operario o Proveedor
     */

    //Constructor para inicializar todos los atributos de la Persona al momento de crear una nueva instancia.
    public Persona(String id, String nombre, int edad, String rut, String telefono, String clasificacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.telefono = telefono;
        this.clasificacion = clasificacion;
    }

    //Metodos de acceso (getters y setters)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * Sobreescritura del método estandar toString(). Permite imprimir en pantalla
     * el objeto de forma legible, en formato texto
     * @return una cadena de texto con los datos de una persona.
     */
    
@Override
    public String toString(){
        return "\n== Datos Personales ==\n"+
               "ID                  : "+id+
               "\nNombre              : "+nombre+
                "\nEdad                : "+edad+
                "\nRUT                 : "+rut+
                "\nFono                : "+telefono+
                "\nClasificacion       : "+clasificacion;
        
    }
    
}
