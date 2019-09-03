package aplicacao;

import Xadrez.PartidaDeXadrez;

public class ProgramaPrincipal {
	public static void main(String[] args) {

		PartidaDeXadrez partidaXadrez = new PartidaDeXadrez();
		InterfaceUsuario.imprimirTabuleiro(partidaXadrez.getPecas());
	}
}