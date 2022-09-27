package for_;

import java.util.Scanner;

public class AddGame {

	   public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int a, b, dab, count;
	      String yn;
	      
	      while(true) {
	         count = 0;
	         for(int i=1; i<=5; i++) { //5문제
	            a = (int)(Math.random() * 90 + 10); //10 ~ 99
	            b = (int)(Math.random() * 90 + 10); //10 ~ 99
	            
	            for(int j=1; j<=2; j++) { //기회를 1번 더
	               System.out.print("[" + i + "] " + a + " + " + b + " = ");
	               dab = scan.nextInt();
	            
	               if(dab == a+b) {
	                  System.out.println("딩동뎅~~정답!!");
	                  count++;
	                  break; //for j를 벗어나라
	               }else
	                  if(j==1)
	                     System.out.println("틀렸다");
	                  else
	                     System.out.println("틀렸다 정답은 " + (a+b));
	            }//for j
	            
	            System.out.println();
	         }//for i
	         System.out.println("당신은 총 " + count + "문제 맞춰서 " + count*20 + "점입니다");
	         
	         System.out.println();
	         do {
	            System.out.print("또 할래 (Y/N) : ");
	            yn = scan.next();
	            
	         }while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));
	         
	         if(yn.equals("N") || yn.equals("n")) break; //while를 벗어나라
	         System.out.println();
	         
	      }//while
	      
	      System.out.println("프로그램을 종료합니다.");
	   }

	}
/*
[문제]덧셈  계산(for, while, 다중for)
10~99 사이의 난수를 2개 발생하여 합을 구하는 프로그램.
5문제를 제공한다.
1문제당 점수 20점씩 처리한다.
틀리면 1번더 기회를 주고, 2번 다 틀리면 답을 알려준다.

[실행결과]
a+b=user 변수명
[1] 25 + 36 = 입력값
답이틀리면-> 틀렷다 정답은 ??이다

[2] 10+25=35
딩동뎅

[5] 78 + 95 = 89
틀렸다 정답은 xx

당신은 총 ? 문제를 맞추어서 점수는 ?점입니다.
또 할래(Y/N) : n
프로그램을 종료합니다.
*/