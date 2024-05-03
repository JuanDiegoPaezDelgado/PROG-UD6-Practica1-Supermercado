
import java.util.Scanner;

import net.salesianos.supermercado.entidades.Cajero;
import net.salesianos.supermercado.utilidad.Menu;

public class App {
    public static Scanner scanner;

    public static void main(String[] args) {
        Cajero cajero = new Cajero(1);
        boolean estaAbierta = false;
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println(Menu.menu());
            System.out.print("|Seleccione una opción:               |\n" +
                    "====================================->(");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    estaAbierta = cajero.abrirCaja(estaAbierta);
                    break;
                case "2":
                    cajero.hacerPasarAColar(estaAbierta, cajero);
                    break;
                case "3":
                    cajero.atenderCliente(estaAbierta, cajero);
                    break;
                case "4":
                    if (estaAbierta) {
                        System.out.println("Clientes pendientes en la fila: \n" + cajero.toString());
                    } else {
                        System.out.println("La caja esta cerrada!!!!!!!!!!");
                    }

                    break;
                case "5":
                    cajero.cerrarSupermercado(estaAbierta, cajero);
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }

        }

    }
}
