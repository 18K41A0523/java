package com.sam;

public interface Task1 {
	public void showApp();
	public default void showData() {
		System.out.println("default");
	}

}
