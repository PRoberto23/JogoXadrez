package com.principal;

import com.xadrez.Partida_Xadrez;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Partida_Xadrez partidaXadrez = new Partida_Xadrez();
		UI.printBoard(partidaXadrez.getpecas());
	}

}
