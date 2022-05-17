package com.demo;

class Addition{
	int a; 
	int b;
	void add() {
		int result=a+b;
		System.out.println(result);
	}
}

public class AddOfTwoNumbersWithReference {
 public static void main(String args[]) {
	Addition obj=new Addition();
	obj.a=111;
	obj.b=35;
	obj.add();
 }
}
