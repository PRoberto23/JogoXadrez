package com.xadrez.pecas;

import com.tabuleiro.Tabuleiro;
import com.xadrez.Cores;
import com.xadrez.Peca_Xadrez;

public class Rei extends Peca_Xadrez{
	
	public Rei() {
	}
	
	public Rei(Tabuleiro tabuleiro, Cores cores) {
		super (tabuleiro, cores);
	}
	
	@Override
	public String toString() {
		return "R" ;
	}
}
