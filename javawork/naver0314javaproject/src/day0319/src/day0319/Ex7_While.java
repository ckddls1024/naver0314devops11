package day0319;

import java.util.Scanner;

public class Ex7_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*다시연습
		 * while문을 이용하여 score점수을 입력받은후
		 * 0을 입력하면 while문을 빠져나가서 총 갯수와 합계를 구하시오
		 * (단, 1~100이 아닌값은 개쇼ㅜ와 합계에서 제외)
		 */
		Scanner sc=new Scanner(System.in);
		int score,count=0,sum=0;
		while(true)
		{
			System.out.println("점수는?");
			score=sc.nextInt();
			if(score==0)
			{
				break;
			}
			if(score<0 || score>100)
			{
				continue;
			}
			sum+=score;
			count++;
		}
		System.out.println("총 합계 : "+sum);
		System.out.println("입력한 점수 갯수 : "+count);
	}

}


