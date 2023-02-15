package com.xadrez.pecas;

import com.tabuleiro.Tabuleiro;
import com.xadrez.Cores;
import com.xadrez.Peca_Xadrez;

public class Torre extends Peca_Xadrez {
	
	public Torre() {	
	}
	
	public Torre(Tabuleiro tabuleiro, Cores cores) {
		super(tabuleiro, cores);
		/*
		 * super -  para repassar as informações para a superclasse
		 */
	}
	
	@Override
	public String toString() {
		return "T";
	}
}
