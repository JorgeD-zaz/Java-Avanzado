package Singleton;

public class ConexionSingletonBD   {

   // creamos un objeto estatico del tipo de su misma clase
    private static ConexionSingletonBD instance;

    // creamos el constructor y lo  definimos como privado para que no se pueda llamar desde fuera de la clase
   private ConexionSingletonBD() {
        this.instance = instance;
    }

    // implementamos el metodo getInstance  para  generar  la unica instancia de la clase
    // y este retorne la instancia
    public static ConexionSingletonBD getInstance() {
       if (instance == null){
           instance = new ConexionSingletonBD();
       }
       return instance;
    }

    public void nuevoRegistro(String nombre){

        System.out.println("Registrando.....: \n" + nombre + " se añadio correctamente");
    }


}
