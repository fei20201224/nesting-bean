package cheng;

public class Dog
{
	private String name;
	private int age;
	public Dog(String name)
	{
		
		System.out.println("Dog������,name="+name);
		this.name = name;
	}
	public void setAge(int age)
	{
		System.out.println("Set����,age="+age);
		this.age = age;
	}
	
}
