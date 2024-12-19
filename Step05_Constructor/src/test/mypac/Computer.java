package test.mypac;

public class Computer {
	
	private Cpu c;
	private Memory m;
	private Ssd s;
	
	
	// 생성자
	public Computer(Cpu c, Memory m, Ssd s) {
		this.c = c;
		this.m = m;
		this.s = s;
	}
}
