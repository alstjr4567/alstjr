package Operator;

import java.text.DecimalFormat;

public class Operator01 {

	public static void main(String[] args) {
		int money = 5738;
		int a = money/1000;
		int b = (money%1000)/100;
		int c = (money%1000)%100/10;
		int d = ((money%1000)%100)/10;
		
		System.out.println("천의자리 : "+ a);
		System.out.println("백의자리 : "+ b);
		System.out.println("십의자리 : "+ c);
		System.out.println("일의자리 : "+ d);
		
		DecimalFormat df = new DecimalFormat(); //javav.lang에 없음 인포트해야함
		
	}
}
/*
[문제] 동전 교환기
현금이 5738원이 있다. 각 자리별로 출력하시오.

[실행결과]
현금 5,783원
천의 자리 : 5
백의 자리 : 7
십의 자리 : 8
일의 자리 : 3

  
 
% 나머지연산자 는 반드시 양쪽이 정수여야한다.
*/