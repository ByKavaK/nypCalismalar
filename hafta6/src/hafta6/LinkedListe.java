package hafta6;

import java.util.LinkedList;

public class LinkedListe {

	public static void main(String[] args) {
		LinkedList<String> arr = new LinkedList<String>();
		arr.add("Mercedes");
		arr.add("Volvo");
		arr.add("BMW");
		arr.add(1, "Ford");
		System.out.println(arr.get(0).hashCode());
		System.out.print("Araç Markaları: ");
		for(String i : arr) {
			System.out.print( i + " ");
		}

	}

}
