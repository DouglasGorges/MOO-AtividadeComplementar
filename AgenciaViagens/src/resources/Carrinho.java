package resources;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<I_Item> listaItens = new ArrayList<>();

    public Double calcularTotal() throws ParseException {
        Double totalCarrinho = 0.0;
        for (I_Item item : this.listaItens) {
            totalCarrinho += item.calcularPreco();
        }
        return totalCarrinho;
    }

    public List<I_Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<I_Item> listaItens) {
        this.listaItens = listaItens;
    }
}
