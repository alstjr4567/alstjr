package class_2;

import java.util.Scanner;

public class StringBufferMain {
	private static int dan;

	public void  output() {
		StringBuffer buffer = new StringBuffer();
		
		for(int i=1; i<=9;i++) {
			
		
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer.toString());
			buffer.delete(0, buffer.length());
	}
		
	public static void main(String[] args) {
		StringBufferMain StringBufferMain =new StringBufferNain();
		Scanner sc = new Scanner(System.in);
		
		dan = sc.nextInt();
		
		
		
           
			for(int j=1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
			
			
		}	
		
		
	}
}
/* 
원하는 단을 입력 : input()  입력
------------------------------
5*1=5		  output()  출력


5*9=45
*/