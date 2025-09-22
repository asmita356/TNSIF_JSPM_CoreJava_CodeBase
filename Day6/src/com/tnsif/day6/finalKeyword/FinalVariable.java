package com.tnsif.day6.finalKeyword;
/*the final keyword declared with variable, method and class indicates the "this cannot be modified
 * the vale of final variable cannot be changed
 * cannot be override
 * we cannot make a class immutable without making it final
 * constructor, block, cannot be inherited
 */

public class FinalVariable{
	//final must be always initialized
	final int x= 100;
	
	//declare a static blank final variable
	
    final static int y;
	
	final static int z=300;
	
	//instance method
	void change(){
		//y=200;
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", y=" + y +"]";
	}
	
	static {
		y= 200;
		System.out.println(y);
	}
	
//	static {
//		y= 400; cannot assign again as memory is allocated
//	}
	
}