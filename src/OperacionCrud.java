import java.io.IOException;
import java.util.List;

public interface OperacionCrud {
        Producto findById(int id);

        List<Producto> findAll() throws IOException, ClassNotFoundException;
        void add(Producto producto) throws IOException;
        void update(Producto producto) throws IOException;
        void delete(Producto producto) throws IOException;
    }

