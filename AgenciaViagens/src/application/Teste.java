package application;

import resources.Carrinho;
import resources.Hospedagem;
import resources.PassagemAviao;

import java.text.ParseException;
import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        Hospedagem hospedagem = new Hospedagem();
        hospedagem.setCheckIn("18/08/2020 00:00");
        hospedagem.setCheckOut("20/08/2020 00:00");
        hospedagem.setPrecoDiaria(100.0);

        carrinho.getListaItens().add(hospedagem);

        PassagemAviao passagemAviao = new PassagemAviao();
        passagemAviao.setOrigem("JOI");
        passagemAviao.setDestino("LAX");
        passagemAviao.setPrecoPassagem(1800.0);
        passagemAviao.setTxEmbarque(200.0);

        carrinho.getListaItens().add(passagemAviao);

        try {
            System.out.println("Valor total dos itens no carrinho: US$" + carrinho.calcularTotal());
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
