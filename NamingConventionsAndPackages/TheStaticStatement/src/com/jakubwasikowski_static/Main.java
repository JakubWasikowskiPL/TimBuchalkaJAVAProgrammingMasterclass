package com.jakubwasikowski_static;

public class Main {
	public static int multipier=7;
    public static void main(String[] args) {
	StaticTest firstInstance=new StaticTest("1st Instance");
	System.out.println(firstInstance.getName()+" is instance number "+StaticTest.getNumInstances()); // method can be called by using Class name because it`s static and no instances have to be created to call a method

	StaticTest secondInstance=new StaticTest("2nd Instance");
	System.out.println(secondInstance.getName()+" is instance number "+secondInstance.getNumInstances());

	StaticTest thirdInstance=new StaticTest("3rd Instance");
	System.out.println(thirdInstance.getName()+" is instance number "+thirdInstance.getNumInstances());
	int answer=multiply(6);
		System.out.println("the answer is "+answer);
		System.out.println("Multiplier is "+multipier);

    }
	public static int multiply(int number){

		return number*multipier;
	}
}
