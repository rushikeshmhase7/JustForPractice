package com.day2;

class Demo implements DefaultStaticMethod{

	@Override
	public void getAbstMeth() {
		// TODO Auto-generated method stub
		System.out.println("This is Abstract Method");
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		d.getDefaultMethod();
		d.getAbstMeth();
		DefaultStaticMethod.getStaticMethod();
		
		
	}
	
}