package com.mycompany.granero;

public class CategoriaArticulo {
    
    private String codCat;
    private String categoria;
    private double ganancia;

    public CategoriaArticulo(String codCat, String categoria, double ganancia) {
        this.codCat = codCat;
        this.categoria = categoria;
        this.ganancia = ganancia;
    }

    public String getCodCat() {
        return codCat;
    }

    public void setCodCat(String codCat) {
        this.codCat = codCat;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(Float ganancia) {
        this.ganancia = ganancia;
    }
    
    public void showInfo(){
        System.out.println("Codigo Categoria: " + this.getCodCat());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Ganancia: " + this.getGanancia());
        System.out.println(" ");
    }
}
