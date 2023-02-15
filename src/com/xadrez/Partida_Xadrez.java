package com.xadrez;

import com.tabuleiro.Posicao;
import com.tabuleiro.Tabuleiro;
import com.xadrez.pecas.Rei;
import com.xadrez.pecas.Torre;

public class Partida_Xadrez {
	private Tabuleiro tabuleiro;

	public Partida_Xadrez() {
		tabuleiro = new Tabuleiro(8,8);
		confInicial();
	}
	
	public Peca_Xadrez[][] getpecas(){
		Peca_Xadrez[][] part = new Peca_Xadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0 ; i<tabuleiro.getLinhas(); i++) {
			for(int j=0 ; j<tabuleiro.getColunas() ; j++) {
				part[i][j] = (Peca_Xadrez) tabuleiro.peca(i, j);
			}
		}
		return part;
	}
	
	private void colocarPeca(char coluna, int linha, Peca_Xadrez peca) {
		tabuleiro.lugarPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
		
	}
	
	private void confInicial() {
		colocarPeca('b', 6, new Torre(tabuleiro, Cores.BRANCA));
		colocarPeca('e', 8, new Rei(tabuleiro, Cores.PRETO));
	}
}
