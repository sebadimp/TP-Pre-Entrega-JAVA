public class LineaPedido {
    Producto producto;
    int cantidad;

    public LineaPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;

    }

    //METODOS
    public double getSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "Id: " + producto.getId() +" - Nombre: " + producto.getNombre() + " - Categoria: " + producto.getCategoria() + " - Cantidad: " +
                cantidad + " - Subtotal: $ " + String.format("%.2f", getSubtotal());
    }
}
