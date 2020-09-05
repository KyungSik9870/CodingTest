package arrayPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxNumber {
	
	/**
	 * Programmers
	 * 코딩테스트 연습 > 정렬 > 가장 큰 수 (lv.2)
	 * 
	 * --문제 설명----------------------------------------------------------------------------
	 * 
	 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
	 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 
	 * 이중 가장 큰 수는 6210입니다.
	 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 
	 * 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
	 * 
	 * ------------------------------------------------------------------------------------
	 * 
	 * ** 이 문제는 {0,0,0,0,0} 케이스가 들어왔을때, 00000 이 아닌 0으로 return하는 것을 생각해야했음.
	 * 
	 * @param numbers
	 * @return
	 */
	public String solution(int[] numbers) {
        String answer = "";
        List<String> answerlist = Arrays.stream(numbers).boxed().map(x->x.toString())
        		                      .sorted((a,b) -> Integer.compare(Integer.parseInt(b+a),Integer.parseInt(a+b)))
        		                      .collect(Collectors.toList());
                	
        answer = answerlist.stream().reduce((a,b) -> a+b).get();
        
        if(answerlist.get(0).equals("0")) {
        	answer = "0";
        }
        
        return answer;
    }
}
