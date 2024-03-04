package t1_memory;

public class Test4 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = new String("홍길동"); //new: 객체생성연산자. 새로운 객체로 생성
		
		if(name1 == name2) System.out.println("name1과 name2는 같습니다.");
		//객체에서 부여된 값 비교, 다름
		else System.out.println("name1과 name2는 다릅니다.");
		System.out.println();
		
		if(name1.equals("홍길동")) System.out.println("name1은 '홍길동' 입니다.");
		else System.out.println("name1은 '홍길동'이 아닙니다.");
		System.out.println();
		
		if(name1.equals(name2)) System.out.println("name1과 name2는 같습니다.");
		//객체로 직접 넘어가서 객체값 자체를 비교하기 때문에 같게 나온다
		else System.out.println("name1과 name2는 다릅니다.");
		System.out.println();

	}
}
