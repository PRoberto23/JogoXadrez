package com.xadrez;

public class ExcecaoLogic extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ExcecaoLogic() {
		
	}
	
	public ExcecaoLogic(String msg) {
		super(msg);
	}
}
