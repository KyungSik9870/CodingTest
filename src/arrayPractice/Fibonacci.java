package arrayPractice;

import java.util.Scanner;

public class Fibonacci {
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for (int i = 2; i < n; i++) {
			answer[i] = answer[i - 2] + answer[i - 1];
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Fibonacci fibonacci = new Fibonacci();
		int n = scanner.nextInt();
		for (int x : fibonacci.solution(n)) {
			System.out.print(x + " ");
		}
	}
}
