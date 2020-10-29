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
	public String getNombre()
    {
		return nombre;
	}

	public void setNombre(String nombre)
    {
		this.nombre = nombre;
	}

	public float getTotal() 
    {
		return total;
	}

	public void setTotal(float total) 
    {
		this.total = total;
	}

	public ListaDoble<Producto> getProductos() 
    {
	   return productos;
	}

	public void setProductos(ListaDoble<Producto> productos)
    {
	   this.productos = productos;
	}

    
    
}
