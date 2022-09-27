package array;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 크기 입력 : ");
		int size = sc.nextInt();
		
		int[] ar = new int[size];
		int sum = 0;
		for(int i=0;i<size;i++) {
		System.out.print("ar["+i+"] 입력 :");
		ar[i]=sc.nextInt();
		
		System.out.println();
		
		sum += ar[i];
		}
		System.out.println();
		
		
		int min;
		int max = min =ar[0]; //초기값
		for(int i=1;i<size; i++) {
			if(ar[i]>max)max = ar[i];
			if(ar[i]>min)min = ar[i];
		}
		for(int data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("합 = "+sum);
	}
}
/*
배열 크기 입력 : 3

ar[0] 입력 : 25
ar[1] 입력 : -50
ar[2] 입력 : 78

25 - 50 78
합 = ?
최대값 = ?

 */
