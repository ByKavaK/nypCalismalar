package hafta6;

import java.util.ArrayList;
import java.util.Collections;

public class Obje {

	public static void main(String[] args) {
		/*ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("Ahmet");
		arr.add(15);
		arr.add(6.5D);
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		arr.add(1, "Mehmet");
		Collections.shuffle(arr);
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}*/
		
		Person p1 = new Person("Ahmet", 20);
		Person p2 = new Person("Mehmet", 25);
		Person p3 = new Person("Ali", 30);
		
		ArrayList<Person> arr1 = new ArrayList<Person>();
		arr1.add(p1);
		arr1.add(p2);
		arr1.add(p3);
		
		//System.out.println(arr1.get(0).yas);
		//System.out.println(arr1.get(0).adi);
		
		for(int i = 0; i < arr1.size(); i++) {
			System.out.print(arr1.get(i).adi + " ");
			System.out.println(arr1.get(i).yas);
		}
		
	}

}
