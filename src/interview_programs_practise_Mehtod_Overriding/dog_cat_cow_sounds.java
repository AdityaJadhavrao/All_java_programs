package interview_programs_practise_Mehtod_Overriding;

public class dog_cat_cow_sounds {
	
	public static void main(String args[])
	{
		animal_sound obj = new animal_sound();
		animal_sound obj1 = new dog_sound();
		animal_sound obj2 = new cat_sound();
		animal_sound obj3 = new cow_sound();
		obj.makesound();
		obj1.makesound();
		obj2.makesound();
		obj3.makesound();
		
	}

}
