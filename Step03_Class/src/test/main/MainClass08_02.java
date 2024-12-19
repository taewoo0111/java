package test.main;

import test.mypac.MyUtil2;

public class MainClass08_02 {
	public static void main(String[] args) {
		MyUtil2 myinfo = new MyUtil2();
		myinfo.Age = 25;
		myinfo.Address = "수내동";
		myinfo.Height = 175;
		myinfo.Weight = 58;

		System.out.println(MyUtil2.My_Name);
		System.out.println(myinfo.Age);
		System.out.println(MyUtil2.Year);
		System.out.println(myinfo.Address);
		System.out.println(myinfo.Height);
		MyUtil2.gender();
		myinfo.job();
		
	}
}
