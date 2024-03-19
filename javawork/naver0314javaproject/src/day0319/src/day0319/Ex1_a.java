package day0319;

import java.util.Scanner;

public class Ex1_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1~100까지 소수 구해라
		 * 몇개인지 구하라
		 * 다중for문 이용해서
		 */
		Scanner sc=new Scanner(System.in);
		int num=0,sosu=0;
		Loop:
			for(int i=2;i<=100;i++)
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						continue Loop;
					}
				}
				sosu++;
				System.out.printf("%3d",i);
				if(sosu%7==0)
				{
					System.out.println();
				}
				num++;

			}
		System.out.println();
		System.out.println("소수의 갯수는 "+num+"개입니다!");
	}

}
