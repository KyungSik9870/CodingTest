package dynamicPractice;

import java.util.Scanner;

/**
 * [돌다리 건너기]
 */
public class StoneBridge {
	public int solution(int n) {
		int[] temp = new int[n + 2];
		temp[1] = 1;
		temp[2] = 2;
		for (int i = 3; i <= n + 1; i++) {
			temp[i] = temp[i - 2] + temp[i - 1];
		}
		return temp[n + 1];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StoneBridge stoneBridge = new StoneBridge();
		int n = scanner.nextInt();
		System.out.println(stoneBridge.solution(n));
	}
}
