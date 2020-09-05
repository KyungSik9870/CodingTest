package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HIndex {
	
	/**
	 * Programmers
	 * 코딩테스트 연습 > 정렬 > H-Index(lv.2)
	 * 
	 * --문제 설명----------------------------------------------------------------------------
	 * 
	 * H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 
	 * 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.
	 * 어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.
	 * 어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 
	 * 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.
	 * 
	 * --입출력 예--------------------
	 * citations		| return
	 * ----------------------------
	 * [3, 0, 6, 1, 5]	| 3
	 * ----------------------------
	 * 
	 * --위키 링크 : https://en.wikipedia.org/wiki/H-index
	 * 
	 * ------------------------------------------------------------------------------------
	 * 
	 * @param citations
	 * @return
	 */
	public int solution(int[] citations) {
        int answer = 0;
        List<Integer> list = Arrays.stream(citations).boxed().collect(Collectors.toList());
        list.sort(Collections.reverseOrder());
		
        List<Integer> answerlist = new ArrayList<Integer>();
        for(int i=0;i<list.size();i++) {
        	answerlist.add(i);
        	if(i>=list.get(i)) break;
        }
        
        if(list.stream().min(Integer::compare).orElse(0) >= list.size()) {
        	answer = list.size();
        }else {
        	answer = answerlist.stream().max(Integer::compare).orElse(0);        	
        }
        return answer;
    }
}
