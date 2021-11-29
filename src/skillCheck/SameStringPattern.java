package skillCheck;

public class SameStringPattern {
	/**
	 * Programmers > 스킬 체크 > level1
	 *
	 * --문제 설명-------------------------------------------------------------------------------
	 *
	 * 길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
	 * 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
	 *
	 * ----------------------------------------------------------------------------------------
	 *
	 * 입출력 예
	 * --------------
	 * n	| return
	 * --------------
	 * 3	| 수박수
	 * 4	| 수박수박
	 *
	 *
	 * @param n
	 * @return
	 */
	public String solution(int n) {
		String answer = "수박";

		return answer.repeat(n).substring(0, n);
	}

	public static void main(String args[]) {
		SameStringPattern s = new SameStringPattern();
		int n = 6;
		System.out.println(s.solution(n));
	}
}
