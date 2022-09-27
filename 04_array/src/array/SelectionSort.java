package array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {35, 48, 25, 72, 50};

		System.out.print("정렬 전 : ");
		for(int data : ar){
			System.out.print(data+"  ");
		}
		System.out.println();

		//Arrays.sort(ar);

		int temp;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i] > ar[j]) { 
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}//for j
		}//for i

		System.out.print("정렬 후 : ");
		for(int data : ar){
			System.out.print(data+"  ");
		}
		System.out.println();

	}

}
/*

 */