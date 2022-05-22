package com.ldsk.client.util;

import java.util.Scanner;

import com.ldsk.client.service.ClienteVendedorOperateService;
import com.ldsk.server.model.Artigo;
import com.ldsk.server.model.ClienteVendedor;

public class MenuClientes {

	public static void menuVendedor() {
		int escolhaVendedor;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("-------- MENU CLIENTE VENDEDOR --------");
			System.out.println("1 - Iniciar leilao");
			System.out.println("2 - Encerrar leilao");
			System.out.println("3 - Detalhe artigo dos vendedores");
			System.out.println("4 - Voltar");
			System.out.println("Digite a opcao: ");
			escolhaVendedor = scan.nextInt();
			
			switch(escolhaVendedor) {
				case 1:
					//VENDA
					ClienteVendedorOperateService.operacaoVenda();
				break;
				case 2:
					
				break;	
				case 3:
					//Detalhar
					ClienteVendedorOperateService.operacaoListar();
				break;
				default:
					System.out.println("Opcao invalida!");
				break;
			}
		}while(escolhaVendedor != 4);
	}

	public static void menuComprador() {
		int escolhaComprador;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("-------- MENU CLIENTE VENDEDOR --------");
			System.out.println("1 - Executar lance");
			System.out.println("2 - Artigos em aberto (lista)");
			System.out.println("3 - Voltar");
			System.out.println("Digite a opcao: ");
			escolhaComprador = scan.nextInt();
			
			switch(escolhaComprador) {
				case 1:
					//LANCAR
					
				break;
				case 2:
					//LISTAR
				break;
				default:
					System.out.println("Opcao invalida!");
				break;
			}
		}while(escolhaComprador != 3);
		
	}
	
}
