package program;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o numero de linhas:");
		int linhas = input.nextInt();
		System.out.print("Digite o numero de colunas: ");
		int colunas = input.nextInt();

		int [][] matrix = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.printf("Digite o numero Linha %d Coluna %d :", i + 1, j + 1);
				matrix[i][j] = input.nextInt();
			}
		}
		System.out.println("Digite o numero que deseja encontrar");
		int encontra = input.nextInt();

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (matrix[i][j] == encontra) {
					System.out.println((i+1) + "," + (j+1));
					
					
					if(j > 0){
					System.out.println("Esquerda " + matrix[i][j-1]);
					}
					if(j < matrix[i].length-1){
					System.out.println("Direita " + matrix[(i)][j+1]);
					}
					if(i>0){
					System.out.println("Acima " + matrix[i-1][(j)]);
					}
					if(i < matrix.length -1){
					System.out.println("Abaixo " + matrix[i+1][(j)]);
					}
				}
			}
		}
	}
}
