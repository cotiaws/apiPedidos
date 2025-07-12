package br.com.cotiinformatica.domain.exceptions;

public class PedidoNaoCriadoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {	
		return "Falha ao criar o pedido.";
	}
}
