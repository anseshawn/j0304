package t1_memory;

import java.util.Scanner;

public class Test1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int ans = 0; //1: 계속, 0:그만
		int cnt = 0;
		String ans = "N";
		
		while(true) {
			cnt++;
			System.out.println(cnt);
			System.out.print("작업을 계속할까요?(Y: 계속, N:그만) ");
			ans = sc.next(); //nextLine(): 엔터까지 포함, 여러 개 입력 받을 때 사용
			if(ans == "N") break; // ==: 값을 비교하는 연산자(기본 타입일 때) 참조타입일 땐 ==을 쓰면 안됨
		}//객체끼리 비교할 때 equals라는 객체비교 연산자 사용(ans. <<으로 사용)
		System.out.println("작업끝...");
		
		sc.close();
	}
}
