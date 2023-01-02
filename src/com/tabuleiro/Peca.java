package com.tabuleiro;

public class Peca {
	protected Posicao posicao;
	
	private Tabuleiro tabuleiro;

	public Peca() {
		posicao = null;
		tabuleiro = null;
	}
	
	/*
	 * Posição não foi adicionada aos parâmetros do contrutor
	 * porque uma nova peça tem valor inicial nulo
	 */
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	/*
	 * O tabuleiro não pode ser acessível pela camada da inteligência do
	 *jogo de xadrez.
	 * O tabuleiro associado a uma peça só pode ser acessível no pacote tabuleiro
	 * e por subclasses de peça.
	 */
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	
	
}
