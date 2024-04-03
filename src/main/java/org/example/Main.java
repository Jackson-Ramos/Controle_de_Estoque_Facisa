package org.example;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		
		String ops = "10";
		while (ops != "0") {
			
			ops = JOptionPane.showInputDialog(null, """
					[1] FLUSSO DD CAIXA
					[2] CONTROLE DE ESTOQUE
					[0] SAIR
					""");
			
			switch (ops) {
				
				case "0": {
					
					JOptionPane.showMessageDialog(null, "OBRIGADO POR USAR NOSSO SISTEMA!!!");
					ops = "0";
					break;
					
				}
				
				case "1": {
					
					
					/*;
					AQUI VAI FICAR O FLUSSO DD CAIXA
					*/
					
					
					break;
				}
				
				case "2": {
					
					String opsEstoque = "10";
					while (opsEstoque != "0") {
						
						opsEstoque = JOptionPane.showInputDialog(null, """
								[1] CADASTRA PRODUTO
								[2] LISTA PRODUTOS
								[3] EDITAR
								[4] APAGAR
								[5] VENDER
								[0] VOLTAR
								""");
						
						switch (opsEstoque) {
							
							case "0": {
								opsEstoque = "0";
								break;
							}
							
							case "1": {
								break;
							}
							
							case "2": {
								break;
							}
							
							case "3": {
								break;
							}
							
							case "4": {
								break;
							}
							
							case "5": {
								break;
							}
						}
					}
				}
				
			}
		}
	}
}