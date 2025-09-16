public class Producto {
String nombre;
int precio;
    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "El nombre del producto es " + nombre + " Y tiene un valor de " + precio + " dolares";
    }
}
