package dynamicPractice;

import java.util.Scanner;

/**
 * [계단오르기]
 *
 * 철수는 계단을 오를 때 한 번에 한 계단 또는 두 계단씩 올라간다. 만약 총 4계단을 오른다면 그 방법의 수는
 *
 * 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2 로 5가지이다.
 *
 * 그렇다면 총 N계단일 때 철수가 올라갈 수 있는 방법의 수는 몇 가지인가?
 *
 * 7
 *
 * 21
 */
public class UpStairs {

	public int solution(int n) {
		int[] dynamic = new int[n + 1];
		dynamic[1] = 1;
		dynamic[2] = 2;
		for (int i = 3; i <= n; i++) {
			dynamic[i] = dynamic[i - 2] + dynamic[i - 1];
		}

		return dynamic[n];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UpStairs upStairs = new UpStairs();
		int n = scanner.nextInt();
		System.out.println(upStairs.solution(n));
	}
}
