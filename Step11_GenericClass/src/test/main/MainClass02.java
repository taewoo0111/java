package test.main;

import test.mypac.Apple;
import test.mypac.Pair;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * key 값을 어떤 type 으로 설정할까
		 * value 값을 어떤 type 으로 설정할까
		 * 를 결정해서 2가지의 generic 클래스를 지정해야 한다.
		 */
		Pair<String, Integer> p1 = new Pair<>("one", 100);
		String k1 = p1.getkey();
		Integer v1 = p1.getvalue();
		
		Pair<String, Apple> p2 = new Pair<>("two", new Apple());
		String k2 = p2.getkey();
		Apple v2 = p2.getvalue();
	}
}
