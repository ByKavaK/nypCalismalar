package besinciHafta;

import java.util.ArrayList;

public class ornek3 {

	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("red");
		items.add(0, "yellow");
		items.add("black");
		items.add("pink");
		
		System.out.println("Display list contents with counter-controlled loop:");
		
		for(int i = 0; i < items.size(); i++){
			System.out.println(items.get(i));
		}
	}

}
