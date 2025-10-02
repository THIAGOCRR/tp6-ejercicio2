/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Objects;

/**
 *
 * @author PC1
 */
public class Producto implements Comparable<Producto> {
    Long codigo;
    String descripcion;
    String rubro;
    double precio;
    int stock;

    public Producto(Long codigo, String descripcion, String rubro, double precio, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.rubro= rubro;
        this.precio = precio;
        this.stock = stock;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
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

    
    
    @Override
    public String toString() {
        return "Producto: " + codigo + ", " + descripcion + ", " + rubro + ", " + precio + ", " + stock;
    }

    @Override
    public int compareTo(Producto o) {
        return this.codigo.compareTo(o.codigo);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(this.codigo, other.codigo);
    }



    
    
}