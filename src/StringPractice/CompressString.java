package StringPractice;

import java.util.Scanner;

/**
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 * KKHSSSSSSSE
 * K2HS7E
 */
public class CompressString {

	public String solution(String str) {
		String answer = "";
		str = str + " ";
		int count = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				answer += str.charAt(i) + (count > 1 ? String.valueOf(count) : "");
				count = 1;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CompressString compressString = new CompressString();
		String str = scanner.next();
		System.out.println(compressString.solution(str));
	}
}
