package model;

import controller.IPagamentoStrategy;

public class PagamentoPix implements IPagamentoStrategy {

    @Override
    public void fazerPagamento() {
        String chavePix = "0192381092819471974192730123114142331";
        System.out.println("Pagamento por pix utilizando a chave: " + chavePix);
    }

}
