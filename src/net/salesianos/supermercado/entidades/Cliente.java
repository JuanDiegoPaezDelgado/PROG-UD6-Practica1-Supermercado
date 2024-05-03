package net.salesianos.supermercado.entidades;

import java.util.Stack;

public class Cliente {
    private String nombre;
    private Stack<String> cesta;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.cesta = new Stack<>();
    }

    public void agregarProducto(String producto) {
        cesta.push(producto);
    }

    @Override
    public String toString() {
        String mensaje = "====================================\n" +
                "|Cliente                           |\n"
                + "|===================================\n"
                + "|-Nombre: " + nombre
                + "\n|-Total de productos: " + cesta.size()
                + "\n|-Lista de artículos en la cesta:\n";
        for (String producto : cesta) {
            mensaje += "|-" + producto + "\n";
        }
        mensaje += "====================================\n";
        return mensaje;
    }

}