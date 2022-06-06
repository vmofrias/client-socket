package com.ldsk.client.util;

import java.util.Scanner;

import com.ldsk.client.service.ClienteCompradorOperateService;
import com.ldsk.client.service.ClienteVendedorOperateService;

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
					//ENCERRAR
					ClienteVendedorOperateService.operacaoEncerrar();
				break;	
				case 3:
					//DETALHAR
					ClienteVendedorOperateService.operacaoListar();
				break;
				case 4:
					System.out.println("Voce voltou.");
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
			System.out.println("-------- MENU CLIENTE COMPRADOR --------");
			System.out.println("1 - Executar lance");
			System.out.println("2 - Artigos em aberto (lista)");
			System.out.println("3 - Voltar");
			System.out.println("Digite a opcao: ");
			escolhaComprador = scan.nextInt();
			
			switch(escolhaComprador) {
				case 1:
					//LANCAR
					ClienteCompradorOperateService.operacaoLance();
				break;
				case 2:
					//LISTAR
					ClienteCompradorOperateService.operacaoListarArtigosAbertos();
				break;
				case 3:
					System.out.println("Voce voltou.");
				break;
				default:
					System.out.println("Opcao invalida!");
				break;
			}
		}while(escolhaComprador != 3);
		
	}
	
}
