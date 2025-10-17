public class Menu {
    //METODOS
    public void inicioMenu(){
        System.out.println("""
                
                -------            BIENVENIDO            -------
                ------------------------------------------------""");
    }

    public void opcionesMenu(){


        System.out.println("""                
                
                MENU:
                1) Agregar producto
                2) Listar productos
                3) Buscar/Actualizar producto
                4) Eliminar producto
                5) Crear pedido
                6) Listar pedidos
                0) Salir
                """);
    }

    public void finMenu(){
        System.out.println("""
                
                -------          VUELVA PRONTO!          -------
                ------------------------------------------------
                """);
    }



}
