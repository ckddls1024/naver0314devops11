package day0318;

import java.util.Scanner;

public class Ex7_Munja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int gibon,familysu,totpay;
		String name;
		System.out.println("이름을 입력하세요!");
		name=sc.nextLine();
		System.out.println("기본급을 입력하세요!");
		gibon=sc.nextInt();
		System.out.println("가족수을 입력하세요!");
		familysu=sc.nextInt();
		
		if(familysu>=3)
		{
			totpay=gibon+(familysu*50000);
		}else {
			totpay=gibon+30000;
		}
		
			System.out.println("이름:" +name);
			System.out.println("기본금:" +gibon);
			System.out.println("가족수:" +familysu);
			System.out.println("실수령액:" +totpay);
			
		}
		
	}
	

