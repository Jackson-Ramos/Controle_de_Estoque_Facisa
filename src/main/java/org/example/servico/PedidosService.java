package org.example.servico;

import org.example.entities.Pedido;

import java.util.HashSet;
import java.util.Set;

public class PedidosService {
	
	private static final Set<Pedido> listaPedidos = new HashSet<>();
	
	public static void vender(Pedido pedido) {
		listaPedidos.add(pedido);
	}
	
}
