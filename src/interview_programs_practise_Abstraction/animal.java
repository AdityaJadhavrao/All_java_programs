package interview_programs_practise_Abstraction;

abstract class animal {
	
	abstract void makesound();

}

class dog extends animal
{
	String sound;
	
	dog(String sound)
	{
		this.sound = sound;
	}
	void makesound()
	{
		System.out.println("Dog "+sound);
	}
}

class cat extends animal
{
	String sound;
	
	cat(String sound)
	{
		this.sound = sound;
	}
	void makesound()
	{
		System.out.println("Cat "+sound);
	}
}