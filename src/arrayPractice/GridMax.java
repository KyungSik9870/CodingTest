package arrayPractice;

import java.util.Scanner;

/**
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 */
public class GridMax {
	public int solution(int[][] inputs) {
		int answer = 0;
		int sum1;
		int sum2;

		for (int i = 0; i < inputs.length; i++) {
			sum1 = 0;
			sum2 = 0;
			for (int j = 0; j < inputs.length; j++) {
				sum1 += inputs[i][j];
				sum2 += inputs[j][i];
			}

			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}

		sum1 = 0;
		sum2 = 0;
		for (int i = 0; i < inputs.length; i++) {
			sum1 += inputs[i][i];
			sum2 += inputs[i][inputs.length - 1 - i];

			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GridMax gridMax = new GridMax();
		int n = scanner.nextInt();
		int[][] inputs = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				inputs[i][j] = scanner.nextInt();
			}
		}

		System.out.println(gridMax.solution(inputs));
	}
}
