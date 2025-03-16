package org.antobevi.DAO;

import org.antobevi.Conexiones.Conexion;
import org.antobevi.Entidades.Comida;

import java.sql.Connection;
import java.sql.Statement;

// Con esta clase podemos generar y enviar queries a la base de datos
public class ComidaDAO {

    public void insertar(Comida comida) {
        try {
            // Paso 1: Activar la conexion a la base de datos
            Connection conexion = Conexion.conectar();
            // Paso 2: Armar la query
            String sql = "INSERT INTO Comida(NOMBRE, DESCRIPCION, PRECIO) VALUES"
                        + "('" + comida.getNombre() + "', '" + comida.getDescripcion() + "'," + comida.getPrecio() + ")";
            // Paso 3: Crear un estado que permite ejecutar el paso 2 y enviarlo
            /* Transferencia de estado. A traves de la variable propia de Java (se suele llamar siempre stmt)
               se pasa la conexion y envia la query
            */
            Statement stmt = conexion.createStatement();
            // Paso 4: Ejecutar el statement para enviar la query
            stmt.execute(sql);
            System.out.println("El registro se inserto correctamente en la base de datos.");
            // Paso 5: Cerrar la conexion por una cuestion de seguridad (Opcional)
            stmt.close();
            conexion.close();

        } catch(Exception e) {
            System.out.println("Ha ocurrido un error y el registro no pudo ser insertado..");
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        try {
            Connection conexion = Conexion.conectar();
            String sql = "DELETE FROM COMIDA WHERE ID = " + id;
            Statement stmt = conexion.createStatement();
            stmt.execute(sql);
            System.out.println("El registro se elimino correctamente de la base de datos.");
            stmt.close();
            conexion.close();

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error y el registro no pudo ser eliminado..");
            e.printStackTrace();
        }
    }

    public static void modificarPrecioRegistro(Comida comida) {
        Connection conexion = Conexion.conectar();

        try {
            String sql = "UPDATE Comida SET PRECIO = '" + comida.getPrecio()
                        + "' WHERE ID = " + comida.getId();
            Statement stmt = conexion.createStatement();
            stmt.execute(sql);
            System.out.println("El registro se modifico correctamente en la base de datos.");
            stmt.close();
            conexion.close();

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error y el registro no pudo ser modificado..");
            e.printStackTrace();
        }
    }

}
