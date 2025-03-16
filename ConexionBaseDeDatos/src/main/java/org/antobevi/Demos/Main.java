package org.antobevi.Demos;

import org.antobevi.Conexiones.Conexion;
import org.antobevi.DAO.ComidaDAO;
import org.antobevi.Entidades.Comida;

public class Main {

    public static void main( String[] args ) {

        // Probamos la conexion a la base de datos
        // Conexion.conectar();

        // Agregamos algunos registros nuevos en la base de datos
        // Creamos un objeto comida a raiz de la entidad Comida
        Comida milanesaConPure = new Comida();
        milanesaConPure.setNombre("MILANESA CON GUARNICION");
        milanesaConPure.setDescripcion("Milanesa con pure de papas");
        milanesaConPure.setPrecio(15000.0);

        Comida empanadaCaprese = new Comida();
        empanadaCaprese.setNombre("EMPANADA CAPRESE");
        empanadaCaprese.setDescripcion("Empanada con muzzarella, tomate y albaca");
        empanadaCaprese.setPrecio(2000.0);

        Comida pizzaMargarita = new Comida();
        pizzaMargarita.setNombre("PIZZA MARGARITA");
        pizzaMargarita.setDescripcion("Pizza con salsa de tomate, muzzarella y huevo duro");
        pizzaMargarita.setPrecio(25000.0);

        Comida ensaladaCaprese = new Comida();
        ensaladaCaprese.setNombre("ENSALADA CAPRESE");
        ensaladaCaprese.setDescripcion("Ensalada con cubos de queso, tomates cherry y albaca");
        ensaladaCaprese.setPrecio(8000.0);

        // Enviamos la comida al DAO para que pueda insertarla en la base de datos
        // Creamos un objeto ComidaDAO que va a recibir por parametro el objeto comida creado antes
        ComidaDAO comidaDAO = new ComidaDAO();
        //comidaDAO.insertar(milanesaConPure);
        //comidaDAO.insertar(empanadaCaprese);
        //comidaDAO.insertar(pizzaMargarita);
        //comidaDAO.insertar(ensaladaCaprese);

        // Eliminamos un registro
        //comidaDAO.eliminar(1);

    }

}
