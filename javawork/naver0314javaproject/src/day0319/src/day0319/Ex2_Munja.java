package day0319;

import java.util.Scanner;

public class Ex2_Munja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. 1!=1
		 * 3. 2!=2
		 * 4. 3!=6
		 * 5. 4!=24
		 * .
		 * .
		 * 10까지 출력
		 */
		Scanner sc=new Scanner(System.in);
		int fact=1;
		for(int i=1;i<=10;i++)
		{
			fact*=i;
			System.out.println(i+"!="+fact);
		}

	}

}
