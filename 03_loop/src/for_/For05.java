package for_;

import java.util.Scanner;

public class For05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mul = 0;
		
		System.out.println("x : ");
		int x=sc.nextInt();
		System.out.println("y : ");
		int y=sc.nextInt();
		
		for(int i=1; i<=y; i++) {
			mul *= x;
			
		}
		System.out.println(x+"의"+y+"승"+mul);
		}	
	}

/*
[문제] x의 y승을 구하시오 (for)

[실행결과]
x : 2
y : 5
2의 5승 xx (2*2*2*2*2)
---------------------------
x : 3
y : 4
3의 4승 xx (3*3*3*3)

 */
