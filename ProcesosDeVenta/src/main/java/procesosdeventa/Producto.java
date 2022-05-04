package procesosdeventa;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Producto {
    
    private String titulo;
    private String caracteristicas;
    private String categoria;
    private double precioVenta;
    private ImageIO imagen;
    private int stock;
    private LocalDate fechaEntrada;
    private ArrayList<Resena> resenas;

    public Producto(String titulo, String caracteristicas, String categoria,
            double precioVenta, ImageIO imagen,
            int stock, LocalDate fechaEntrada, ArrayList<Resena> resenas) {
        this.titulo = titulo;
        this.caracteristicas = caracteristicas;
        this.categoria = categoria;
        this.precioVenta = precioVenta;
        this.imagen = imagen;
        this.stock = stock;
        this.fechaEntrada = fechaEntrada;
        this.resenas = resenas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public ImageIO getImagen() {
        return imagen;
    }

    public void setImagen(ImageIO imagen) {
        this.imagen = imagen;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public ArrayList<Resena> getResenas() {
        return resenas;
    }

    public void setResenas(ArrayList<Resena> resenas) {
        this.resenas = resenas;
    }
    
    
            
}
