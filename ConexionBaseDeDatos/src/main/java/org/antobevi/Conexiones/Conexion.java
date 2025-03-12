package org.antobevi.Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;

// Conexion con la base de datos
public class Conexion {

    static Connection conexion = null;

    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // CUIDADO con mayusculas y minusculas!
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/JavaWebProgramming", "root", "");
            System.out.println("Base de datos conectada correctamente!");
            /*
            * En EXTERNAL LIBRARIES deberíamos tener la dependencia Maven MySQL Connector,
            * dentro de esa carpeta seguimos la ruta hasta la clase Driver que es lo que va aca (className)
            */
        } catch(Exception e) {
            System.out.println("ERROR! No se pudo conectar con la base de datos MySQL.");
            e.printStackTrace(); // Indica que ocurrio exactamente
        }

        return conexion;
    }

}