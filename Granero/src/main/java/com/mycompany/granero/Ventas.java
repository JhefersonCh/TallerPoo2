package com.mycompany.granero;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ventas {
    private String codVentas;
    private Articulo codArticulo;
    private String nombre;
    private double cantidad;
    private double precio;
    private double subtotal;

    private String fecha;


    public Ventas(String codVentas, Articulo codArticulo, double cantidad, String fecha) {
        this.codVentas = codVentas;
        this.codArticulo = codArticulo;
        this.nombre = "";
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.precio = 0.0;
        this.subtotal = 0.0;
    }

    public String getCodVentas() {
        return codVentas;
    }

    public void setCodVentas(String codVentas) {
        this.codVentas = codVentas;
    }

    public Articulo getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(Articulo codArticulo) {
        this.codArticulo = codArticulo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        this.subtotal = this.getCodArticulo().getValorVenta() * this.getCantidad();
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {

        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Date getFechaFormat() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaFormateada = dateFormat.parse(this.getFecha());
        return fechaFormateada;
    }

    public void showInfo() throws ParseException {

        System.out.println("Codigo de venta: " + this.getCodVentas());
        System.out.println("Fecha de venta: " + this.getFechaFormat());
        System.out.println("Codigo de articulo: " + this.getCodArticulo().getCodigo());
        System.out.println("Nombre del articulo: " + this.getCodArticulo().getNombre());
        System.out.println("Cantidad: " + this.getCantidad());
        System.out.println("Precio unitario: " + this.getCodArticulo().getValorVenta());
        System.out.println("Subtotal: " + this.getSubtotal());
        System.out.println(" ");
    }
}