package stackqueuePractice;

import java.util.Scanner;

public class CorrectBracket {

	public String solution(String s) {
		String answer = "";
		answer = isCorrect(s) ? "YES" : "NO";
		return answer;
	}

	public boolean isCorrect(String p) {
		int index = 0;
		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == '(') {
				index++;
			} else {
				index--;
			}
			if (index < 0)
				return false;
		}
		return index == 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CorrectBracket correctBracket = new CorrectBracket();
		String s = scanner.nextLine();
		System.out.println(correctBracket.solution(s));
	}
}
