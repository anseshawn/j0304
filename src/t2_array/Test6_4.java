package t2_array;

import java.util.Date; //대부분 util에 있는 걸 쓰는게 좋다 바꾸려면 지우고 다시 시도
import java.util.Scanner;

//ctrl + shift + O : import 단축키
public class Test6_4 {
	public static void main(String[] args) {		
		Date now = new Date();
		System.out.println("now : "+ now);
		
		Scanner sc = new Scanner(System.in);		
		String yn = "";
		
		System.out.print("계속 할까요?(Y/N) ");
		yn = sc.next();
		System.out.println("입력된 문자 : "+yn);
		
		for(int i=0; i<yn.length(); i++) { //문자를 쪼개서 한글자씩 비교하는 과정
			if(yn.charAt(i) == 'Y') System.out.println("입력된 문자 중 Y가 있습니다."); //문자라면 .equals로 비교
			//charAt()는 문자를 반환하기 때문에(char: 기본타입 이기 때문에) ==로 비교, '' 사용
			else System.out.println("입력된 문자 중 Y가 없습니다~~~");
		}
		
		sc.close();
	}
}
