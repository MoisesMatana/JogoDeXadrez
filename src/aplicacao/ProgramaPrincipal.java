package aplicacao;

import java.util.Scanner;

import Xadrez.PartidaDeXadrez;
import Xadrez.PecaDeXadrez;
import Xadrez.PosicaoXadrez;

public class ProgramaPrincipal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PartidaDeXadrez partidaXadrez = new PartidaDeXadrez();

		while (true) {
			InterfaceUsuario.imprimirTabuleiro(partidaXadrez.getPecas());
			System.out.println();
			System.out.print("Origem: ");
			PosicaoXadrez origem = InterfaceUsuario.lerPosicaoXadrez(sc);

			System.out.println();
			System.out.print("Destino: ");
			PosicaoXadrez destino = InterfaceUsuario.lerPosicaoXadrez(sc);

			PecaDeXadrez pecaCapturada = partidaXadrez.ajustarPecaXadrez(origem, destino);
		}
	}
}