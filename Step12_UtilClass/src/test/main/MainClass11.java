package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass11 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		// read only 로 사용할거라면 위의 세줄을 아래와 같이 한 줄로 작성할수도 있다.
		List<Integer> nums2 = List.of(10, 20, 30);
		// nums2.add(40); read only 라 추가는 불가능!!! (삭제, 수정 포함)
	}
}
