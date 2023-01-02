package com.tabuleiro;

public class Tabuleiro {
	private Integer linhas;
	private Integer colunas;

	private Peca[][] pecas;

	/*
	 * Iniciar as variaveis como null no contrutor padrão para evitar erros
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

	public Integer getLinhas() {
		return linhas;
	}

	public void setLinhas(Integer linhas) {
		this.linhas = linhas;
	}

	public Integer getColunas() {
		return colunas;
	}

	public void setColunas(Integer colunas) {
		this.colunas = colunas;
	}
	
	public void lugarPeca(Peca peca, Posicao posicao) {
		
	}

}
