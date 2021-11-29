package SortingPractice;

import java.util.Scanner;

/**
 * [Least Recently Used]
 */
public class LeastRecentlyUsed {
	public int[] solution(int n, int m, int[] array) {
		int[] answer = new int[n];
		for (int i : array) {
			int position = -1;
			for (int j = 0; j < n; j++) {
				if (i == answer[j]) {
					position = j;
				}
			}

			if (position == -1) {
				for (int k = n - 1; k >= 1; k--) {
					answer[k] = answer[k - 1];
				}
			} else {
				for (int k = position; k >= 1; k--) {
					answer[k] = answer[k - 1];
				}
			}

			answer[0] = i;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LeastRecentlyUsed leastRecentlyUsed = new LeastRecentlyUsed();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] array = new int[m];
		for (int i = 0; i < m; i++) {
			array[i] = scanner.nextInt();
		}
		for (int a : leastRecentlyUsed.solution(n, m, array)) {
			System.out.print(a + " ");
		}
	}
}
