package org.example.servico;

import org.example.entities.Produto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoServico {

	private static List<Produto> produtoList = new ArrayList<>();

	public static void CadastraProdutoList(String nome, String codigo, String preco) {

		Produto produto = new Produto(nome, codigo, preco);
		boolean produtoExiste = false;

		for (Produto produtos : produtoList) {
			if (produtos.equals(produto)) {
				produtoExiste = true;
				break;
			}
		}

		if (!produtoExiste) {
			produtoList.add(produto);
			JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null,
					"O produto que será adicionado já foi cadastrado. Por favor, insira um novo\n" + "produto!");
		}
	}

	public static void listProduto() {
		JOptionPane.showMessageDialog(null, produtoList);
	}

	public static void editaProduto(String codigo, String nome, String preco) {
		boolean produtoEncontrado = false;

		for (Produto produto : produtoList) {
			if (produto.getCodigo().equals(codigo)) {
				produto.setNome(nome);
				produto.setPreco(preco);
				produtoEncontrado = true;
				break;
			}
		}

		if (!produtoEncontrado) {
			JOptionPane.showMessageDialog(null, "Produto não encontrado!");
		}
	}

	public static void removeProduto(String codigo) {
		boolean produtoRemovido = false;

		for (int i = 0; i < produtoList.size(); i++) {

			Produto produto = produtoList.get(i);

			if (produto.getCodigo().equals(codigo)) {
				produtoList.remove(i);
				produtoRemovido = true;
				break;
			}
		}

		if (!produtoRemovido) {
			JOptionPane.showMessageDialog(null, "Produto não encontrado!");
		}
	}
}