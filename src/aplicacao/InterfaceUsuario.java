package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import Xadrez.PecaDeXadrez;
import Xadrez.PosicaoXadrez;

public class InterfaceUsuario {

	public static void imprimirTabuleiro(PecaDeXadrez[][] pecas) {
		for (int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pecas.length; j++) {
				imprimirPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("   a b c d e f g h");
	}

	public static PosicaoXadrez lerPosicaoXadrez(Scanner sc) {
		try {
			String s = sc.nextLine();
			char coluna = s.charAt(0);
			int linha = Integer.parseInt(s.substring(1));
			return new PosicaoXadrez(coluna, linha);

		} catch (RuntimeException e) {
			throw new InputMismatchException("Erro na leitura da posição, posições válidas a1 até h8.");
		}
	}

	private static void imprimirPeca(PecaDeXadrez peca) {
		if (peca == null) {
			System.out.print("*");
		} else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
}
