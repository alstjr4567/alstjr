package while_;

public class Dowhile {

	public static void main(String[] args) {
		//A B C D E ~~ X Y Z
		//1줄에 7개씩 출력하시오.
		char ch = 'A';
		int count = 0;
		 do{
			System.out.println(ch+" ");
			ch++;
			
			count++;
			if(count%7 == 0)System.out.println();
			
		}while(ch <= 'Z');
	}
}
