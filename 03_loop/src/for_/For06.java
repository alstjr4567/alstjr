package for_;

public class For06 {
	private void mian() {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) {
				sum = sum - i;
			}else {
				sum=sum + i;
				System.out.println("+"+ i);}
				
		}//for
			System.out.println("=" + sum);
		}
	}

/*
[문제] 결과화면과 똑같이 출력하시오 (for, if)

[실행결과]
-1+2-3+4-5+6-7+8-9+10 = 5

*/