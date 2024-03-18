package day0318;

import java.util.Scanner;

public class Ex6_ScoreSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 학점구하기
		 */
		Scanner sc=new Scanner(System.in);
		int score;
		char grade;
		System.out.println("점수 입력");
		score=sc.nextInt();

		if(score<1 || score>100)
		{
			System.out.println("잘못된 점수입니다");
			return;
		}
		
		switch(score/10)
		{
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
			default:
				grade='F';
		}
		
		//if문으로 학점구하기
//		if(score>=90)
//			grade='A';
//		else if(score>=80)
//			grade='B';
//		else if(score>=70)
//			grade='C';
//		else if(score>=60)
//			grade='D';
//		else
//			grade='F';
//		
		System.out.println(score+"점은 "+grade+"학점입니다");
	}

}
