package class_;

public class SungJukMain2 {

	public static void main(String[] args) {
		SungJuk[] ar = new SungJuk[3]; //객체 배열
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		
		ar[0].setData("홍길동", 90, 95, 100); //호출
		ar[1].setData("프로도", 100, 89, 75);
		ar[2].setData("죠르디", 75, 80, 48);
		
		for(int i=0; i<ar.length; i++) {
			ar[i].calc();
			System.out.println(ar[i].getName() + "\t"
							 + ar[i].getKor() + "\t"
							 + ar[i].getEng() + "\t"
							 + ar[i].getMath() + "\t"
							 + ar[i].getTot() + "\t"
							 + ar[i].getAvg() + "\t"
							 + ar[i].getGrade());
		}//for i
		System.out.println();
		
		for(SungJuk s : ar) {
			s.calc();
			System.out.println(s.getName() + "\t"
							 + s.getKor() + "\t"
							 + s.getEng() + "\t"
							 + s.getMath() + "\t"
							 + s.getTot() + "\t"
							 + s.getAvg() + "\t"
							 + s.getGrade());
		}
		
	}

}





