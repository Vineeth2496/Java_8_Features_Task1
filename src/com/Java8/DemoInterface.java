package com.Java8;

interface Phone
{
	void call();
	default void message()
	{
		System.out.println("Message sent");
	}
}
class AndroidMobile implements Phone
{
	public void call() {
		System.out.println("Android mobile calling");
	}
	
}
public class DemoInterface {

	public static void main(String[] args) 
	{
		Phone p=new AndroidMobile();
		p.call();
		p.message();
	}
}
