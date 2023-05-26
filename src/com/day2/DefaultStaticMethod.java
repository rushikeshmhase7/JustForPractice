package com.day2;

public interface DefaultStaticMethod {
	
	default void getDefaultMethod() {
		System.out.println("This is Default Method");
	}
	
	
	void getAbstMeth();
	
	static void getStaticMethod() {
		System.out.println("This is Static Method");
	}

}

