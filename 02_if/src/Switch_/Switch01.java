package Switch_;

import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		int days = 0;
		
		switch(month) {
		case 1 : days=31;
			break;
		case 2 : days=28;
			break;
		case 3 : days=31;
			break;
		case 4 : days=31;
			break;
		case 5 : days=31;
			break;
		case 6 : days=31;
			break;
		case 7 : days=28;
			break;
		case 8 : days=28;
			break;
		case 9 : days=28;
			break;
		case 10 : days=28;
			break;
		case 11 : days=28;
			break;
		case 12 : days=28;
			break;
		}//switch
		
		
		/*
		if(month == 1) days=31;
		else if(month == 2) days = 28;
		else if(month == 3) days = 31;
		else if(month == 4) days = 30;
		else if(month == 5) days = 31;
		else if(month == 6) days = 30;
		else if(month == 7) days = 31;
		else if(month == 8) days = 31;
		else if(month == 9) days = 30;
		else if(month == 10) days = 31;
		else if(month == 11) days = 30;		
		else if(month == 12) days = 31;
		else days=0;
		*/
		
		
		System.out.println(month+"월은 "+days+"일 입니다.");
		
	}
}
/*


*/