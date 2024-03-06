package t3_exam;

//1~45숫자 중 6개의 수를 추출 후 정렬해서 출력시켜보자(중복 배제) - 숙제
public class Test6_lotto2 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		//6개의 숫자를 임의로 뽑아서 배열에 저장(중복 배제)
		for(int i=0; i<lotto.length; i++) {
			int num = (int)(Math.random()*45) + 1;
			lotto[i] = num;
			for(int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) { //받은 숫자와 이전에 받은 숫자 모두 비교
					i--;
					break;
				}
			}
		}
		
		//6개의 로또 번호를 정렬해서 출력
		int temp = 0;
		for(int i=1; i<=5; i++) {
			for(int j=i+1; j<=6; j++) {
				if(lotto[i-1] > lotto[j-1]) {
					temp = lotto[i-1];
					lotto[i-1] = lotto[j-1];
					lotto[j-1] = temp;
				}
			}
		}
		
		//출력
		System.out.println("이번 주 행운의 번호는?");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" / ");
		}
	}
}
