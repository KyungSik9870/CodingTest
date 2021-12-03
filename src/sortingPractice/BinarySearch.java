package sortingPractice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * [이분검색]
 *
 * 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
 * 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.
 *
 * 8 32
 * 23 87 65 12 57 32 99 81
 *
 * 3
 */
public class BinarySearch {

	public int solution(int n, int m, int[] array) {
		Arrays.sort(array);
		int mid;
		int low = 0;
		int high = n - 1;

		while (low <= high) {
			mid = (low + high) / 2;

			if (m == array[mid]) {
				return mid + 1;
			} else if (m < array[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinarySearch binarySearch = new BinarySearch();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println(binarySearch.solution(n, m, array));
	}
}
