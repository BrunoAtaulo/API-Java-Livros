package com.gft.socialbooks.services.exceptions;

public class AutorExistenteException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7458490888033851426L;

	public AutorExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
}
