package net.salesianos.supermercado.entidades;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import net.salesianos.supermercado.utilidad.Generador;

public class Cajero {
    private int numeroCaja;
    public Queue<Cliente> filaClientes;

    public Cajero(int numeroCaja) {
        this.numeroCaja = numeroCaja;
        this.filaClientes = new LinkedList<>();
    }

      public boolean abrirCaja(boolean estaAbierta) {
        if (!estaAbierta) {
            estaAbierta = true;
            System.out.println("Caja abierta!!");
        } else {
            System.out.println("La caja ya esta abierta");
        }

        return estaAbierta;

    }

    public void agregarCliente(Cliente cliente) {
        filaClientes.add(cliente);
    }

    public void atenderCliente(boolean estaAbierta, Cajero cajero) {
        if (!cajero.filaClientes.isEmpty()) {
            Cliente cliente = filaClientes.poll();
            System.out.println("Cliente atendido: \n" + cliente.toString());
        } else if (!estaAbierta) {
            System.out.println("La caja esta cerrada!!!!!!!!!!");
            return;
        } else {
            System.out.println("No hay clientes a los que atender.");
        }
    }

    public void hacerPasarAColar(Boolean estaAbierta, Cajero cajero) {
        if (estaAbierta) {
            String nombreCliente = Generador.generarNombreAleatorio();
            Cliente cliente = new Cliente(nombreCliente);
            int productos = new Random().nextInt(12) + 1;
            for (int i = 0; i < productos; i++) {
                cliente.agregarProducto(Generador.generarProductoAleatorio());
            }
            cajero.agregarCliente(cliente);
            System.out.println("Nuevo cliente añadido a la cola: \n" + cliente.toString());
        } else {
            System.out.println("La caja esta cerrada!!!!!!!!!!");
        }
    }

    public void cerrarSupermercado(Boolean estaAbierta, Cajero cajero) {
        if (!estaAbierta) {
            System.out.println("El supermercado ha sido cerrado.");
            System.exit(0);
        } else {
            if (cajero.filaClientes.isEmpty()) {
                System.out.println("El supermercado ha sido cerrado.");
                System.exit(0);
            } else {
                System.out.println("No se puede cerrar la caja, aún hay clientes esperando.");
            }
        }
    }

    @Override
    public String toString() {
        String mensaje = "|===================================\n" +
                "|Cajero                            |\n"
                + "|===================================\n"
                + "|-Número de caja: " + numeroCaja + "\n"
                + "|-Total de clientes: " + filaClientes.size() + "\n"
                + "|-Clientes en la fila:\n";
        for (Cliente cliente : filaClientes) {
            mensaje += cliente.toString();
        }
        mensaje += "===================================\n";
        return mensaje;
    }


   
}
