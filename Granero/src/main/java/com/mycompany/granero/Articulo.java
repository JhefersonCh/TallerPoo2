package com.mycompany.granero;

public class Articulo {
    private String codigo;
    private String nombre;
    private CategoriaArticulo categoria;
    private long cantidad;
    private double valorCompra;
    private double valorVenta;

    public Articulo(String codigo, String nombre, CategoriaArticulo categoria, long cantidad, double valorCompra) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.valorCompra = valorCompra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CategoriaArticulo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaArticulo categoria) {
        this.categoria = categoria;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public void showInfo(){
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Categoria: " + this.getCategoria().getCodCat());
        System.out.println("Cantidad: " + this.getCantidad());
        System.out.println("Valor de compra: " + this.getValorCompra());
        System.out.println("Precio de venta: " + this.getValorVenta());
        System.out.println("");
    }
    
    public void setValorVenta(ListaCategoria categorias){
        this.valorVenta = this.valorCompra * (this.categoria.getGanancia()/100) + this.valorCompra;
    }
}
