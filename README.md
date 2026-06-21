<img src="https://upload.wikimedia.org/wikipedia/commons/4/4f/OR_Logotipo_DuocUC.jpg" alt="logo DUOC" style="width:600px;height:150px;"><br>
<h1>Sistema de Gestión de Personas - Llanquihue Tours</h1> 
<p>Este proyecto es una aplicación de consola desarrollada en Java para la empresa Llanquihue Tours. 
El sistema permite gestionar de manera eficiente la información del personal y colaboradores (guías, operadores y proveedores), cargando de forma dinámica los datos desde un archivo plano en formato CSV.</p>

<h2>Características y Funcionalidades</h2>
<p>El sistema ofrece una interfaz por consola con las siguientes opciones:
<ol>
  <li><strong>Listar a todas las personas:</strong> Muestra en pantalla el detalle completo de todos los registros cargados en el sistema de manera ordenada y legible.</li>
  <li><strong>Buscar por clasificación:</strong> Permite filtrar y desplegar únicamente a las personas que cumplan con un rol específico (guia, operador o proveedor), siendo tolerante a mayúsculas y minúsculas.</li>
  <li><strong>Persistencia de datos:</strong> Carga la información automáticamente al arrancar la aplicación desde el archivo “datos.csv”.</li>
  <li><strong>Validación de errores:</strong> Cuenta con control de excepciones para prevenir caídas del sistema ante ingresos inválidos por teclado (como letras en campos numéricos) o fallas en la lectura del archivo de datos</li> 
</ol></p>
   
<h2>Arquitectura del Proyecto</h2>
<p>El código está diseñado bajo principios de POO y cuenta con una clara separación de responsabilidades en paquetes:
  <ul>
    <li><strong>app (Controlador/Main):</strong> Contiene la clase principal LlanquihueToursApp2, que inicializa el programa, muestra el menú de usuario y captura los datos ingresados por el usuario.</li>
    <li><strong>model (Modelo):</strong> Contiene la clase Persona, que representa a las personas que cumplen funciones en Llanquihue Tours, con sus respectivos atributos de instancia privados, constructor, métodos getters/setters y una sobreescritura del método toString().</li>
    <li><strong>data (Persistencia):</strong> Contiene la clase GestorDeDatos, encargada exclusivamente de la lectura del archivo físico mediante BufferedReader.</li>
    <li><strong>service (Lógica del programa):</strong> Contiene la clase PersonaService, encargada de procesar, filtrar e imprimir por pantalla la información solicitada por el usuario.</li>
 </p>
  </ul>

<h2>Estructura del Archivo de Datos (datos.csv)</h2>
<p>Para que la aplicación cargue la información correctamente, el archivo datos.csv debe ubicarse en la raíz del proyecto y utilizar el punto y coma (;) como separador. Cada línea debe cumplir con la siguiente estructura: <strong>ID;Nombre Completo;Edad;RUT;Teléfono;Clasificación</strong></p>

<h2>Instrucciones de Ejecución</h2>
<ol>
  <li>Descarga este repositorio.</li>
  <li>Asegúrate de colocar el archivo datos.csv en el directorio raíz del proyecto.</li>
  <li>Compila los archivos fuentes desde un IDE o terminal.</li>
  <li>Ejecuta la clase principal app.LlanquihueToursApp2.</li>
</ol>

<h2>Autor</h2>
<strong>Francisco Villa Duran</strong>

