package array;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lotto[] = new int [6];
		
		System.out.print("로또번호 입력 : ");
		int lo=sc.nextInt();
		// 번호 생성
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() 
					* 45) + 1;

			// 중복 번호 제거
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("로또 번호: ");

		// 번호 출력
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}
		Arrays.sort(lotto);
	}
}
/*
6개의 숫자가 1~45까지
중복되면 안됨.
\\\\


 */