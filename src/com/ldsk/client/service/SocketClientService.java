package com.ldsk.client.service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import com.ldsk.server.protocol.Mensagem;
import com.ldsk.server.protocol.StatusMensagem;

public class SocketClientService {
	
	public static void conexao(Mensagem m) {
		try {
			Socket socket = new Socket("localhost", 5555);
			
			ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
			
			m.setStatusMensagem(StatusMensagem.OK);
			output.writeObject(m);
			output.flush();
			
			System.out.println("Mensagem" + m + "\n---- enviada ----\n");
	
			m = (Mensagem) input.readObject();
			
			
			if(m.getStatusMensagem() == StatusMensagem.OK) {
				System.out.println("Response - " + m);
			}else {
				System.out.println("Erro: " + m.getStatusMensagem());
			}
			
			output.close();
			input.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("Erro no cliente: " + e);
		}catch(ClassNotFoundException e) {
			System.out.println("Erro no cast: " + e.getMessage());
		}
	}
}
