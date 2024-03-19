package day0319;

import java.util.Scanner;

public class Ex1_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1~100까지 소수 구해라
		 */
		Scanner sc=new Scanner(System.in);
		int sosu=0;

		//		for(int i=2;i<=100;i++)
		//		{
		//			for(int j=2;j<=i;j++)
		//			{
		//				if(i%j==0)
		//				{
		//					sosu++;
		//				}
		//			}
		//			if(sosu==1)
		//			{
		//				System.out.println(i+"");
		//				
		//			}
		//			sosu=0;
		//		}
		Loop:
			for(int i=2;i<=100;i++)
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
						continue Loop;
				}
				sosu++;
				System.out.printf("%3d",i);
				if(sosu%7==0)
				{
					System.out.println();
				}
			}
	}

}
