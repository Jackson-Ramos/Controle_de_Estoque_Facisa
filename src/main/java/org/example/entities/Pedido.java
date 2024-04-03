package org.example.entities;

import javax.annotation.processing.Generated;
import java.util.*;

public class Pedido {
	
	private Long codigo;
	private List<Produto> pedidos;
	private Double valorPedido;
	
	private static final Set<Pedido> PEDIDOS = new HashSet<>();
	
	public Pedido(Long codigo, List<Produto> pedidos, Double valorPedido) {
		this.codigo = codigo;
		this.pedidos = pedidos;
		this.valorPedido = valorPedido;
	}
	
	public Pedido() {
	}
	
	public Long getCodigo() {
		return codigo;
	}
	
	
	public List<Produto> getPedidos() {
		return pedidos;
	}
	
	public void setPedidos(List<Produto> pedidos) {
		this.pedidos = pedidos;
	}
	
	public Double getValorPedido() {
		return valorPedido;
	}
	
	public void setValorPedido(Double valorPedido) {
		this.valorPedido = valorPedido;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pedido pedido = (Pedido) o;
		return Objects.equals(codigo, pedido.codigo) && Objects.equals(pedidos, pedido.pedidos) && Objects.equals(valorPedido, pedido.valorPedido);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo, pedidos, valorPedido);
	}
	
	@Override
	public String toString() {
		return "Pedido{" +
				"codigo=" + codigo +
				", pedidos=" + pedidos +
				", valorPedido=" + valorPedido +
				'}';
	}
}
