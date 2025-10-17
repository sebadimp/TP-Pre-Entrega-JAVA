import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        int opcionMenu;

        Menu menu = new Menu();
        menu.inicioMenu();
        OperacionesMenu.generarProductos(productos);
        label:
        while (true) {
            menu.opcionesMenu();
            System.out.print("Elija una opcion para continuar: ");
            String entrada = sc.nextLine().trim();

            try {
                opcionMenu = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese un número de opción. ⚠️");
                continue;
            }

            switch (opcionMenu) {
                case 1 -> OperacionesMenu.agregarProducto(productos, sc);
                case 2 -> OperacionesMenu.mostrarProductos(productos);
                case 3 -> OperacionesMenu.buscarProducto(productos, sc);
                case 4 -> OperacionesMenu.eliminarProducto(productos, sc);
                case 5 -> OperacionesMenu.crearPedido(productos,pedidos,sc);
                case 6 -> OperacionesMenu.mostrarPedidos(pedidos);
                case 0 -> {
                    menu.finMenu();

                    break label;
                }
                default -> System.out.println("\nEntrada inválida. Ingrese un número de opción. ⚠️");
            }

        }
    }
}
