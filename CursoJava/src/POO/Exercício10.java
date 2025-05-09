package POO;

import java.util.Locale;
import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		
		System.out.print("Insira o número de colunas: ");
		int col = sc.nextInt();
		System.out.print("Insira o número de linhas: ");
		int row = sc.nextInt();
		
		System.out.println();
		
		int[][] mat = new int [col][row];
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("Digite o número que você deseja que eu verifique: ");
		int numero = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(numero == mat[i][j]) {
					System.out.printf("Posição: %d, %d%n", i, j);
					
					if(i > 0) {
						System.out.printf("Em cima: %d%n", mat[i-1][j]);
					}
					if(j > 0) {
						System.out.printf("Esquerda: %d%n", mat[i][j-1]);
					}
					if(j < mat[i].length - 1) {
						System.out.printf("Direita: %d%n", mat[i][j+1]);
					}
					if(i < mat[i].length - 1) {
						System.out.printf("Em baixo: %d%n", mat[i+1][j]);
						System.out.println();
					}
				}
			}
		}
		
		
		sc.close();
	}
}
