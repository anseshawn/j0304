package t2_array;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("args[0] = "+args[0]);
		System.out.println("args[1] = "+args[1]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
		//첨자 오류(배열 범위 밖으로 벗어남)
		//run configurations -> arguments에 값을 넣어주면 실행됨
	}
}
//어플리케이션 개발땐 쓸...? 수도...?