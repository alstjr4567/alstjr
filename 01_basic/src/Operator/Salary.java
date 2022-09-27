package Operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		//이름(name),직급(position), 기본급(bp), 수당(time), 세금(tax), 합계(sum), 월급(pay)
		String name,position;
		int bp= 0,time= 0,tax,pay,sum;
		
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("직급 입력 : ");
		position= sc.next();
		System.out.print("기본급 입력 : ");
		bp = sc.nextInt();
		System.out.print("수당 입력 : ");
		time = sc.nextInt();
		
		
		//합계(sum)	
		sum = bp + time; 
		//tax(세금)
		tax = (int) ((sum>=4000000)? sum * 0.03 :(sum>=3000000 && sum<4000000)? sum * 0.02 : sum * 0.01);
		//월급(pay)
		pay = sum-tax;
		
		
		System.out.println("*** "+name+" "+position+"의 월급 ***");
		System.out.println("기본급 : "+df.format(bp)+"원");
		System.out.println("수당 : "+df.format(time)+"원");
		System.out.println("합계 : "+df.format(sum)+"원");
		System.out.println("세금 : "+df.format(tax)+"원");
		System.out.println("월급 : "+df.format(pay)+"원");
		
		
		
	}

}
/* 
 mul 소숫점3자리마다 쉼표찍어줌
 
[문제] 월급 계산 프로그램
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
단 합계가 4,000,000원이 이상이면 3%
	   3,000,000원이 이상이면 2%
	   아니면 1%
*조건연산자 써야함 if문(x)

합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4,900,000
수당 입력 : 200,000

*** 홍길동 부장 월급 ***

기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,00원
세금 : 153,000원
월급 : 4,947,000원
*/