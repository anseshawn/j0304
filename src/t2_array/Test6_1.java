package t2_array;

public class Test6_1 {
	public static void main(String[] args) {
		char[] strArray = {'K','o','r','e','a'};
		
		for(int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		System.out.println(strArray); //char타입 배열은 String클래스처럼 사용 가능하다
		//for문으로 반복 지정하지 않아도 출력됨
	}
}
