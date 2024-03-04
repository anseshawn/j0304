package t2_array;

//배열의 복사(깊은 복사, 얕은 복사)
public class Test12 {
	public static void main(String[] args) {
		int[] su1 = {1,2,3,4,5,6};
		//int[] su2 = new int[6]; //복사해서 받을 배열은 최소 첫배열보다 커야함
		int[] su2 = new int[su1.length];
		int[] su3 = new int[su1.length];
		
		System.out.println("su1배열 : ");
		for(int i=0; i<su1.length; i++) {
			System.out.print(su1[i]+" ");
		}
		System.out.println("\n");
		
		System.out.println("su2배열 : ");
		for(int i=0; i<su2.length; i++) {
			System.out.print(su2[i]+" ");
		}
		System.out.println("\n");
		
		//배열복사(깊은복사)
		//힙영역 자체에서 값을 복사해서 su2를 정의해놓음
		for(int i=0; i<su1.length; i++) {
			su2[i] = su1[i];
		}
		
		System.out.println("su2배열 : ");
		for(int i=0; i<su2.length; i++) {
			System.out.print(su2[i]+" ");
		}
		System.out.println("\n");
		
		//배열복사(얕은복사)
		//스택영역에서 su1의 값을 받아옴
		su3 = su1; //su3이 가리켰던 값 말고 su1의 값을 가리키게 됨
		
		System.out.println("su3배열 : ");
		for(int i=0; i<su3.length; i++) {
			System.out.print(su3[i]+" ");
		}
		System.out.println("\n");
		
		// su1 주소의 값을 변경 후 확인해보자.
		su1[4] = 500;
		System.out.println("su1배열 : ");
		for(int i=0; i<su1.length; i++) {
			System.out.print(su1[i]+" ");
		}
		System.out.println("\n");
		
		System.out.println("su3배열 : ");
		for(int i=0; i<su3.length; i++) {
			System.out.print(su3[i]+" ");
		}
		System.out.println("\n");
		
		System.out.println("su2배열 : "); //처음에 저장된 su1의 값을 깊은복사로 가지고 있기 때문에 변하지 않는다
		for(int i=0; i<su2.length; i++) {
			System.out.print(su2[i]+" ");
		}
		System.out.println("\n");		
		
	}
}
