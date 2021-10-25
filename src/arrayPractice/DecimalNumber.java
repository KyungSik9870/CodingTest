package arrayPractice;

import java.util.Scanner;

/**
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 */
public class DecimalNumber {
	public int solution(int n) {
		int answer = 0;
		int[] temp = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			temp[i] = i;
		}

		for (int i = 2; i <= n; i++) {
			if (temp[i] == 0) continue;
			for (int j = 2 * i; j <= n; j += i) {
				temp[j] = 0;
			}
		}

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != 0) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalNumber decimalNumber = new DecimalNumber();
		int n = scanner.nextInt();
		System.out.println(decimalNumber.solution(n));
	}
}
