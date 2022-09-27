package array;

public class Array01 {
	public static void main(String[] args) {
		int[] ar; //배열 선언
		ar = new int[5];//배열 생성
		ar[0]=25;
		ar[1]=78;
		ar[2]=30;
		ar[3]=43;
		ar[4]=52;
		
		System.out.println("배열명 ar = " + ar);
		System.out.println("배열의 크기 = "+ ar.length);
		for(int i=0;i<ar.length;i++) {
		System.out.println("ar["+i+"]" +"=" + ar[i]);
		}//for
		System.out.println();
		
		System.out.println("거꾸로 출력");
		for(int i = ar.length-1;i>=0;i-- ) {
			System.out.println("ar["+i+"] = "+ar[i]);
		}
		System.out.println();
		
		System.out.println("짝수 데이터만 출력");
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)System.out.println("ar["+i+"] = "+ar[i]);
		}
		System.out.println();
		System.out.println("확장 for문");
		for(int data : ar) {
			//데이터를 하나씩 건내준다.
			System.out.println(data);
			
		}
	}
}
/*
배열명은 배열의 주소값을 가지고 있다.
주소는 참조 값
length 배열의 갯수 크기

*/