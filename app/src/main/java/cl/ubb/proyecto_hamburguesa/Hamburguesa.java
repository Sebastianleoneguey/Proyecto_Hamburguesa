package cl.ubb.proyecto_hamburguesa;

import java.io.Serializable;

public class Hamburguesa implements Serializable {



    String nombre, descripcion, precio;
    int img;

    public Hamburguesa(String nombre, String descripcion, String precio, int img) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.img = img;
    }
}
