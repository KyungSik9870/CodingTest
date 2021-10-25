package arrayPractice;

import java.util.Scanner;

/**
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * 첫 자리부터의 연속된 0은 무시한다.
 */
public class ReverseDecimalNumber {

	public String solution(String[] inputs) {
		String answer = "";

		for (int i = 0; i < inputs.length; i++) {
			StringBuffer stringBuffer = new StringBuffer(inputs[i]);
			String reverseStr = stringBuffer.reverse().toString();
			int reverse = Integer.parseInt(reverseStr);
			boolean isDecimal = true;
			for (int j = 2; j < reverse; j++) {
				if (reverse % j == 0) {
					isDecimal = false;
					break;
				}
			}

			if (isDecimal && reverse != 1) {
				answer += reverse + " ";
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ReverseDecimalNumber reverseDecimalNumber = new ReverseDecimalNumber();
		int n = scanner.nextInt();
		String[] inputs = new String[n];
		for (int i = 0; i < n; i++) {
			inputs[i] = scanner.next();
		}
		System.out.println(reverseDecimalNumber.solution(inputs));
	}
}
