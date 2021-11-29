package hashPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * [매출액의 종류]
 *
 * 현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
 * 각 구간별로 구하라고 했습니다.
 *
 * 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
 * 20 12 20 10 23 17 10
 * 각 연속 4일간의 구간의 매출종류는
 *
 * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
 * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
 * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
 * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
 *
 * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
 * 매출액의 종류를 출력하는 프로그램을 작성하세요.
 *
 * 7 4
 * 20 12 20 10 23 17 10
 *
 * 3 4 4 3
 */
public class SalesType {

	public ArrayList<Integer> solution(int n, int k, int[] input) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < k - 1; i++) {
			map.put(input[i], map.getOrDefault(input[i], 0) + 1);
		}
		int pointer = 0;
		for (int index = k - 1; index < n; index++) {
			map.put(input[index], map.getOrDefault(input[index], 0) + 1);
			answer.add(map.size());
			map.put(input[pointer], map.get(input[pointer]) - 1);
			if (map.get(input[pointer]) == 0) {
				map.remove(input[pointer]);
			}
			pointer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SalesType salesType = new SalesType();
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = scanner.nextInt();
		}
		for (int a : salesType.solution(n, k, input)) {
			System.out.print(a + " ");
		}
	}
}
