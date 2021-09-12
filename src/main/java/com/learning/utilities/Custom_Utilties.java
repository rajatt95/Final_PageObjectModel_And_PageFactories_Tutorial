package com.learning.utilities;

public class Custom_Utilties {

	static public void holdScript(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
