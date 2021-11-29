package arrayPractice;

import java.util.Scanner;

/**
 * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
 * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
 */
public class Peaks {

	public int solution(int n, int[][] inputs) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (inputs[i][j] > inputs[i][j + 1] && inputs[i][j] > inputs[i + 1][j]
					&& inputs[i][j] > inputs[i][j - 1] && inputs[i][j] > inputs[i - 1][j]) {
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Peaks peaks = new Peaks();
		int n = scanner.nextInt();
		int[][] inputs = new int[n + 2][n + 2];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				inputs[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < n + 2; i++) {
			inputs[i][0] = 0;
			inputs[0][i] = 0;
			inputs[n + 1][i] = 0;
			inputs[i][n + 1] = 0;
		}

		System.out.println(peaks.solution(n, inputs));
	}
}
