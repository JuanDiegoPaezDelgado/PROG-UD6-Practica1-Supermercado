package net.salesianos.supermercado.entidades;

import java.util.LinkedList;
import java.util.Queue;

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

}
