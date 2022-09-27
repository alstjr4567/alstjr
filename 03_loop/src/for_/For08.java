package for_;

import java.util.Scanner;

public class For08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("숫자 입력 :");
			int num = sc.nextInt(); 
			if(num == 0)break;
			if(num < 0)continue;
			
			int count = 0; 
			for(int i=1;i<=num;i++) {
				if(num%1==0)System.out.println(i);

				int num1 = sc.nextInt(); //10

			}//for
			System.out.println();
			if(count==2)System.out.println(num+"는 소수이다");
			else System.out.println(num+"는 소수가 아니다");
		}//while
		
		System.out.println("프로그램을 종료합니다.");
	}
}
/*
[문제] 약수와 소수(1과 자기자신의 숫자만 약수로 갖는 수)를 구하기
0이 입력되면 종료된다
음수가 입력되면 숫자를 다시 입력한다.

[실행결과]
숫자입력 : -8
숫자입력 : -1
숫자 입력 : 12
1  2  3  4  6  12
12는 소수가 아니다

숫자 입력 : 37
1  37
37는 소수이다

숫자 입력 : 0
프로그램을 종료합니다.
*/