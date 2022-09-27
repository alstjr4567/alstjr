package if_;

import java.util.Scanner;

public class if03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("a의 값 :");
		a=sc.nextInt();
		System.out.print("b의 값 :");
		b=sc.nextInt();
		System.out.print("c의 값 :");
		c=sc.nextInt();
		//System.out.println(a+" "+b+" "+c);
		
		if(a<=b && a<=c) { //a가 가장 작은 경우
			if(b<=c)System.out.println(a+","+b+","+c);
			else System.out.println(a+","+c+","+b);
		}else if(b<=c) { //b가 가장 작은 경우
			if(a<=c)System.out.println(b + "," +a+ "," +c);
			else System.out.println(b+ ","+c+","+a);
		}else { //c가 가장 작은 경우
			if(a<=b)System.out.println(c+","+a+","+b);
			else System.out.println(c+","+b+","+a);
		}
		
			
		}
		
	}
/*
  
 
*/