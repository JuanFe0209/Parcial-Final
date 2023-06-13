import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

abstract class RepositorioCrud  implements OperacionCrud{
private List<Producto> productos;

public RepositorioCrud() throws IOException, ClassNotFoundException {
    productos = new ArrayList<>();
}

    @Override
    public Producto findById(int id) {
        return productos.stream()
                .filter(producto -> producto.getIdProducto() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Producto> findAll() throws IOException, ClassNotFoundException {
         productos = (List<Producto>) ObjectSerializer.readObjectFromFile("Producto.ax");
        return productos;
    }

    @Override
    public void add(Producto producto) throws IOException {
        this.productos.add(producto);
        ObjectSerializer.writeObjectToFile(this.productos, "Producto.ax");

    }
    @Override
    public void update(Producto producto) throws IOException {
        Producto oldProducto = findById(producto.getIdProducto());
        if (oldProducto != null) {
            productos.remove(oldProducto);
            productos.add(producto);
            ObjectSerializer.writeObjectToFile(productos, "Producto.ax");

    }
        }
    @Override
    public void delete(Producto producto) throws IOException {
        productos.remove(producto);
        ObjectSerializer.writeObjectToFile(productos, "Producto.ax");
    }
}
