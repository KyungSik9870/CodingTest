package stringPractice;

import java.util.Scanner;

/**
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 */
public class WordInSentence {

	public String solution(String str) {
		String answer = "";
		String[] strings = str.split(" ");
		int min = 0;
		for (String s : strings) {
			if (s.length() > min) {
				min = s.length();
				answer = s;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		WordInSentence wordInSentence = new WordInSentence();
		System.out.println(wordInSentence.solution(str));
	}
}
