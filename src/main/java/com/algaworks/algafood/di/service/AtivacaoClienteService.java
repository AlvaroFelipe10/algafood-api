package com.algaworks.algafood.di.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDoNotificador;
import com.algaworks.di.modelo.Cliente;

@Component
public class AtivacaoClienteService {
	
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
		
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		
	}

}
