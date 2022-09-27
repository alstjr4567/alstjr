package multi;

public class MultiArray03 {
	public static void main(String[] args) {
		String[] name = {"홍길동", "프로도", "죠르디"};
		int[][] jumsu = {{90, 95, 100, 0}, {100, 89, 75,0},{75,80,48,0}};
		double[]avg =new double[3];
		char[] grade = new char[3];
		avg[0]= jumsu[0][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<jumsu[i].length-1; j++ ) {
				jumsu[i][3] += jumsu[j][i]; //총점
			}//for i
		}//for j 
		
		int i =0;
		avg[i] = jumsu[i][3]/3.;
		
		if(avg[i] >= 80)grade[i] = 'B';
		else if(avg[i] >= 70)grade[i] = 'B';
		else if(avg[i] >= 60)grade[i] = 'B';
		else grade[i] = 'F';
		//출력
		for(int i=0;i<jumsu.length;i++) {
			System.out.println(name[i]+ " \t ");
			
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.println(jumsu[i][j]+"\t");
				System.out.println(avg[i]+"\t"+grade[i]);
			}//for j
			
			System.out.println(String.format("%.2f", avg[i])+"\t"+grade[i]);
			}//for i 
		System.out.println("----------------------");
	}
}
/*
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100
코난      100      89      75
또치      75      80      48
----------------------------------------------------
평균 90 이상 A
평균 80 이상 B
평균 70 이상 C
평균 60 이상 D
그밑으로 f
*/