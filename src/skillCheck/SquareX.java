package skillCheck;

public class SquareX {
	/**
	 * Programmers > 스킬 체크 > level1
	 * 
	 * --문제 설명-------------------------------------------------------------------------------
	 * 
	 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	 * 
	 * ---------------------------------------------------------------------------------------
	 * 
	 * 입출력 예
	 * --------------
	 * n	| return
	 * --------------
	 * 121	| 144
	 * 3	| -1
	 * 
	 * @param n
	 * @return
	 */
	public long solution(long n) {
        long answer = 0;
        double dsqrt = Math.sqrt(n);
        
        if(dsqrt == (int)Math.sqrt(n)) {
        	answer = (long) Math.pow(dsqrt+1, 2);
        }else {
        	answer = -1;
        }
        
        return answer;
    }
}
