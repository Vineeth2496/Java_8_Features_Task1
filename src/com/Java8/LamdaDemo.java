package com.Java8;

interface A
{
//	void show();
	void show(int i);	// if we have parameter method
}
//class Xyz implements A
//{
//	public void show()
//	{
//		System.out.println("Welcome to Normal Class Expression");
//	}
//	public void show(int i)
//	{
//		System.out.println("Welcome to Normal Class Expression " + i);
//	}
//}
public class LamdaDemo {

	public static void main(String[] args) 
	{
		A obj;
//		obj=new Xyz();
		
		
//		obj=new A() 	// Anonymous inner class
//		{
//			public void show() 
//			{
//				System.out.println("Welcome to Anonymous Class Expression");
//			}
//		};

//		obj=new A() 	// Anonymous inner class
//		{
//			public void show(int i) 
//			{
//				System.out.println("Welcome to Anonymous Class Expression "+ i);
//			}
//		};
		
//		obj=() ->		
//		{
//			System.out.println("Welcome to Lambda Expression ");
//			System.out.println("Hai Darling");
//		};
		
		// if we only one line then we don't need to write { } also.
		
//		obj=() -> System.out.println("Hello Gorgeous");
		
//		obj=(int i) -> System.out.println("Hello Beautiful : " + i);
//		obj.show(2);
//		// if we declared int in Interface  no need to declare int again
		// if we have single parameter like., (i) the no need to write () also
		obj=i -> System.out.println("Hai Darling : " + i);
		obj.show(9);
	}

}
