package Filter.Ejemplo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainProducto {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(new Producto("Computadora",500),new Producto("Telefono",400),new Producto("Lavadora",600), new Producto("Bolso",10),new Producto("Camisa",20),new Producto("televisor",300));
        List<String> productosCaros = productos.stream().filter(producto -> producto.getPrecio()>100).map(Producto::getNombre).toList();
        System.out.println("Productos Caros: " + productosCaros);
    }
}
