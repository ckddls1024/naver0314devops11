package day0318;

public class Ex2_Ascicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char 는 내부적으로 int 타입으로 인식
		char a='A';
		char b=65;//아스키 코드로 65는 문자 'A'이다
		System.out.println(a+","+b);
		System.out.printf("a=%d,%c\n",(int)a,a);
		System.out.printf("b=%d,%c\n",(int)b,b);
		System.out.println(a+3);//68, char+int=int
		System.out.println((char)(a+3));//68->D
		
		char c='7';
		System.out.println(c);
		System.out.println(c+2);
		//숫자 7로 변경후 계산하고자 할경우
		int n1=c-'0';//55-48=7
		System.out.println(n1);//숫자 7이 출력
		System.out.println(n1+2);//7+2=9
	}

}
