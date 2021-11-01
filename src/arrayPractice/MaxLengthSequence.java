package arrayPractice;

import java.util.Scanner;

/**
 * [최대 길이 연속부분수열]
 *
 * 0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다.
 * 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
 * 만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
 *
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 *
 * 여러분이 만들 수 있는 1이 연속된 연속부분수열은
 * 1 1 0 0 1 1 1 1 1 1 1 1 0 1
 */
public class MaxLengthSequence {

	public int solution(int n, int k, int[] inputs) {
		int answer = 0;
		int count = 0;
		int pointer = 0;

		for (int i = 0; i < n; i++) {
			if (inputs[i] == 0) {
				count++;
			}
			while (count > k) {
				if (inputs[pointer] == 0) {
					count--;
				}
				pointer++;
			}
			answer = Math.max(answer, i - pointer + 1);
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MaxLengthSequence maxLengthSequence = new MaxLengthSequence();
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] inputs = new int[n];
		for (int i = 0; i < n; i++) {
			inputs[i] = scanner.nextInt();
		}
		System.out.println(maxLengthSequence.solution(n, k, inputs));
	}
}
