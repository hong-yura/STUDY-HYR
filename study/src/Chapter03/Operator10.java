package Chapter03;

// Chapter03 연산자 연습문제 풀이
public class Operator10 {
	
	/* [3-10] 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가
	 * 대문자인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다.
	 * 예를 들어 'A'의 코드는 65이고 'a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.  
	 */
	public static void main(String[] args) {
		char ch = 'G';
		
		char lowerCase = (char)(ch >= 65 && ch <= 90 ? ch + 32 : ch);
		
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}

}
