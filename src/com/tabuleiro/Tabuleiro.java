package com.tabuleiro;

public class Tabuleiro {
	private Integer linhas;
	private Integer colunas;
	
	private Peca[][] pecas;

	
	/*
	 * Iniciar as variaveis como null no contrutor padrão
	 * para evitar erros
	 */
	public Tabuleiro() {
		linhas = null;
		colunas = null;
		pecas = null;
	}

	public Tabuleiro(Integer linhas, Integer colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}
	
	
}
