package interview_programs_practise_Mehtod_Overriding;

class animal_sound {
	
	public void makesound()
	{
		System.out.println("Animals making sound");
	}

}
class dog_sound extends animal_sound{
	
	public void makesound()
	{
		System.out.println("Dog barks");
	}
	
}
class cat_sound extends animal_sound{
	
	public void makesound()
	{
		System.out.println("Cat meow");
	}
	
}
class cow_sound extends animal_sound{
	
	public void makesound()
	{
		System.out.println("Cow moos");
	}	
	
}
