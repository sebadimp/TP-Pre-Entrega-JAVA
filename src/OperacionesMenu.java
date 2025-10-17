import java.util.ArrayList;
import java.util.Scanner;

public class OperacionesMenu {

    public static void agregarProducto(ArrayList<Producto> productos, Scanner scanner){
        String nombre;
        String categoria;
        double precio;
        int stock;

        while(true){

            while (true){
                System.out.println("Ingrese el nombre del nuevo producto: ");
                nombre = scanner.nextLine();
                if(nombre.isBlank()){
                    System.out.println("El nombre no puede estar vacío. ❌");
                }else {
                    break;
                }
            }

            while (true){
                System.out.println("Ingrese la categoría del nuevo producto: ");
                categoria = scanner.nextLine();
                if(categoria.isBlank()){
                    System.out.println("El nombre no puede estar vacío. ❌");
                }else {
                    break;
                }
            }

            while (true){
                try {
                    System.out.println("Ingrese el precio del nuevo producto: ");
                    precio = Double.parseDouble(scanner.nextLine());
                    if (precio <= 0) {
                        System.out.println("El precio debe ser mayor a 0. ❌");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Debe ingresar un número válido para el precio. ❌");
                }
            }

            while (true){
                try {
                    System.out.println("Ingrese el stock del nuevo producto: ");
                    stock = Integer.parseInt(scanner.nextLine());
                    if (stock <= 0) {
                        System.out.println("El stock debe ser mayor a 0. ❌");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Debe ingresar un número válido para el stock. ❌");
                }
            }

            Producto producto = new Producto(nombre,categoria,precio,stock);
            productos.add(producto);
            System.out.println("Producto agregado exitosamente. ✅");
            System.out.println();
            System.out.println("Desea agregar otro producto ? (s/n)");
            String respuesta = scanner.nextLine().toLowerCase();
            if(respuesta.equals("n")){
                System.out.print("");
                break;
            }
        }
    }

    public static void generarProductos(ArrayList<Producto> productos) {
        productos.add(new Producto("Rogel", "Torta", 35150, 5));
        productos.add(new Producto("Lemon Pie", "Torta", 28800, 3));
        productos.add(new Producto("Brownie", "Postre", 22000, 4));
    }

    public static void mostrarProductos(ArrayList<Producto> productos){
        if(productos.isEmpty()){
            System.out.println("No existen productos para visualizar.");
            return;
        }
        System.out.print("""
                    
                    ---------------------------    LISTADO DE PRODUCTOS    ---------------------------
                    ----------------------------------------------------------------------------------
                    """);

        for(Producto producto: productos){
            System.out.println(producto.toString());
        }
    }

    public static void buscarProducto(ArrayList<Producto> productos, Scanner scanner){
        if (productos.isEmpty()) {
            System.out.println("No hay productos para buscar. ❌");
            return;
        }


        while (true) {
            try {
                System.out.println("""
                    Seleccione método de búsqueda:
                    1) Por Id
                    2) Por Nombre
                    """);

                int opcionProducto = Integer.parseInt(scanner.nextLine());

                switch (opcionProducto) {
                    case 1 -> {
                        System.out.print("Ingrese el ID del producto: ");
                        int idBuscado = Integer.parseInt(scanner.nextLine());

                        boolean encontrado = false;
                        for (Producto p : productos) {
                            if (p.getId() == idBuscado) {
                                System.out.println("Producto encontrado: ✅");
                                System.out.println("ID: " + p.getId());
                                System.out.println("Nombre: " + p.getNombre());
                                System.out.println("Categoría: " + p.getCategoria());
                                System.out.println("Precio: $ " + p.getPrecio());
                                System.out.println("Cantidad: " + p.getStock());
                                encontrado = true;

                                System.out.print("\n¿Desea editar el precio? (s/n): ");
                                String respuesta = scanner.nextLine().trim().toLowerCase();

                                if (respuesta.equals("s")) {
                                    while (true) {
                                        try {
                                            System.out.print("Ingrese el nuevo precio: ");
                                            double nuevoPrecio = Double.parseDouble(scanner.nextLine());
                                            if (nuevoPrecio <= 0) {
                                                System.out.println("El precio debe ser mayor que 0. ❌");
                                                continue;
                                            }
                                            p.setPrecio(nuevoPrecio);
                                            System.out.println("Precio actualizado correctamente. ✅");
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Debe ingresar un número válido para el precio. ❌");
                                        }
                                    }
                                } else {
                                    System.out.println("No se modificó el precio. ⚠️");
                                }
                                break;

                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se encontró ningún producto con ese ID. ⚠️");
                        }
                    }

                    case 2 -> {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombreBuscado = scanner.nextLine().trim();

                        boolean encontrado = false;
                        for (Producto p : productos) {
                            if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                                System.out.println("Producto encontrado: ✅");
                                System.out.println("ID: " + p.getId());
                                System.out.println("Nombre: " + p.getNombre());
                                System.out.println("Categoría: " + p.getCategoria());
                                System.out.println("Precio: $ " + p.getPrecio());
                                System.out.println("Cantidad: " + p.getStock());
                                encontrado = true;

                                System.out.print("\n¿Desea editar el precio? (s/n): ");
                                String respuesta = scanner.nextLine().trim().toLowerCase();

                                if (respuesta.equals("s")) {
                                    while (true) {
                                        try {
                                            System.out.print("Ingrese el nuevo precio: ");
                                            double nuevoPrecio = Double.parseDouble(scanner.nextLine());
                                            if (nuevoPrecio <= 0) {
                                                System.out.println("El precio debe ser mayor que 0. ❌");
                                                continue;
                                            }
                                            p.setPrecio(nuevoPrecio);
                                            System.out.println("Precio actualizado correctamente! ✅");
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Debe ingresar un número válido para el precio. ❌");
                                        }
                                    }
                                } else {
                                    System.out.println("No se modificó el precio. ⚠️");
                                }
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se encontró ningún producto con ese nombre. ⚠️");
                        }
                    }

                    default -> System.err.println("Seleccione una opcion valida. ❌");
                }

                // Preguntar si quiere buscar otro producto
                System.out.print("\n¿Desea buscar otro producto? (s/n): ");
                String respuesta = scanner.nextLine();
                if (!respuesta.equalsIgnoreCase("s")) {
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar una opcion valida. ❌");
            }
        }
    }

    public static void eliminarProducto(ArrayList<Producto> productos, Scanner scanner) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos para eliminar. ❌");
            return;
        }

        OperacionesMenu.mostrarProductos(productos);

        while (true) {
            try {
                System.out.print("\n¿Qué producto desea eliminar? Ingrese ID: ");
                int idEliminado = Integer.parseInt(scanner.nextLine().trim());

                boolean encontrado = false;

                for (int i = 0; i < productos.size(); i++) {
                    if (productos.get(i).getId() == idEliminado) {
                        encontrado = true;
                        System.out.print("¿Confirma eliminación? (s/n): ");
                        String respuesta = scanner.nextLine().trim().toLowerCase();

                        if (respuesta.equals("s")) {
                            System.out.println("Producto: " + productos.get(i).getNombre() + " eliminado correctamente!. ✅");
                            productos.remove(i);
                        } else {
                            System.out.println("Operación cancelada. ❌");
                        }
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("No existe ese ID en el listado!. ⚠️️");
                }

                System.out.print("\n¿Desea eliminar otro producto? (s/n): ");
                String continuar = scanner.nextLine().trim().toLowerCase();
                if (!continuar.equals("s")) {
                    System.out.println();
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido como identificador. ❌");
            }
        }
    }

    public static void crearPedido(ArrayList<Producto> productos,ArrayList<Pedido> pedidos, Scanner scanner){
        if(productos.isEmpty()) {
            System.out.println("No hay productos para agregar al pedido. ❌");
        }

        var pedido = new Pedido();

        while (true) {

            OperacionesMenu.mostrarProductos(productos);

            int id;
            while (true) {
                System.out.print("\nIngrese el Id del producto que desea agregar al pedido (0 para finalizar): ");
                String entrada = scanner.nextLine().trim();

                try {
                    id = Integer.parseInt(entrada);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor ingrese un número. ⚠️");
                }
            }

            if (id == 0) {
                break;
            }

            Producto seleccionado = null;
            for (Producto p : productos) {
                if (p.getId() == id) {
                    seleccionado = p;
                    break;
                }
            }

            if (seleccionado == null) {
                System.out.println("No existe un producto con ese ID. ⚠️");
                continue;
            }

            System.out.print("Ingrese la cantidad deseada: ");
            int cantidad = Integer.parseInt(scanner.nextLine().trim());

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que cero. ⚠️");
                continue;
            }

            if (seleccionado.getStock() < cantidad) {
                System.out.println("No hay suficiente stock disponible. ⚠️");
                continue;
            }

            pedido.agregarLinea(seleccionado, cantidad);
            seleccionado.reducirStock(cantidad);
            System.out.println("Producto agregado al pedido. ✅ ");
        }

        if (!pedido.getLineas().isEmpty()) {
            pedidos.add(pedido);
            System.out.println(pedido);
            System.out.println("Pedido confirmado y stock actualizado. ✅");
        } else {
            System.out.println("No se creó ningún pedido. ❌");
        }
    }

    public static void mostrarPedidos(ArrayList<Pedido> pedidos) {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos registrados. ❌");
            return;
        }
        System.out.print("""
                    
                    ---------------------------     LISTADO DE PEDIDOS     ---------------------------
                    ----------------------------------------------------------------------------------
                    """);
        for (Pedido p : pedidos) {
            System.out.println(p);
            System.out.println("----------------------------------------------------------------------------------");
        }
    }
}
