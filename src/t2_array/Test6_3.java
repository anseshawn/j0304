package t2_array;

import java.util.Date; //대부분 util에 있는 걸 쓰는게 좋다 바꾸려면 지우고 다시 시도
import java.util.Scanner;

//ctrl + shift + O : import 단축키
public class Test6_3 {
	public static void main(String[] args) {		
		Date now = new Date();
		System.out.println("now : "+ now);
		
		Scanner sc = new Scanner(System.in);		
		String yn = "";
		
		System.out.print("계속 할까요?(Y/N) ");
		yn = sc.next();
		System.out.println("입력된 문자 : "+yn);
		
		for(int i=0; i<yn.length(); i++) { //문자열 자체를 비교하기 
			if(yn.equals("Y")) System.out.println("입력된 문자는 Y 입니다.");
			//문자라면 .equals로 비교 ""사용
			else System.out.println("입력된 문자는 Y가 아닙니다~~~");
		}
		
		sc.close();
	}
}
