package stackqueuePractice;

import java.util.Scanner;
import java.util.Stack;

/**
 * [카카오 - 크레인 인형뽑기 문제]
 */
public class Crane {

	public int solution(int n, int[][] board, int m, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i : moves) {
			for (int j = 0; j < n; j++) {
				if (board[j][i - 1] != 0) {
					int target = board[j][i - 1];
					board[j][i - 1] = 0;

					if (!stack.isEmpty() && target == stack.peek()) {
						stack.pop();
						answer += 2;
					} else {
						stack.push(target);
					}
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Crane crane = new Crane();
		int n = scanner.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = scanner.nextInt();
			}
		}
		int m = scanner.nextInt();
		int[] moves = new int[m];
		for (int i = 0; i < m; i++) {
			moves[i] = scanner.nextInt();
		}
		System.out.println(crane.solution(n, board, m, moves));
	}
}
