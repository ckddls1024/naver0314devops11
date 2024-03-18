package day0318;

import java.util.Scanner;

public class Ex1_munja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if을 이용해서 학점구하기
		 */
		Scanner sc=new Scanner(System.in);
		int score;
		char grade;
		System.out.println("점수입력");
		score=sc.nextInt();
		
		if(score<1 || score>100)
		{
			System.out.println("잘못된 점수입니다");
			return;
		}else {
			grade=score>=90?'A':score>=80?'B':score>=70?'C':score>=60?'D':'F';
		}
		System.out.println(score+"점은 "+grade+"학점입니다");
	}

}
