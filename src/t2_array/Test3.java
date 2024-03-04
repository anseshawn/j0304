package t2_array;

//향상된 for문(객체 안의 내용을 반복처리할 수 있다.)
public class Test3 {
	public static void main(String[] args) {
		int[] su = {100,80,50,30,70,60};
		
		System.out.println("일반적인 for문 출력");
		for(int i=0; i<su.length; i++) { //배열의 크기(길이)만큼 출력
			System.out.print(su[i] + " ");
		}
		System.out.println();
		
		
		//향상된 for문: for( 변수의타입 배열안의값을담을변수 : 객체명(또는 배열명))
		System.out.println("향상된 for문 출력");
		for(int s : su) {
			System.out.print(s + " / ");
		}		
		System.out.println();
		
		
		System.out.println("향상된 for문 출력(번지와 함께 출력하고자 한다.)");
		int sel = 0; //향상된 for문 이용시 위치를 찾고 싶다면 변수를 따로 주어야 한다
		for(int s : su) {
			System.out.println(sel + "번지 : " + s); //이 경우 일반 for문이 편할 수 있음(같은 i라는 변수 사용)
			sel++;
		}		
		System.out.println();
	}
}
