package arrayPractice;

import java.util.Scanner;

/**
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 */
public class RockPaperScissors {

	public void solution(int n, int[] inputA, int[] inputB) {
		for (int i = 0; i < n; i++) {
			if (inputA[i] == inputB[i]) {
				System.out.println("D");
			} else if (inputA[i] == 1 && inputB[i] == 3) {
				System.out.println("A");
			} else if (inputA[i] == 2 && inputB[i] == 1) {
				System.out.println("A");
			} else if (inputA[i] == 3 && inputB[i] == 2) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RockPaperScissors rockPaperScissors = new RockPaperScissors();
		int n = scanner.nextInt();
		int[] inputA = new int[n];
		int[] inputB = new int[n];

		for (int i = 0; i < n; i++) {
			inputA[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			inputB[i] = scanner.nextInt();
		}

		rockPaperScissors.solution(n, inputA, inputB);
	}
}
