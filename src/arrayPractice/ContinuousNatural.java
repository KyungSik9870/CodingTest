package arrayPractice;

import java.util.Scanner;

/**
 * [연속된 자연수의 합]
 *
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 * 만약 N=15이면
 *
 * 7+8=15
 * 4+5+6=15
 * 1+2+3+4+5=15
 *
 * 와 같이 총 3가지의 경우가 존재한다.
 */
public class ContinuousNatural {
	public int solution(int n) {
		int answer = 0;
		int count = 1;
		n--;
		while (n > 0) {
			count++;
			n = n - count;
			if (n % count == 0) {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ContinuousNatural continuousNatural = new ContinuousNatural();
		int n = scanner.nextInt();
		System.out.println(continuousNatural.solution(n));
	}
}
