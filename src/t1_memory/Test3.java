package t1_memory;

public class Test3 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동"; //힙영역에서 같은 변수가 있는지 찾은 후 있다면 같은 번지로 지정
		
		if(name1 == name2) System.out.println("name1과 name2는 같습니다.");
		else System.out.println("name1과 name2는 다릅니다.");
		System.out.println();
		
		if(name1.equals("홍길동")) System.out.println("name1은 '홍길동' 입니다.");
		else System.out.println("name1은 '홍길동'이 아닙니다.");
		System.out.println();
		
		if(name1.equals(name2)) System.out.println("name1과 name2는 같습니다."); //같은 값
		else System.out.println("name1과 name2는 다릅니다.");
		System.out.println();

	}
}
