package org.example.entities;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public class Pedido {
	
	private static final AtomicLong codigoSequencial = new AtomicLong(0);
	private Long codigo;
	private List<Produto> pedidos;
	private Double valorPedido;
	
	// Contrutor
	public Pedido(List<Produto> pedidos, Double valorPedido) {
		this.codigo = codigoSequencial.incrementAndGet();
		this.pedidos = pedidos;
		this.valorPedido = valorPedido;
	}
	
	// Getters e setters
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
	
	//Equals
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Pedido pedido = (Pedido) o;
		return Objects.equals(codigo, pedido.codigo) && Objects.equals(pedidos, pedido.pedidos)
				&& Objects.equals(valorPedido, pedido.valorPedido);
	}
	
	//HashCode
	@Override
	public int hashCode() {
		return Objects.hash(codigo, pedidos, valorPedido);
	}
	
	//	ToString
	@Override
	public String toString() {
		return "Pedido:\n" +
				"codigo: " + codigo + "\n" +
				", pedidos: " + pedidos + "\n" +
				", valor do Pedido: " + valorPedido;
	}
}
