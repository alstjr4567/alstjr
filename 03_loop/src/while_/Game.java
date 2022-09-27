package while_;


import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com,user = 0,count = 0; //변수
		
		while(true) {
			com = (int)(Math.random()*100+1); //난수발생
			System.out.println(com); //난수

			System.out.println("1~100사이의 숫자를 맞추세요");
			
			while(true) {
				System.out.print("숫자입력 : ");
				user=sc.nextInt(); //입력값
				count++; //1 2 3 ..... count변수 1씩증가

				if(com > user)System.out.println(user+"보다 큰 숫자입니다."); //조건 com(난수)가 user(입력값)보다클때 실행
				else if(com < user)System.out.println(user+"보다 작은 숫자입니다.");//조건 com(난수)가 user(입력값)보다작을 실행
				else break; //멈춤

			}
			System.out.println();
			System.out.println("딩동뎅 "+count+"번 만에 맞추셧습니다.");
			
			System.out.print("\n 한번더 하시겠습니까(Y/N) : ");
			String yn = sc.next();
			
			if(yn.equals("N") || yn.equals("n"))break;// 문자열은 == 가아니라 .equals를 사용함.
		}//while

		System.out.println("프로그램 종료합니다.");
}
}
/*
[문제]숫자 맞추기 게임
컴퓨터가 1~100사이의 난수를 발생하면
발생한 난수를 맞추는 게임
몇번만에 맞추었는지 출력한다. 맞췄으면

[실행결과]
1~100사이의 숫자를 맞추세요(77)

숫자 입력 : 50(입력값) 
50보다 큰 숫자입니다.
숫자 입력 : 80
80보다 작은 숫자입니다.
.
.
.
숫자입력 77
딩동댕 n번 만에 맞추셧습니다.
*/