package com.tabuleiro;

public class ExcecaoXadrez extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ExcecaoXadrez() {
	}
	public ExcecaoXadrez(String msg) {
		super(msg);
	}

}
