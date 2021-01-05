package cheng;

public class Dog
{
	private String name;
	private int age;
	public Dog(String name)
	{
		
		System.out.println("Dog构造器,name="+name);
		this.name = name;
	}
	public void setAge(int age)
	{
		System.out.println("Set方法,age="+age);
		this.age = age;
	}
	
}
