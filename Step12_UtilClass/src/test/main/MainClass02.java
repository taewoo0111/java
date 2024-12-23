package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		// 정수를 저장할 수 있는 ArrayList<Integer> 객체를 생성, 참조값을 지역변수 nums 에 담기
		ArrayList<Integer> nums = new ArrayList<>();
		// ArrayList 객체에 10, 20, 30 담기
		nums.add(10);
		nums.add(20);
		nums.add(30);
//		// ArrayList 객체에 저장된 숫자를 for 문을 이용해서 순서대로 출력
//		for (int i=0; i<nums.size(); i++) {
//			System.out.println(nums.get(i));
//		}
		System.out.println("--확장 for문 사용--");
		for (int num: nums) {
			System.out.println(num);
		}
	}
}
