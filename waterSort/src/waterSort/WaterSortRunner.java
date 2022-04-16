package waterSort;

import java.util.*;

public class WaterSortRunner {
	
	public static void main(String[] args) {
		
		String r = "red";
		String b = "blue";
		String y = "yellow";
		String g = "green";
		
		
		Tube tube1 = new Tube(r,b,g,y);
		Tube tube2 = new Tube(b,g,r,y);
		Tube tube3 = new Tube(y,g,r,b);
		Tube tube4 = new Tube(b,y,g,r);
		Tube tube5 = new Tube();
		
		
		ArrayList<Tube> tubes = new ArrayList();
		
		tubes.add(tube1);
		tubes.add(tube2);
		tubes.add(tube3);
		tubes.add(tube4);
		tubes.add(tube5);
		
		WaterSort game1 = new WaterSort(tubes);
		
		System.out.println(game1);
		
		game1.pour(1,5);
		
		System.out.println("\n" + game1);
	}

}
