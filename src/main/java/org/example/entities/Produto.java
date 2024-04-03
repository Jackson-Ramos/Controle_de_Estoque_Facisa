package org.example.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Produto {
	
	private String nome;
	private Long codigo;
	private Double preco;
	private static List<Produto> produtoList = new ArrayList<>();
	
	public Produto(String nome, Long codigo, Double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	public Produto() {
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Long getCodigo() {
		return codigo;
	}
	
//	public void setCodigo(Long codigo) {
//		this.codigo = codigo;
//	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Produto produto = (Produto) o;
		return Objects.equals(codigo, produto.codigo);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	
	@Override
	public String toString() {
		return "Produto{" +
				"nome='" + nome + '\'' +
				", codigo=" + codigo +
				", preco=" + preco +
				'}';
	}
}
