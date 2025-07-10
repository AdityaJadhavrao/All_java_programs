package interview_porgrams_practise_Generics;

public class Main {
public static void main(String[] args) {
		
		generic_class<Integer> obj = new generic_class<>(24);
		System.out.println(obj);
		obj.show(30);
		
		generic_class<String> obj1 = new generic_class<>("Aditya");
		System.out.println(obj1);
		obj1.show("Jadhavrao");
		
		generic_class1<String> obj2 = new generic_class1<>();
		obj2.set("Mobile iphone16 : price =");
		System.out.print(obj2.get()+" ");
		
		generic_class1<Integer> obj3 = new generic_class1<>();
		obj3.set(100000);
		System.out.println(obj3.get());
		
		String[] names = {"Aditya", "Jadhavrao", "Bhushan" , "Lande"};
		Integer age [] = {30,27};
		
		generic_class_methods.printArrays(names);
		generic_class_methods.printArrays(age);
		
		generic_class_bounded_type_parameter obj4 = new generic_class_bounded_type_parameter();
		obj4.setNumber(6);
		System.out.println(obj4.doubleValue());
	}

}
