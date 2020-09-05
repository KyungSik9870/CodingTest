package hashPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BestAlbum {
	
	/**
	 * Programmers
	 * 코딩테스트 연습 > Hash > 베스트앨범(lv.3)
	 * 
	 * --문제 설명----------------------------------------------------------------------------
	 * 
	 * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 
	 * 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다. 
	 * 
	 * 1. 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
	 * 2. 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
	 * 3. 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
	 * 
	 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 
	 * 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
	 * 
	 * ------------------------------------------------------------------------------------
	 * 
	 * @param genres
	 * @param plays
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<Integer, String> genresMap = new HashMap<Integer, String>();
		HashMap<Integer, Integer> playsMap = new HashMap<Integer, Integer>();	
		HashSet genresSet = new HashSet();
		try {
			//1. 장르를 중복제거하여 담는다.
			//key - value형식으로 장르 배열과 재생횟수 배열을 저장한다.
			for(int i = 0;i<genres.length;i++) {
				genresSet.add(genres[i]);
				genresMap.put(i,genres[i]);
				playsMap.put(i,plays[i]);
			}
			
			//HashSet의 장르를 list로 변환
			List genreList = new ArrayList(genresSet);
			HashMap<String, Integer> genrePlaySum = new HashMap<String, Integer>();
			HashMap<String, List> playInGenres = new HashMap<String, List>();
			
			//2. 장르 별 재생횟수의 합 + 장르 별 id와 횟수
			//장르랑 i의 매핑을 찾는다
			//장르가 여러개일 수 있으니깐 장르를 for문 돌림.
			for(int i = 0;i<genreList.size();i++) {
				int sum = 0;
				HashMap <Integer, Integer> playGenres = new HashMap<Integer, Integer>();
				for(int k = 0;k<genresMap.size();k++) {
					if(genreList.get(i).equals(genresMap.get(k))) {
						sum += playsMap.get(k); //장르별 합계
						playGenres.put(k,playsMap.get(k));//장르별 id,재생횟수 
					}
				}
				genrePlaySum.put((String) genreList.get(i), sum);
				
				//장르별 재생횟수 정렬
				List list = new ArrayList(playGenres.keySet());
				Collections.sort(list, (o1,o2)->(playGenres.get(o2).compareTo(playGenres.get(o1))));
				playInGenres.put((String) genreList.get(i), list.size()>2?list.subList(0, 2):list);
			}
			
			//3. 장르 순서
			List list = new ArrayList(genrePlaySum.keySet());
			Collections.sort(list, (o1,o2)->(genrePlaySum.get(o2).compareTo(genrePlaySum.get(o1))));
			
			//4. 장르 순서에 맞게 id출력
			List answerlist = new ArrayList<>();
			for(int i = 0;i<list.size();i++) {
				for(int j=0;j<playInGenres.get(list.get(i)).size();j++) {
					answerlist.add(playInGenres.get(list.get(i)).get(j));
				}
			}
			
			answer = new int[answerlist.size()];
			for(int i=0;i<answerlist.size();i++) {
				answer[i] = (int) answerlist.get(i);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
        return answer;
    }

}
