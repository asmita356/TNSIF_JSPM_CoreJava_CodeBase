package com.tnsif.day6.finalKeyword;
final class finalclass{
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

//class demo extends finalclass{
//	
//}

public class Main_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalclass f1 = new finalclass();
		f1.show();
		
		FinalMethod f2 = new FinalMethod();
		f2.show();
		
	}

}
