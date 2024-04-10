package org.example.entities;

import java.util.Objects;

public class Produto {
	
	private String nome;
	private String codigo;
	private Double preco;
	private Long quatidade;
	
	public Produto(String nome, String codigo, Double preco, Long quatidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quatidade = quatidade;
	}
	
	public Produto() {
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Long getQuatidade() {
		return quatidade;
	}
	
	public void setQuatidade(Long quatidade) {
		this.quatidade = quatidade;
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
				" preco: " + preco + "\n" +
				"quantidade: " + quatidade + "\n";
	}
}

