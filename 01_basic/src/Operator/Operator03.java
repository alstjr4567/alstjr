package Operator;

import java.util.Scanner;

public class Operator03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("정수를 입력하세요 :");
		int a = sc.nextInt();
		
		String result = a%2==0 ? "짝수" : "홀수";
		System.out.println(a+"는"+ result);
		
		System.out.println(a+"는 2와 3의"+ (a%2==0 && a%3==0 ? "공배수이다" : "공배수 아니다"));
		//첫번째 방법
		String result2 = a%2==0 && a%3==0 ? "공배수이다" : "공배수가아니다";
		System.out.println(a+"는 2와 3의"+ result2);
		//두번째 방법
		
		
//		String result = score>=80 && score<=100 ? "합격" : "불합격";
		

//	      Scanner score = new Scanner(System.in);
//	      System.out.print("정수를 입력하세요 : ");
//	      int a=score.nextInt();
//	      
//	      System.out.println();
//	      
//	      String result = a%2==0? "짝수":"홀수";
//	      String div= a%2==0 && a%3==0? "2와 3의 공배수이다":"2와 3의 공배수가 아니다";
//	      System.out.println(a+"는 "+result);
//	      System.out.println(a+"는 "+div);
		
		
	}
}
/*
[문제]
정수를 입력하여 짝수? 홀수?

[실행결과]
정수 입력하시오 : 12
12는 짝수
12는 2와 3의 공배수이다
----------------------
정수 입력하시오 : 15
15는 홀수
15는 2와 3의 공배수 아니다


 2로 나누면 나머지 0 짝수
 
 2와3의공배수
 2로 나누어 떨어진다
 3
*/
