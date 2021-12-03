package sortingPractice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * [결정알고리즘]
 *
 * 지니레코드에서는 불세출의 가수 조영필의 라이브 동영상을 DVD로 만들어 판매하려 한다.
 * DVD에는 총 N개의 곡이 들어가는데, DVD에 녹화할 때에는 라이브에서의 순서가 그대로 유지되어야 한다.
 * 순서가 바뀌는 것을 우리의 가수 조영필씨가 매우 싫어한다. 즉, 1번 노래와 5번 노래를 같은 DVD에 녹화하기 위해서는
 * 1번과 5번 사이의 모든 노래도 같은 DVD에 녹화해야 한다. 또한 한 노래를 쪼개서 두 개의 DVD에 녹화하면 안된다.
 * 지니레코드 입장에서는 이 DVD가 팔릴 것인지 확신할 수 없기 때문에 이 사업에 낭비되는 DVD를 가급적 줄이려고 한다.
 * 고민 끝에 지니레코드는 M개의 DVD에 모든 동영상을 녹화하기로 하였다. 이 때 DVD의 크기(녹화 가능한 길이)를 최소로 하려고 한다.
 * 그리고 M개의 DVD는 모두 같은 크기여야 제조원가가 적게 들기 때문에 꼭 같은 크기로 해야 한다.
 *
 * 9 3
 * 1 2 3 4 5 6 7 8 9
 *
 * 17
 */
public class DecisionAlgorithm {
	public int count(int[] array, int capacity) {
		int count = 1;
		int sum = 0;
		for (int x : array) {
			if (sum + x> capacity) {
				count++;
				sum = x;
			} else {
				sum += x;
			}
		}

		return count;
	}

	public int solution(int n, int m, int[] array) {
		int answer = 0;
		int lt = Arrays.stream(array).max().getAsInt();
		int rt = Arrays.stream(array).sum();
		int mid;
		while (lt <= rt) {
			mid = (lt + rt) / 2;

			if (m >= count(array, mid)) {
				answer = mid;
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecisionAlgorithm decisionAlgorithm = new DecisionAlgorithm();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println(decisionAlgorithm.solution(n, m, array));
	}
}
