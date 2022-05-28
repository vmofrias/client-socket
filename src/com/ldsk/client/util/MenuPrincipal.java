package com.ldsk.client.util;

import java.util.Scanner;

public class MenuPrincipal {
	public static void menu() {
		int escolha;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("-------- LEILAO DE ARTIGOS --------");
			System.out.println("1 - Cliente vendedor");
			System.out.println("2 - Cliente comprador");
			System.out.println("3 - Sair");
			System.out.println("Digite a opcao: ");
			escolha = scan.nextInt();
			
			switch(escolha) {
				case 1:
					MenuClientes.menuVendedor();
				break;
				case 2:
					MenuClientes.menuComprador();
				break;
				default:
					System.out.println("Opcao invalida!");
				break;
			}
		}while(escolha != 3);
		
	}
}
