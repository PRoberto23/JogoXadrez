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
		if(linhas < 1 || colunas < 1) {
			throw new ExcecaoXadrez("Erro ao criar tabuleiro: é necessário que haja pelo menos 1 linha e 1 coluna");
		}
		
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public Integer getLinhas() {
		return linhas;
	}

	public Integer getColunas() {
		return colunas;
	}
	
	public Peca peca(Integer linhas, Integer colunas) {
		if(!posicaoExist(linhas, colunas)) {
			throw new ExcecaoXadrez("Não existe essa posição no tabuleiro");
		}
		return pecas[linhas][colunas];
		
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExist(posicao)) {
			throw new ExcecaoXadrez("Não existe essa posição no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	
	/*
	 * RECEBE A PEÇA QUE FOI DECLARADA DENTRO DO TABULEIRO
	 */
	public void lugarPeca(Peca peca, Posicao posicao) {
		if(pecaExist(posicao)) {
			throw new ExcecaoXadrez("Já existe uma peça nessa posição");
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
		
	}
	
	public void removePeca
	
	private boolean posicaoExist(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
		
	}
	
	public boolean posicaoExist(Posicao posicao) {
		return posicaoExist(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean pecaExist(Posicao posicao) {
		if(!posicaoExist(posicao)) {
			throw new ExcecaoXadrez("Não existe essa posição no tabuleiro");
		}
		return peca(posicao) != null;
	}
}
