 package com.jsp;

public class Thread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i>=10;i++) {
			System.out.println(i + "my thread");
		}
	}

	

	
}
