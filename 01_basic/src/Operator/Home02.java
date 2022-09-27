package Operator;

public class Home02 {

	public static void main(String[] args) {
		      //char ch = 'T';
		//char ch = 'B';
		
	      char ch = 'e';
	            
	      int result = ch>='A' && ch<='Z' ?  ch+32 : ch-32;
	      System.out.println(ch + " → " + (char)result);   
		
	}
}
/*
 
[문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오

[실행결과]
T -> t		B -> b		e -> E
이런식 으로

//char ch = 'B';
char ch = 'e';

대소문자 사이 차이가 32차이가남
한번에 결과가 2개가 나오는게 아니다.

*/