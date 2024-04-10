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
	
	public static void carrinho() {
		JOptionPane.showMessageDialog(null, listaProdutos);
	}
	
	public void finalizar() {
		double valorTotal = 0;
		for (Produto produto : listaProdutos) {
			valorTotal += (produto.getPreco() * produto.getQuatidade());
		}
		Pedido pedido = new Pedido(listaProdutos, valorTotal);
		listaPedidos.add(pedido);
	}
	
}
