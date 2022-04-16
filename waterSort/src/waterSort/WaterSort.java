package waterSort;
import java.util.ArrayList;

public class WaterSort {
	
	ArrayList<Tube> level;
	
	public WaterSort(ArrayList<Tube> l) {
		level = l;
	}
	
	public void pour(int ini, int fin) {
		
		fin -= 1;
		ini -= 1;
		
		if(level.get(fin).tubeCheck() == -1) {
			System.out.println("invalid");
		}else if(level.get(fin).tubeCheck() == 3){
			level.get(fin).setColor4(level.get(ini).getColor1());
			level.get(ini).setColor1("empty");
		}
		
		
	}
	
	

	@Override
	public String toString() {
		
		String output =  "";
		
		for(int i = 0; i < level.size(); i++) {
			output += level.get(i) + "\t";
			
			if(i % 2 == 1) {
				output += "\n";
			}
			
		}
		
		return output;
	}

}
