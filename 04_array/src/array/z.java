package array;

import java.util.Arrays;

public class z {

	public static void main(String[] args) {

		int a=10,b=20,temp;
		System.out.println(a+","+b);
//		a = b;
//		b = a;
		
		temp = b;
		b = a;
		a = temp;
		
		System.out.println(a+","+b);
		
		
		
		int[] arr = {8, 3, 5, 2, 9}; // 2 3 5 8 9 오름차순정렬: 갈수록 숫자가 커지는걸 정렬하는것
		int i,j;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
//		0:1 2 3 4
//		1:2 3 4
//		2:3 4
//		3:4
		// 8, 3, 5, 2, 9
		for(i=0;i<4;i++) { // 0
			for(j=i+1;j<5;j++) { // 1
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		
	}

}
