package test.main;
/*
 * 2. 증감 연산자 테스
 */

public class MainClass02 {
	public static void main(String[] args) {
		int num = 0;
		num++;
		num++;
		num++; // num=3
		
		int num2 = 0;
		num2--;
		num2--;
		num2--; // num2=-3
		
		int num3 = 0;
		int result1 = num3++; // num3=1, result1=0
		
		int num4 = 0;
		int result2 = ++num4; // num4=1, result2=1
	}
}
