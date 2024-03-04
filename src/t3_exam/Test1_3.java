package t3_exam;

import java.util.Scanner;

//최대최솟값 구하기(2자리 이하의 정수가 입력된다) - 입력받은 데이터를 모두 출력하시오.
//단, 모든 숫자를 다 입력받은 후에 최댓값과 최솟값을 구하시오 (일괄처리방식, 배치프로세싱)
public class Test1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = -99, min = 99, su, cnt=0;
		int[] arr = new int[200];
		//입력부
		while(true) {
			System.out.print("정수를 입력하세요(종료:999) : ");
			su = sc.nextInt();
			if(su == 999) break;
			
			arr[cnt] = su;
			cnt++;
		}
		
		//처리부
		for(int i=0; i<cnt; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		
		//출력부
		for(int i=0; i<cnt; i++) {
			System.out.print(arr[i] + " / ");
		}
		System.out.println();
		System.out.println("최댓값 : "+max+", 최솟값 : "+min);
		
		sc.close();
	}
}
