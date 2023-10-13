
package com.mycompany.granero;

import java.util.ArrayList;
import java.util.List;

public class ListaCategoria {
    private List <CategoriaArticulo> lCategoria;

    public ListaCategoria(List<CategoriaArticulo> lCategoria) {
        this.lCategoria = lCategoria;
    }

    public List<CategoriaArticulo> getlCategoria() {
        return lCategoria;
    }
    

    public void showList(){
        for(CategoriaArticulo categoria : lCategoria){
            categoria.showInfo();
        }
    }

    public CategoriaArticulo getCategoriaByCode(String code){
        for (CategoriaArticulo cat: lCategoria) {
            if(code.equals(cat.getCodCat())){
                return cat;
            }
        }
        return null;
    }

    public ListaCategoria() {
        this.lCategoria = new ArrayList<>();
    }

    public void addCategoria(CategoriaArticulo c){
        this.lCategoria.add(c);
    }
}
