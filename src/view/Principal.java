package view;

import controller.IPagamentoStrategy;
import model.PagamentoCartao;
import model.PagamentoDinheiro;
import model.PagamentoPix;

public class Principal {
    public static void main(String[] args) {
        // PagamentoController pCont = new PagamentoController();
        // pCont.fazerPagamento(TipoPagamento.PIX);
        // pCont.fazerPagamento(TipoPagamento.CARTAO);
        // pCont.fazerPagamento(TipoPagamento.DINHEIRO);

        IPagamentoStrategy pagto = new PagamentoPix();
        pagto.fazerPagamento();

        pagto = new PagamentoCartao();
        pagto.fazerPagamento();

        pagto = new PagamentoDinheiro();
        pagto.fazerPagamento();
    }
}
