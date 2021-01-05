package cheng;

public class Hunter
{
	private Dog dog;


	public void setDog(Dog dog)
	{
		this.dog = dog;
	}
	
	
	public void hunt() {
		System.out.println("猎人出去打猎，带着"+dog);
	}
}
