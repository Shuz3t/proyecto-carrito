public class carrito 
{
    private String nombre;
    private float total;
    private listad<producto> productos;

    public carrito(String nombre, float total, listad<producto> productos) 
    {
        this.nombre = nombre;
        this.total = total;
        this.productos = productos;
    }

    
    
}
