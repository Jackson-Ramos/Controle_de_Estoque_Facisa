package org.example.entities;

import java.util.Objects;

public class Produto {
	
	private String nome;
	private String codigo;
	private String preco;
	
	public Produto(String nome, String codigo, String preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	public Produto() {
	}
	
	public String getPreco() {
		return preco;
	}
	
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
		return "Produto\n" +
				"nome: '" + nome + "\n" +
				" codigo: " + codigo + "\n" +
				" preco: " + preco + "\n";
	}
}

