package com.sam;

public class Mains {
	public static void execute(Calculator c) {
		c.add();
	}
public static void main(String args[]) {
	execute(new Calculator(){
		public void add() {
			System.out.println("added");
		});
		
	}
}
}
