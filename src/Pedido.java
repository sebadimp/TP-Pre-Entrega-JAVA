import java.util.ArrayList;

public class Pedido {
    private static int contador = 1;
    private ArrayList<LineaPedido> lineas;
    private int idPedido;

    public Pedido(){
        this.idPedido = contador++;
        this.lineas = new ArrayList<>();
    }

    public ArrayList<LineaPedido> getLineas() {
        return lineas;
    }

    public void agregarLinea(Producto producto, int cantidad) {
        lineas.add(new LineaPedido(producto, cantidad));
    }

    public double calcularTotal() {
        double total = 0;
        for (LineaPedido p : lineas) {
            total += p.getSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder informacion = new StringBuilder();
        informacion.append("Pedido N°: ").append(this.idPedido).append("\n");
        for(LineaPedido p : lineas) {
            informacion.append(p.toString()).append("\n");
        }
        informacion.append(String.format("Total: $ %.2f", calcularTotal()));
        return informacion.toString();

    }


}
