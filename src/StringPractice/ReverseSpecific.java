package StringPractice;

import java.util.Scanner;

/**
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 */
public class ReverseSpecific {

	public String solution(String str) {
		char[] strArray = str.toCharArray();
		char[] answerArray = new char[strArray.length];

		for (int i = 0; i < strArray.length; i++) {
			if (Character.isAlphabetic(strArray[i])) {
				answerArray[strArray.length - i - 1] = strArray[i];
			} else {
				answerArray[i] = strArray[i];
			}
		}

		return String.valueOf(answerArray);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		ReverseSpecific specific = new ReverseSpecific();
		System.out.println(specific.solution(str));
	}
}
