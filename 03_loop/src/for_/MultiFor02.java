package for_;

public class MultiFor02 {
	public static void main(String[] args) {
		int dan,i = 0;
		
		System.out.println("구구단 1-9단");
		
		for(dan=2;dan<=9;dan++) {
			for(i=1;i<=9;i++) {//안에서 다돌고 바깥쪽으로 감.
				System.out.println(dan+"*"+i+"= "+(dan*i));
			}
			System.out.println();
		}
	}
}
/*
2단~9단 구구단

2*1=2
2*2=4
.
.
2*9=18

3*1=3
3*2=4
.
.
3*9=18

*/