package array;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto2 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int[] lotto = new int[6];
      int money;
      
      System.out.print("현금 입력 : ");
      money = scan.nextInt();
      
      for(int k=1; k<=money/1000; k++) {
         for(int i=0; i<lotto.length; i++) {
            lotto[i] = (int)(Math.random()*45 + 1);
            
            //중복체크
            for(int j=0; j<i; j++ ) {
               if(lotto[i] == lotto[j]) { 
                  i--;
                  break;
               }
            }//for j
            
         }//for i
         
         Arrays.sort(lotto); //정렬-오름차순
         
         for(int data : lotto) {
            System.out.print( String.format("%5d", data));
         }
         System.out.println();
         
         if(k%5==0) System.out.println();

      }//for k
   }

}

/*
[문제] 로또
- 돈을 입력받아서 난수가 자동으로 발생하는 프로그램

[실행결과]
현금 입력 : 7000
    2    4   19   39   43   44
   22   26   33   38   39   42
    5    6    8   25   35   45
    3   14   23   30   34   35
   18   20   25   27   32   37

    1   16   32   34   41   42
    5    6   18   30   33   44
 */
