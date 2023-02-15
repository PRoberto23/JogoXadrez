package com.xadrez;

import com.tabuleiro.Peca;
import com.tabuleiro.Tabuleiro;

public class Peca_Xadrez extends Peca{
	private Cores cores;
	
	public Peca_Xadrez() {
		super();
	}

	public Peca_Xadrez(Tabuleiro tabuleiro, Cores cores) {
		super(tabuleiro);
		this.cores = cores;
	}

	public Cores getCores() {
		return cores;
	}
	
	/*
	 * Nao possui metodo set pois a cor da peça não pode ser alterada
	 */
	
}
