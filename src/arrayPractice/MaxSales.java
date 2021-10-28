package arrayPractice;

import java.util.Scanner;

/**
 * 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
 * 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
 * 12 15 11 20 25 10 20 19 13 15
 * 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
 * 여러분이 현수를 도와주세요.
 */
public class MaxSales {
	public int solution(int m, int[] a) {
		int sum = 0;
		int answer;

		for (int i = 0; i < m; i++) {
			sum += a[i];
		}
		answer = sum;
		for (int i = m; i < a.length; i++) {
			sum += a[i] - a[i - m];
			answer = Math.max(answer, sum);
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MaxSales maxSales = new MaxSales();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println(maxSales.solution(m, a));
	}
}
