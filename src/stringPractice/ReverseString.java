package stringPractice;

import java.util.Scanner;

/**
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 */
public class ReverseString {

	public void solution(String[] inputs) {
		for (String s : inputs) {
			StringBuffer stringBuffer = new StringBuffer(s);
			System.out.println(stringBuffer.reverse());
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] inputs = new String[n];
		for (int i = 0; i < n; i++) {
			inputs[i] = scanner.next();
		}
		ReverseString reverseString = new ReverseString();
		reverseString.solution(inputs);
	}
}
