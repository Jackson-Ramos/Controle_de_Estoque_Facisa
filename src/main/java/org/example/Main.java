package org.example;

import org.example.servico.ProdutoServico;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		
		String ops = "10";
		while (ops != "0") {
			
			ops = JOptionPane.showInputDialog(null, """
					[1] FLUSSO DD CAIXA
					[2] CONTROLE DE ESTOQUE
					[0] SAIR
					""");
			
			switch (ops) {
				
				case "0": {
					
					JOptionPane.showMessageDialog(null, "OBRIGADO POR USAR NOSSO SISTEMA!!!");
					ops = "0";
					break;
					
				}
				
				case "1": {
					
					
					/*;
					AQUI VAI FICAR O FLUSSO DD CAIXA
					*/
					
					
					break;
				}
				
				case "2": {
					
					String opsEstoque = "10";
					while (opsEstoque != "0") {
						
						opsEstoque = JOptionPane.showInputDialog(null, """
								[1] CADASTRA PRODUTO
								[2] LISTA PRODUTOS
								[3] EDITAR
								[4] APAGAR
								[5] VENDER
								[0] VOLTAR
								""");
						
						switch (opsEstoque) {
							
							case "0": {
								opsEstoque = "0";
								break;
							}
							
							case "1": {
								String nome = JOptionPane.showInputDialog(null, "DIGITE O NOME DO PRODUTO");
								String codigo = JOptionPane.showInputDialog(null, "DIGITE O CODIGO DO PRODUTO");
								String preco = JOptionPane.showInputDialog(null, "DIGITE O PREÇO DO PRODUTO");
								ProdutoServico.CadastraProdutoList(nome, codigo, preco);
								break;
							}
							
							case "2": {
								ProdutoServico.listProduto();
								break;
							}
							
							case "3": {
								break;
							}
							
							case "4": {
								break;
							}
							
							case "5": {
								break;
							}
						}
					}
				}
				
			}
		}
	}
}