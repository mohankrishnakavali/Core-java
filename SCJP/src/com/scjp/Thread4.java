package com.scjp;

public class Thread4 {

	public static void main(String[] args) {
		new Thread4().go();
	}

	private void go() {
		Runnable rb=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("foo");
			}
		};
		
		Thread t=new Thread(rb);
		t.start();
		t.start();
	}

}
