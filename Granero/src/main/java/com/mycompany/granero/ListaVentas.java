package com.mycompany.granero;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaVentas {
    private List <Ventas> lVentas;

    public ListaVentas(List<Ventas> lVentas) {
        this.lVentas = lVentas;
    }

    public ListaVentas() {
        this.lVentas = new ArrayList<>();
    }
    
    public void addVenta(Ventas v){
        this.lVentas.add(v);
    }
    
    public void showList() throws ParseException {
        for(Ventas venta: this.lVentas){
            venta.showInfo();
        }
    }

    public void showVentasArt(String code){
        double sumatoria = 0;

        for(Ventas venta : lVentas){
            if(code == venta.getCodArticulo().getCodigo()){
                sumatoria = sumatoria + venta.getSubtotal();
            }
        }
        System.out.println("Es total de las ventas del articulo " + code + " es: " + sumatoria);
    }

    public void calcularTotalVenta(){

        Set<String> codigosUnicos = new HashSet<>();

        for (Ventas venta : lVentas) {
            String codigo = venta.getCodVentas();
            codigosUnicos.add(codigo);
        }

        String[] arrayCodigos = codigosUnicos.toArray(new String[0]);

        double sumatoria;
        for(String code : arrayCodigos){
            sumatoria = 0;
            for(Ventas venta : lVentas){
                if(code.equals(venta.getCodVentas())){
                    sumatoria = sumatoria + venta.getSubtotal();
                }
            }
            System.out.println("El total de las ventas con codigo " + code + " es: " + sumatoria);
        }
    }

    public void totalVentas(){
        double suma = 0;
        for(Ventas venta : lVentas){
            suma = suma + venta.getSubtotal();
        }
        System.out.println("El total de todas las ventas es: " + suma);
    }

    public void ventasFecha() {
        Set<String> fechasUnicas = new HashSet<>();
        for (Ventas venta : lVentas) {
            String fecha = venta.getFecha();
            fechasUnicas.add(fecha);
        }
        String[] arrayFechas = fechasUnicas.toArray(new String[0]);
        for (String fecha : arrayFechas) {
            System.out.println("En la fecha " + fecha + " se registraron las ventas con codigo: ");
            for (Ventas venta: lVentas){
                if (venta.getFecha().equals(fecha)){
                    System.out.println(venta.getCodVentas());
                }
            }
        }
    }

}
