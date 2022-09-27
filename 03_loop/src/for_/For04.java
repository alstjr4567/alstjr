package for_;

public class For04 {

	public static void main(String[] args) {
		char ch; 
		int count=0;
		
		for(int i=1;i<=100;i++) {//int i는1이다;i는100보다 작거나 같다;i는1씩증가한다.
		ch = (char)(Math.random()*26+65);// 65~90 ch는 char
		System.out.print(ch+" ");
		
		if(i%10 == 0)System.out.println();//i가 10의 배수 10으로나누면 나머지가 0이되야함
		
		if(ch =='A')count++;
		
		}//for
		System.out.println();
		System.out.println("A의 개수 = " + count);
		
	}
}
/*
-대문자(A~Z)를 100개 발생하여 출력하시오 //65~90사이의 난수를 100개나 찍어라
- 100개중에서 A가 몇개 나왔는지 개수를 출력
-1줄에 10개씩 출력

[실행결과]
H  D  D  R  A  Y  A  K  T  H
C  X  F  Z  B  S  L  Y  Q  D
H  K  O  H  O  B  Z  N  J  T
U  P  A  P  K  Q  G  W  F  A
S  U  D  Z  I  V  J  U  O  G
L  M  Z  L  H  U  Y  D  Q  R
F  T  I  Z  A  W  E  O  F  Z
A  Y  C  I  U  Z  O  B  C  G
H  G  Y  Z  V  P  I  R  L  G
Y  H  R  R  M  H  Y  S  B  P

A의 개수 = 6

*/