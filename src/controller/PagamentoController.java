package controller;

import javax.swing.JOptionPane;

import model.TipoPagamento;

public class PagamentoController {

    public void fazerPagamento(TipoPagamento tipo) {
        if (tipo.getTipo().equals("cartão")) {
            String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do clinte");
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente");
            String numCartao = JOptionPane.showInputDialog(null, "Digite o número do cartão");
            String cvvCartao = JOptionPane.showInputDialog(null, "Digite o CVV do cartão");
            System.out.println("Pagamento processado para o cliente " + nome + " - CPF " + cpf + " - Cartão: "
                    + numCartao + " - CVV " + cvvCartao);
        } else if (tipo.getTipo().contains("pix")) {
            String chavePix = "0192381092819471974192730123114142331";
            System.out.println("Pagamento por pix utilizando a chave: " + chavePix);
        } else if (tipo.getTipo().equals("dinheiro")) {
            String troco = JOptionPane.showInputDialog(null, "Troco para quanto?");
            System.out.println("Cliente precisa de troco para R$ " + troco);
        } else {
            System.err.println("Opção inválida!");
        }
    }
}
