package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		Drill d1 = new Drill() {
			
			@Override
			public void hole() {
				System.out.println("책상에 구멍을 뚫어요!");				
			}
		};
		
		useDrill(d1);
		
		// 인터페이스에 메소드가 1개일 때만 가능!!!!! () = hole()의 괄호랑 같다.
		Drill d2 = ()->{ 
			System.out.println("의자에 구멍을 뚫어요!");
		}; 
		
		useDrill(d2);
		
		useDrill(()->{
			System.out.println("몰라 아무데나 뚫어!!!");
		});
		
	}
	
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
	}
}