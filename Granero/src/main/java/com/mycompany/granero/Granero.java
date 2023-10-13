package com.mycompany.granero;

import java.text.ParseException;

public class Granero {

    public static void main(String[] args) throws ParseException {

        ListaCategoria liCategoria = new ListaCategoria();
        
        liCategoria.addCategoria(new CategoriaArticulo("0A","Alimentos",10));
        liCategoria.addCategoria(new CategoriaArticulo("0B","Aseo",15));
        
        CategoriaArticulo c;

        ListaArticulo liArticulo = new ListaArticulo();

        c = liCategoria.getCategoriaByCode("0A");
        liArticulo.addArticulo(new Articulo("01","Arroz", c ,50,2500));
        liArticulo.addArticulo(new Articulo("02","Café",c,100,3500));
        liArticulo.addArticulo(new Articulo("03","Frijol",c,60,5000));

        c = liCategoria.getCategoriaByCode("0B");
        liArticulo.addArticulo(new Articulo("04","Jabon",c,80,2500));
        liArticulo.addArticulo(new Articulo("05","Limpido",c,60,1500));
        liArticulo.addArticulo(new Articulo("06","Detergente",c,100,5500));
        liArticulo.addArticulo(new Articulo("07","Axion",c,90, 2000));

        liArticulo.generarGanancias(liCategoria);

        Articulo a;
        
        ListaVentas liVentas = new ListaVentas();

        a = liArticulo.getArtiuloByCode("01");
        liVentas.addVenta(new Ventas("00E",a,4, "15-10-2022"));
        liVentas.addVenta(new Ventas("00B",a,5, "18-05-2022"));
        a = liArticulo.getArtiuloByCode("02");
        liVentas.addVenta(new Ventas("00E",a,4, "15-10-2022"));
        liVentas.addVenta(new Ventas("00G",a,5, "22-08-2022"));
        a = liArticulo.getArtiuloByCode("03");
        liVentas.addVenta(new Ventas("00K",a,1, "15-10-2022"));
        liVentas.addVenta(new Ventas("00D",a,3, "12-12-2022"));
        a = liArticulo.getArtiuloByCode("05");
        liVentas.addVenta(new Ventas("00F",a,2, "05-11-2022"));
        a = liArticulo.getArtiuloByCode("06");
        liVentas.addVenta(new Ventas("00G",a,5, "22-08-2022"));

        //liCategoria.showList();
        //liArticulo.showList();
        //liVentas.showList();

        //liVentas.showVentasArt("01");
        //liVentas.calcularTotalVenta();
        //liVentas.totalVentas();
        liVentas.ventasFecha();
    }
}