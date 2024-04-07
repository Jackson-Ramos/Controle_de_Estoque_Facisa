package org.example;

import org.example.servico.ProdutoServico;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		
		String opcao = "10";
		while (opcao != "0") {
			
			opcao = JOptionPane.showInputDialog(null, """
					[1] FLUXO DE CAIXA
					[2] CONTROLE DE ESTOQUE
					[0] SAIR
					""");
			
			switch (opcao) {
				
				case "0": {
					
					JOptionPane.showMessageDialog(null, "OBRIGADO POR USAR NOSSO SISTEMA!!!");
					opcao = "0";
					break;
					
				}
				
				case "1": {
					
					
					/*;
					AQUI VAI FICAR O FLUXO DD CAIXA
					*/
					
					
					break;
				}
				
				case "2": {
					
					String opcaoEstoque = "10";
					while (opcaoEstoque != "0") {
						
						opcaoEstoque = JOptionPane.showInputDialog(null, """
								[1] CADASTRA PRODUTO
								[2] LISTA PRODUTOS
								[3] EDITAR
								[4] APAGAR
								[5] VENDER
								[0] VOLTAR
								""");
						
						switch (opcaoEstoque) {
							
							case "0": {
								opcaoEstoque = "0";
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
								String codigo = JOptionPane.showInputDialog(null, "DIGITE O CODIGO DO PRODUTO A SER EDITADO");
								String nome = JOptionPane.showInputDialog(null, "DIGITE UM NOVO NOME PARA O PRODUTO");
								String preco = JOptionPane.showInputDialog(null, "DIGITE UM NOVO PREÇO PARA O PRODUTO");
								ProdutoServico.editaProduto(codigo, nome, preco);
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