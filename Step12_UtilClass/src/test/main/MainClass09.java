package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass09 {
	public static void main(String[] args) {
		// 1. 3명의 회원정보(번호, 이름, 주소) 를 HashMap 객체에 생성해서 담기
		// HashMap 객체 하나당 한 명의 회원 정보를 담으니깐 총 3개의 HashMap 객체가 생성이 되어야 한다.
		Map<String, Object> info1 = new HashMap<>();
		Map<String, Object> info2 = new HashMap<>();
		Map<String, Object> info3 = new HashMap<>();
		
		info1.put("num", 1);
		info1.put("name", "김태우");
		info1.put("addr", "수내동");
		
		info2.put("num", 2);
		info2.put("name", "김구라");
		info2.put("addr", "노량진");
		
		info3.put("num", 3);
		info3.put("name", "원숭이");
		info3.put("addr", "동물원");
		
		
		// 2. 위에서 생성한 HashMap 객체를 담을 ArrayList 객체 생성
		List<Map<String, Object>> list = new ArrayList<>();
		
		// 3. 위의 객체에 HashMap 객체 3개를 담기
		list.add(info1);
		list.add(info2);
		list.add(info3);
		
		// 4. 반복문 돌면서 ArrayList 에 담긴 회원 정보를 콘솔창에 출력
		for(Map<String, Object> tmp : list) {
			String info =String.format("번호:%d 이름:%s 주소:%s", tmp.get("num"), tmp.get("name"), tmp.get("addr"));
			System.out.println(info);
		}
	}
}
