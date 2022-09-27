package for_;

public class For01 {
	public static void main(String[] args) {
		int i;
		
		for(i=1;i<=10;i++) {//선언초기화 for문안에 하면 for문밖에는 i를 인식 못함
		System.out.println("Hello Java"+i);
		}
		
		System.out.println("탈출 i = "+i);
		System.out.println();
		
		for(i=10;i>=1;i--) {
			System.out.print(i+" ");
			
	
		}
		//65~90
		for(i='A';i>=1;i++) {
			System.out.print(i+" ");
		}
	}

}
/*



*/