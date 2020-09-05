package skillCheck;

public class Bracket {
	public String solution(String p) {
        //1. 빈 문자열일 때, 빈 문자열 반환.
        if(p.length()==0) {
        	return "";
        }
        //2. 균형잡힌 괄호 문자열 u, v로 분리. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없다.
        int index = getIndex(p);
        String u = p.substring(0,index);
        String v = p.substring(index,p.length());
        if(isCorrect(u)) {
        	//3. u가 올바른 문자열일 경우, v를 recursive 태운 후 u에 붙여서 반환
        	return u + solution(v);
        }else {
        	//4. u가 올바른 문자열이 아닐 경우
        	//4-1~3. 앞에 "(" 붙인 후, v를 recursive, 뒤에 ")" 붙인다.
        	String blank = "("+solution(v)+")";
        	//4-4. u의 첫번째, 마지막 문자 제거 후, 괄호 방향을 뒤집는다. 
        	u = u.substring(1,u.length()-1);
        	u = reverseStr(u);
        	return blank+u;
        }
    }
	
	public int getIndex(String p) {
        int index = 0, start = 0, end = 0;
        for(index=0; index<p.length(); index++) {
        	if(p.charAt(index) == '(') {
        		start ++;
        	}else {
        		end ++;
        	}
        	if(start==end) {
        		return index+1;
        	}
        }  
        return index;
	}
	
	public boolean isCorrect(String p) {
		int index = 0;
		for(int i=0;i<p.length();i++) {
        	if(p.charAt(i) == '(') {
        		index ++;
        	}else {
        		index --;
        	}
        	if(index < 0) return false;
        }
		return index==0;
	}
	
	public String reverseStr(String p) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<p.length();i++) {
			if(p.charAt(i)==')') {
				sb.append('(');
			}else {
				sb.append(')');
			}
		}
		return sb.toString();
	}
	
	
	public static void main(String args[]) {
		Bracket b = new Bracket();
		String p1 = "(()())()";
		String p = ")(";
		System.out.println(b.solution(p));
	}
	
}
