import java.io.Serializable;
public class Producto implements Serializable {
    private Integer idProducto;
    private String nombreProducto;
    private double precioProducto;
    private String lugarVenta;


    public Producto(Integer idProducto, String nombreProducto, double precioProducto, String lugarVenta) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.lugarVenta = lugarVenta;
    }
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getLugarVenta() {
        return lugarVenta;
    }

    public void setLugarVenta(String lugarVenta) {
        this.lugarVenta = lugarVenta;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto=" + precioProducto +
                ", lugarVenta='" + lugarVenta + '\'' +
                '}';
    }
}

