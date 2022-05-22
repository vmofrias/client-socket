package com.ldsk.client.service;

import java.util.Scanner;

import com.ldsk.server.model.Artigo;
import com.ldsk.server.model.ClienteVendedor;
import com.ldsk.server.protocol.Mensagem;

public class ClienteVendedorOperateService {
	
	public static void operacaoVenda() {
		Scanner scanVenda = new Scanner(System.in);
		
		System.out.println("Digite o nome do vendedor: ");
		String nomeVendedor = scanVenda.nextLine();
		System.out.println("Digite a descricao do artigo: ");
		String descricaoArtigo = scanVenda.nextLine();
		System.out.println("Digite o valor inicial do artigo: ");
		System.out.print("R$ - ");
		float valorInicial = scanVenda.nextFloat();
		
		Mensagem m = new Mensagem("VENDA");
		
		ClienteVendedor cliente = new ClienteVendedor();
		cliente.setNome(nomeVendedor);
		
		Artigo artigo = new Artigo(descricaoArtigo, valorInicial, cliente.getId());
		cliente.setArtigo(artigo);
		
		m.setParam("nomeVendedor", cliente.getNome());
		m.setParam("descricaoArtigo", cliente.getArtigo().getDescricao());
		m.setParam("valorInicial", cliente.getArtigo().getValorInicial());
		
		SocketClientService.conexao(m);
	}
	
	
	public static void operacaoEncerrar() {
		Scanner scanEncerrar = new Scanner(System.in);
		
		System.out.println("Digite o ID do responsavel pelo artigo: ");
		int idVendedor = scanEncerrar.nextInt();
		System.out.println("Digite o ID do artigo que deseja encerrar: ");
		int artigoId = scanEncerrar.nextInt();
		
		Mensagem m = new Mensagem("ENCERRAR");
		
		ClienteVendedor formV =  new ClienteVendedor();
		formV.setId(idVendedor);
		Artigo formA = new Artigo();
		formA.setId(artigoId);
		
		m.setParam("idVendedor", formV.getId());
		m.setParam("artigoId", formA.getId());
		
		SocketClientService.conexao(m);
	}
	
	public static void operacaoListar() {
		Mensagem m = new Mensagem("LISTAR");
		
		SocketClientService.conexao(m);
	}
}
