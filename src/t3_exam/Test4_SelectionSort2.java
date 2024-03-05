package t3_exam;

//스위치 넣기
public class Test4_SelectionSort2 {
	public static void main(String[] args) {
		int[] m = {1,2,3,7,9,8};
		int temp = 0;
		
		System.out.print("원본자료 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " ");
		}
		System.out.println();
		
		for(int i=1; i<=6; i++) {
			for(int j=i+1; j<=6; j++) {
				if(m[i-1] > m[j-1]) { 
					temp = m[i-1];
					m[i-1] = m[j-1];
					m[j-1] = temp;
				}
			}
		}		
		System.out.print("정렬자료 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " ");
		}
	}
}
