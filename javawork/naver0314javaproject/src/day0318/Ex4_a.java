package day0318;

import java.util.Scanner;

public class Ex4_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 빨강, 초록, 분홍색 영어로 입력시 한글화
		 */
		Scanner sc=new Scanner(System.in);
		String color;
		System.out.println("영문으로 색상입력하세요");
		color=sc.nextLine();
		
		switch(color)
		{
		case "red":
			System.out.println("빨강색");
			break;
		case "green":
			System.out.println("초록색");
			break;
		case "pink":
			System.out.println("분홍색");
			break;
		default:
			System.out.println("빨강,초록,분홍 이외의색!");
		}
	}

}
