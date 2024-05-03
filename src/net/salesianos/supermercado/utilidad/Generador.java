package net.salesianos.supermercado.utilidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Generador {
    private static ArrayList<String> nombresDisponibles = new ArrayList<>(Arrays.asList("Maria ", "Mario ", "Joaquim ",
            "Martin",
            "Jose", "Laura", "Pablo", "sofia",
            "Adrian", "Elena", "David", "Olivera", "Javier", "carmen", "Pepe", "Raquel", "Sara", "Juan", "Israel",
            "Alonso"));
    private static ArrayList<String> productosDisponibles = new ArrayList<>(Arrays.asList(
            "Pan", "Leche", "Huevos", "Arroz", "Chuletas", "Cebolla", "Ajo",
            "Banano", "Pollo", "Carne ", "Atun", "Nuggets"));
    private static Random random = new Random();

    public static String generarProductoAleatorio() {
        int index = random.nextInt(productosDisponibles.size());
        return productosDisponibles.get(index);
    }

    public static String generarNombreAleatorio() {
        int index = random.nextInt(nombresDisponibles.size());
        return nombresDisponibles.get(index);
    }

}
