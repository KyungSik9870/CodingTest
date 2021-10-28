package arrayPractice;

import java.util.Scanner;

/**
 * [연속 부분수열]
 *
 * N개의 수로 이루어진 수열이 주어집니다.
 * 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
 * 만약 N=8, M=6이고 수열이 다음과 같다면
 *
 * 1 2 1 3 1 1 1 2
 *
 * 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
 */
public class ContinuousSubsequence {
	public int solution(int m, int[] a) {
		int answer = 0;
		int start = 0;
		int end = 0;
		int sum = 0;

		while (start < a.length) {
			if (end >= a.length) {
				start++;
				end = start;
				sum = 0;
				continue;
			}

			sum += a[end];

			if (sum == m) {
				start++;
				end = start;
				sum = 0;
				answer++;
			} else if (sum > m) {
				start++;
				end = start;
				sum = 0;
			} else {
				end++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ContinuousSubsequence continuousSubsequence = new ContinuousSubsequence();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println(continuousSubsequence.solution(m, a));
	}
}
