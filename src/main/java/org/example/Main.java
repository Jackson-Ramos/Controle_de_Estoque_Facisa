package org.example;

import org.example.entities.Produto;
import org.example.servico.PedidosService;
import org.example.servico.ProdutoServico;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

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
					
					String opcaoFluxo = "10";
					while (opcaoFluxo != "0") {
						opcaoFluxo = JOptionPane.showInputDialog(null, """
								[1] ADICIONAR PRODUTO
								[2] CARRINHO
								[3] FINALIZAR PEDIDO
								[4] PEDIDOS FINALIZADOS
								[0] VOLTAR
								""");
						
						switch (opcaoFluxo) {
							
							case "0": {
								opcaoFluxo = "0";
								break;
							}
							
							case "1": {
								String codigo = JOptionPane.showInputDialog(null, "DIGITE O CÓDIGO DO PRODUTO A SER COMPRADO:");
								String quantidade = JOptionPane.showInputDialog(null, "DIGITE A QUANTIDADE QUE VOCÊ DESEJA COMPRAR:");
								PedidosService.vender(codigo, Long.parseLong(quantidade));
								break;
							}
							
							case "2": {
								PedidosService.carrinho();
								break;
							}
							case "3": {
								PedidosService.finalizar();
								break;
							}
							
							case "4": {
								PedidosService.pedidosFinalizados();
								break;
							}
							
							default: {
								JOptionPane.showMessageDialog(null, "OPÇÃO DIGITADA INVALIDA POR FAVOR TENTE NOVAMENTE.");
							}
						}
					}
					break;
				}
				
				case "2": {
					
					String opcaoEstoque = "10";
					while (opcaoEstoque != "0") {
						
						opcaoEstoque = JOptionPane.showInputDialog(null, """
								[1] CADASTRAR
								[2] LISTAR
								[3] EDITAR
								[4] APAGAR
								[0] VOLTAR
								""");
						
						switch (opcaoEstoque) {
							
							case "0": {
								opcaoEstoque = "0";
								break;
							}
							
							// Cadastra
							case "1": {
								String nome = JOptionPane.showInputDialog(null, "DIGITE O NOME DO PRODUTO:");
								String codigo = JOptionPane.showInputDialog(null, "DIGITE O CÓDIGO DO PRODUTO");
								String preco = JOptionPane.showInputDialog(null, "DIGITE O PREÇO DO PRODUTO");
								String quantidade = JOptionPane.showInputDialog(null, "DIGITE QUANTAS UNIDADES VAI POR NO ESTOQUE");
								ProdutoServico.CadastraProdutoList(nome, codigo, Double.parseDouble(preco), Long.parseLong(quantidade));
								break;
							}
							
							//Listar
							case "2": {
								
								ProdutoServico.listProduto();
								break;
							}
							
							//Editar
							case "3": {
								String codigo = JOptionPane.showInputDialog(null, "DIGITE O CÓDIGO DO PRODUTO A SER EDITADO");
								String nome = JOptionPane.showInputDialog(null, "DIGITE UM NOVO NOME PARA O PRODUTO");
								String preco = JOptionPane.showInputDialog(null, "DIGITE UM NOVO PREÇO PARA O PRODUTO");
								String quantidade = JOptionPane.showInputDialog(null, "DIGITE A NOVA QUANTIDADE DO PRODUTO");
								ProdutoServico.editaProduto(codigo, nome, Double.parseDouble(preco), Long.parseLong(quantidade));
								break;
							}
							
							// Remover
							case "4": {
								String codigo = JOptionPane.showInputDialog(null, "DIGITE O CÓDIGO DO PRODUTO A SER REMOVIDO");
								ProdutoServico.removeProduto(codigo);
								break;
							}
							
							default: {
								JOptionPane.showMessageDialog(null, "OPÇÃO DIGITADA INVALIDA POR FAVOR TENTE NOVAMENTE.");
							}
						}
					}
					break;
				}
				default: {
					JOptionPane.showMessageDialog(null, "OPÇÃO DIGITADA INVALIDA POR FAVOR TENTE NOVAMENTE.");
				}
			}
		}
	}
}