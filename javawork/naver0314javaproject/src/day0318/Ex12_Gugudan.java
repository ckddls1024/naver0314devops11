package day0318;

import java.util.Scanner;

public class Ex12_Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 구구단? 11
		 *   잘못된 숫자입니다
		 * 구구단? 5
		 *    **5단**
		 *   5 x 1 = 5		: 단일for문
		 *   5 x 2 = 10
		 *   .
		 *   .
		 *   .
		 *   5 x 9 = 45
		 */
		Scanner sc=new Scanner(System.in);
		int gugudan;
		System.out.println("구구단?");
		gugudan=sc.nextInt();
		if(gugudan<2 || gugudan>9)	
		{
			System.out.println("잘못된 숫자입니다");
			return;//메인함수 종료
		}
		System.out.println("** "+gugudan+"단 **\n");
			for(int i=1;i<=9;i++)
			{
				System.out.printf("%d x %d = %2d\n",gugudan,i,gugudan*i);
			}
		}

	}


