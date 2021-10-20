package arrayPractice;

import java.util.Scanner;

/**
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력한다)
 */
public class BigNumber {

	public String solution(int[] inputs) {
		String answer = inputs[0] + "";
		for (int i = 1; i < inputs.length; i++) {
			if (inputs[i] > inputs[i - 1]) {
				answer += " " + inputs[i];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigNumber bigNumber = new BigNumber();
		int n = scanner.nextInt();
		int[] inputs = new int[n];
		for (int i = 0; i < n; i++) {
			inputs[i] = scanner.nextInt();
		}
		System.out.println(bigNumber.solution(inputs));
	}
}
