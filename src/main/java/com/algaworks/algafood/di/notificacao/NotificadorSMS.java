package com.algaworks.algafood.di.notificacao;



import org.springframework.stereotype.Component;

import com.algaworks.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorSMS implements Notificador {
	
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Noticando %s por SMS através do telefone %s: %s\n",
		cliente.getNome(), cliente.getTelefone(), mensagem);
	}

	
}
