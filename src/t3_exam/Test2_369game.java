package t3_exam;

/*
	(1번) 배열을 이용한 3,6,9 게임
	1~100까지의 수를 차례로 출력하되 3, 6, 9 자리는 숫자가 아닌,
	'짝'이라는 문자로 대치하시오.(한줄에 10개씩 출력하시오)
*/
public class Test2_369game {
	public static void main(String[] args) {
		String[] num = new String[100];
		int sw;
		String temp;
		
		//num[]배열에 3,6,9대신에 짝을 저장하는 부분
		for(int i=0; i<num.length; i++) {
			num[i] = (i + 1) + ""; //래퍼클래스(감싸는 클래스) 없이 문자+숫자는 문자로 인식됨
			temp = "";
			sw = 0;
			
			for(int j=0; j<num[i].length(); j++) {
				if(num[i].charAt(j)=='3' || num[i].charAt(j)=='6' || num[i].charAt(j)=='9') {
					temp += "짝"; //두자릿수를 위해 '짝'이라는 글자 누적
					sw = 1;
				}
			}			
			if(sw == 1) num[i] = temp;
		}
		
		//num[]배열에 저장된 값을 10개씩 출력
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
			if((i+1) % 10 == 0) System.out.println();
		}		
	}
}
