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
}
