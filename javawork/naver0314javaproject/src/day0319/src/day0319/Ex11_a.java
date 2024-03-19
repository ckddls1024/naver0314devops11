package day0319;

import java.util.Scanner;

public class Ex11_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*다시연습
		 * 문제
		 * String타입의 문자열(msg)를 입력받아
		 * 그 문자열안에 대문자,소문자,숫자가 몇개가 포함되어있는지 출력하시오
		 * 예)
		 * Happy Day 123!!!
		 * 대문자 : 2개
		 * 소문자 : 6개
		 * 숫 자 : 3개
		 * 
		 * String의 charAt과 length를 사용하면 됨
		 */
		Scanner sc=new Scanner(System.in);
		String msg;
		int num=0,so=0,da=0;
		System.out.println("문자입력하시오!");
		msg=sc.nextLine();
		
		for(int i=0;i<msg.length();i++)
		{
			char ch=msg.charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				so++;
			}else if(ch>='A' && ch<='Z')
			{
				da++;
			}else if(ch>='0' && ch<='9')
			{
				num++;
			}
		}
		System.out.println("소문자 : "+so+"개");
		System.out.println("대문자 : "+da+"개");
		System.out.println("숫 자 : "+num+"개");
	}

}
