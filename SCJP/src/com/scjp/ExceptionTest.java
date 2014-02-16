package com.scjp;

public class ExceptionTest {
	void waitForSignal() throws IllegalMonitorStateException{
		Object obj=new Object();
		synchronized (Thread.currentThread()) {
			//obj.wait();
			obj.notify();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
