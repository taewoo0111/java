package test.main;
/*
 *  1. 산술 연산자 테스트
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		
		int sum = 10 + 1;
		int sum2 = num1 + num2;
		int sum3 = 10 + num2;
		
		int result1 = 5 / 3;
		int result2 = num1 / num2;
		
		double result3 = 5 / 3.0;
		
		// type casting(형 변환)
		
		int a = 10;
		byte b = (byte)a; // 그냥은 안 되는데 앞에 (byte)를 붙이면 범위 내에서는 가능 
		
	}
}
