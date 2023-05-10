package br.com.consulta.cep.exception;

public class CepNotFoundException extends RuntimeException {
	private String mensagem;
	
	public CepNotFoundException(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public String getMessage() {
		return this.mensagem;
	}
}
