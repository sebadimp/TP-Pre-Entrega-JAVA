public class Producto {
    //Atributos
    private static int contador = 1;
    private int id;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    //CONSTRUCTOR
    public Producto(String nombre, String categoria, double precio, int stock) {
        this.id = contador++;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    //GETTERS Y SETTERS
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    //METODOS
    public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }

    @Override
    public String toString(){
        return String.format("Id: %d - Producto: %s - Categoria: %s - Precio: $ %.2f - Stock: %d", id, nombre, categoria, precio, stock);
    }
}
