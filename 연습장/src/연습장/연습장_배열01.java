package 연습장;

public class 연습장_배열01 {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50};
		
//		for(int i =0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		//확장 포문 배열에서만 사용가능 
		for(int x : a) { // int타입 x라는 변수에 a방에있는 값 하나씩만 대입
			System.out.println(x);
		}
	}
}
