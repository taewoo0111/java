package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuizMain2 {
	public static void main(String[] args) {
		// 1. 로또 번호를 담을 HashSet 객체를 생성, set1 이라는 지역 변수에 담기
		Set<Integer> set1 = new HashSet<Integer>();
		// 2. while 문을 이용해서 랜덤한 로또 번호를 set1 에 반복적으로 담기
		// 		while 문 탈츨 조건은 set1.size() 가 6이 되면 탈출
		Random ran = new Random();
		while (set1.size()!=6) {
			int ranNum = ran.nextInt(45)+1;
			set1.add(ranNum);
		}
		// 3. set1 에 담긴 번호를 오름차순으로 정렬해서 콘솔창에 출력
		List<Integer> list1 = new ArrayList<Integer>(set1);
		Collections.sort(list1);
		list1.forEach((item)->{
			System.out.println(item);
		});
		// System.out.println(set1.size());
	}
}
