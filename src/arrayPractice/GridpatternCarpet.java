package arrayPractice;

public class GridpatternCarpet {

	/**
	 * Programmers > 완전탐색 > 카펫
	 *
	 * --문제 설명----------------------------------------------------------------------------
	 *
	 * 격자 무늬 카펫을 사려고 한다. 이격자의 형태는 테두리 한줄은 갈색이고, 가운데는 빨간색으로 채워져 있는 형태이다.
	 * 격자의 무늬는 기억하지 못하고 갈색 격자의 객수와 빨간색 격자의 갯수만을 기억하고 있다.
	 *
	 * Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
	 * Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	 *
	 * ex> 갈색 10, 빨간색 2
	 *
	 * 다음과 같이 조건이 격자의 수 2개가 주어졌을 때, 가로와 세로를 {4,3} 배열로 출력하는 함수를 만들어라.
	 * 가로의 길이는 세로의 길이와 같거나 크다.
	 *
	 * - 예상값
	 * - 10,2 -> {4,3}
	 * - 8,1 -> {3,3}
	 * - 24,24 -> {8,6}
	 *
	 * ------------------------------------------------------------------------------------
	 *
	 * @param brown
	 * @param yellow
	 * @return
	 */
	public int[] solution(int brown, int yellow) {
		int answer[] = new int[2];
		int sero = 0;
		int garo = 0;

		for (int i = 1; i <= yellow; i++) {
			if (yellow % i == 0) {
				int tmpgaro = i + 2;
				int tmpsero = (yellow / i) + 2;
				//가로세로 정하기
				if ((tmpgaro * tmpsero) == (brown + yellow)) {
					if (tmpgaro >= tmpsero) {
						garo = tmpgaro;
						sero = tmpsero;
					} else {
						garo = tmpsero;
						sero = tmpgaro;
					}
				}
			}
		}
		answer[0] = garo;
		answer[1] = sero;

		return answer;
	}
}
