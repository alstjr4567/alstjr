package while_;

public class While01 {
	public static void main(String[] args) {
		int a=1;
		while(a<=10) {
			System.out.println(a);
			a++;
		
		}//while
		System.out.println();
		
		//1 2 3 4 5 6 7 8 9
		int b=0;
		while(b<=10) {
			b++;
			System.out.println(b+" ");
		
		}//while
		System.out.println();
		
		int c=0;
		while(true) {
			c++;
			System.out.println();
			if(c>=10)break;
		}
	}
}
