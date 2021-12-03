package hashPractice;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * [K번째 큰 수]
 *
 * 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
 * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
 * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
 *
 * 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
 *
 * 10 3
 * 13 15 34 23 45 65 33 11 26 42
 *
 * 143
 */
public class KMaxNumber {

	public int solution(int k, int[] array) {
		int answer = -1;
		TreeSet<Integer> temp = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int f = j + 1; f < array.length; f++) {
					temp.add(array[i] + array[j] + array[f]);
				}
			}
		}
		int count = 0;
		for (int x : temp) {
			count++;
			if (count == k) {
				return x;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		KMaxNumber kMaxNumber = new KMaxNumber();
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(kMaxNumber.solution(k, array));
	}
}
