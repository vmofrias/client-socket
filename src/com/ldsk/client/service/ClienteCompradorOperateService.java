package com.ldsk.client.service;

import java.util.Scanner;

import com.ldsk.server.model.ClienteComprador;
import com.ldsk.server.model.Lance;
import com.ldsk.server.protocol.Mensagem;

public class ClienteCompradorOperateService {
	public static void operacaoLance() {
		Scanner scanLance = new Scanner(System.in);
		
		System.out.println("Digite o ID do artigo: ");
		int artigoId_ = Integer.parseInt(scanLance.nextLine());
		System.out.println("Digite o valor do seu lance: ");
		float valorLance = Float.parseFloat(scanLance.nextLine());
		System.out.println("Digite o seu email de contato: ");
		String emailConta = scanLance.nextLine();
				
		Mensagem m = new Mensagem("LANCAR");
		
		ClienteComprador cliente = new ClienteComprador(emailConta);
		
		Lance lance = new Lance(artigoId_, cliente.getEmail(), valorLance, cliente.getId());
		
		
		m.setParam("artigoId", lance.getArtigoId());
		m.setParam("valorLance", lance.getValor());
		m.setParam("emailContato", lance.getEmailComprador());
		
		SocketClientService.conexao(m);
	}
	
	public static void operacaoListarArtigosAbertos() {
		Mensagem m = new Mensagem("LISTAR_ARTIGOS");
		
		SocketClientService.conexao(m);
	}
}
