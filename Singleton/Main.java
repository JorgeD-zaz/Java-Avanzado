package Singleton;

public class Main {

    public static void main(String[] args) {
      // creamos dos "instancias" de la clase ConexionSingletonBD  utilizando el metodo getInstance()
        ConexionSingletonBD conexion1 = ConexionSingletonBD.getInstance();
        ConexionSingletonBD conexion2 = ConexionSingletonBD.getInstance();

      // hacemos uso de las mismas  utilizando  un metodo de la clase
        conexion1.nuevoRegistro("Luis");
        conexion1.nuevoRegistro("OpenBootcamp");

      // comprobamos  que  ambas se encuentran en el mismo espacio de memoria  por lo tanto son la misma
        System.out.println(conexion1);
        System.out.println(conexion2);

    }
}
