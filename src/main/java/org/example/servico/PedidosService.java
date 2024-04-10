package org.example.servico;

import org.example.entities.Pedido;
import org.example.entities.Produto;

import javax.swing.*;
import java.util.*;

public class PedidosService {
	
	private static final List<Produto> listaProdutos = new ArrayList<>();
	private static final List<Pedido> listaPedidos = new ArrayList<>();
	
	public static void vender(String codigo, Long quantidade) {
		boolean produtoEncontrado = false;
		
		for (Produto produto : ProdutoServico.produtoList) {
			if (ProdutoServico.produtoList.isEmpty()) {
				JOptionPane.showMessageDialog(null, """
						Nao exitem produto cadastrados no estoque, inpossivel adicionar ao carrinho!
						""");
			} else {
				if (produto.getCodigo().equals(codigo)) {
					Produto produtoVendido = new Produto(
							produto.getNome(),
							produto.getCodigo(),
							produto.getPreco(),
							produto.getQuatidade()
					);
					produtoVendido.setQuatidade(quantidade);
					listaProdutos.add(produtoVendido);
					produtoEncontrado = true;
					break;
				}
				
				if (!produtoEncontrado) {
					JOptionPane.showMessageDialog(null, "Produto não encontrado!");
				}
			}
			
		}
	}
	
	public static void carrinho() {
		if (listaProdutos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Adicione produtos a o carrinho primeiro!");
		} else {
			JOptionPane.showMessageDialog(null, listaProdutos);
		}
	}
	
	public static void finalizar() {
		double valorTotal = 0;
		for (Produto produto : listaProdutos) {
			valorTotal += (produto.getPreco() * produto.getQuatidade());
		}
		Pedido pedido = new Pedido(listaProdutos, valorTotal);
		listaPedidos.add(pedido);
		listaProdutos.clear();
		JOptionPane.showMessageDialog(null, "Pedido finalizado com sucesso!");
	}
	
	public static void pedidosFinalizados() {
		if (listaPedidos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nunhum pedido a ser exibido!");
		} else {
			JOptionPane.showMessageDialog(null, listaPedidos);
		}
	}
	
}
