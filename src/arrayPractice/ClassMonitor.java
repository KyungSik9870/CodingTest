package arrayPractice;

import java.util.Scanner;

public class ClassMonitor {

	public int solution(int n, int[][] inputs) {
		int answer = 0;
		int max = 0;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				for (int h = 0; h < 5; h++) {
					if (inputs[i][h] == inputs[j][h]) {
						count++;
						break;
					}
				}
			}
			if (count > max) {
				max = count;
				answer = i + 1;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ClassMonitor classMonitor = new ClassMonitor();
		int n = scanner.nextInt();
		int[][] inputs = new int[n][5];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				inputs[i][j] = scanner.nextInt();
			}
		}

		System.out.println(classMonitor.solution(n, inputs));
	}
}
