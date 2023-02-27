package com.algaworks.algafood.di.notificacao;


import org.springframework.stereotype.Component;

import com.algaworks.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {
	
	public NotificadorEmail() {
		System.out.println("NotificadorEmail REAL");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Noticando %s através do e-mail %s: %s\n",
		cliente.getNome(), cliente.getEmail(), mensagem);
	}

	
}

