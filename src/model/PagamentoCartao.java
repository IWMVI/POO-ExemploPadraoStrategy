package model;

import javax.swing.JOptionPane;

import controller.IPagamentoStrategy;

public class PagamentoCartao implements IPagamentoStrategy {

    @Override
    public void fazerPagamento() {
        String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do clinte");
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente");
        String numCartao = JOptionPane.showInputDialog(null, "Digite o número do cartão");
        String cvvCartao = JOptionPane.showInputDialog(null, "Digite o CVV do cartão");
        System.out.println("Pagamento processado para o cliente: " + nome + " - CPF " + cpf + " - Cartão: "
                + numCartao + " - CVV " + cvvCartao);
    }

}
