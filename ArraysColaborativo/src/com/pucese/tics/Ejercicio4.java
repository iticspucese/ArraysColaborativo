package LadyV;

import java.util.*;
//8 queens checker. A permutation of the integer 0 to N-1 corresponds to a placement of 
//queens on an N-by-N chessboard so that no two queens are in the same row or column.
public class Ejercicio4 {
	
	public static void main (String args[]) {
		int size = 8;

		int board[][] = new int[size][size];

		if (nQueens(board, 0, size)) {
			System.out.println("La solucion es!");
			muestraResultado(board, size);
		}
		else {
			System.out.println("No hay solucion.");
		}
	}
	
	public static boolean isAttacked (int x, int y, int board[][], int N) {
	
		for (int i = 0; i < N; i++) {
			if ((board[x][i] == 1) && (i != y)) {
				return true;
			}

			if ((board[i][y] == 1) && (i != x)) {
				return true;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if ( ((i + j) == (x + y)) || ((i - j) == (x - y)) ) {
					if (((i != x) || (j != y)) && (board[i][j] == 1)) {
						return true;
					}
				}
			}
		}

		return false;
	}

	public static boolean nQueens (int board[][], int level, int N) {
		if (level == N) {
			return true;
		}

		for (int j = 0; j < N; j++) {

			if (isAttacked(level, j, board, N)) {
				continue;
			}

			board[level][j] = 1;

			if(nQueens(board, level+1, N)) {
				return true;
			}

			board[level][j] = 0;
		}

		return false;
	}

	public static void muestraResultado (int[][] board, int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(" " + board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	
}