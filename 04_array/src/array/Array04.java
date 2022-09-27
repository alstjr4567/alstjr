package array;

import java.util.Scanner;

public class Array04 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      boolean[] ar = new boolean[5];
      int num;
      
      while(true) {
         System.out.println();
         System.out.println("   주차관리시스템");
         System.out.println("****************");
         System.out.println("   1. 입차");
         System.out.println("   2. 출차");
         System.out.println("   3. 리스트");
         System.out.println("   4. 종료");
         System.out.println("****************");
         System.out.print  ("    메뉴 : ");
         num = scan.nextInt();
         if(num == 4) break;
         if(num<1 || num>4) {
            System.out.println("1 ~ 4번까지만 입력하세요");
            continue;
         }
         
         if(num == 1) {
            System.out.print("위치 입력 : ");
            int position = scan.nextInt();
            
            if( ar[position-1] )
               System.out.println("이미 주차되어있습니다");
            else {
               ar[position-1] = true;
               System.out.println(position + "위치에 입차");
            }
            
         }else if(num == 2) {
            System.out.print("위치 입력 : ");
            int position = scan.nextInt();
            
            if(ar[position-1]) {
               ar[position-1] = false;
               System.out.println(position + "위치에 출차");
            }else
               System.out.println("주차되어 있지않습니다");
            
         }else if(num ==3) {
            for(int i=0; i<ar.length; i++) {
               System.out.println( (i+1)+"위치 : " + ar[i]);
            }//for
         }
      }//while
      
      System.out.println("프로그램을 종료합니다.");

   }

}
/*
불린형으로 방을 다섯개 만든다
출차는 f거짓 

주차장 관리 프로그램
**************
   1. 입차      input()
   2. 출차      output() 함수는 아직안배움 옆의 3개는 빼도됨
   3. 리스트      list()
   4. 종료
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false
*/