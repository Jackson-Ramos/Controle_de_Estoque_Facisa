package org.example.servico;

import org.example.entities.Pedido;
import org.example.entities.Produto;

import javax.swing.*;
import java.util.*;

public class PedidosService {
	
	private static final List<Produto> listaProdutos = new ArrayList<>();
	private static final List<Pedido> listaPedidos = new ArrayList<>();
	
	public static void vender(String codigo) {
		boolean produtoEncontrado = false;
		
		for (Produto produto : listaProdutos) {
			if (produto.getCodigo().equals(codigo)) {
				listaProdutos.add(produto);
				produtoEncontrado = true;
				break;
			}
			
			if (!produtoEncontrado) {
				JOptionPane.showMessageDialog(null, "Produto não encontrado!");
			}
		}
	}
	
}
