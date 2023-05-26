package com.day2;

public class ThreadDemoUsingLambda {
	
	public static void main(String[] args) {
		
		Runnable target=()->/*new Runnable() {

			@Override
			public void run()*/ {
				// TODO Auto-generated method stub
				String threadName=Thread.currentThread().getName();

				for(int i=1;i<=10;i++) {
					System.out.println(threadName+" : "+i);
				}
			
			
		};
		Thread thread1=new Thread(target);
		Thread thread2=new Thread(target);
		thread1.setName("Rushikesh");
		thread2.setName("Jaynam");
		thread1.start();
		thread2.start();
	}

}
