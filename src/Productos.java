
import java.util.Comparator;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRN
 */
public class Productos {
     
   private int codigo;
    private String descripcion;
   private  double precio;
   private  int stock;
   private  String rubro;

   TreeSet<Productos> productos = new TreeSet<>();

    public Productos(int codigo, String descripcion, double precio, int stock, String rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    Productos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   
   
  

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Productos)) return false;
        Productos otro = (Productos) obj;
        return this.codigo == otro.codigo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }
   private boolean rubroValido(String rubro){
   return rubro.equalsIgnoreCase("comestible")||rubro.equalsIgnoreCase("limpieza")||rubro.equalsIgnoreCase("perfumeria");
   
   
   }
   @Override
    public String toString() {
        return codigo + " - " + descripcion + " - $" + precio + " - Stock: " + stock + " - Rubro: " + rubro;
    }
   
   
    
    
    
    
    
    
}
