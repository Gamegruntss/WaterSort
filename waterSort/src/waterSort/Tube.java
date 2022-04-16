package waterSort;

import java.util.Arrays;

public class Tube {
	
	private String[] colors = new String[4];
	
	
	public Tube() {
		
		colors[0] = "empty";
		colors[1] = "empty";
		colors[2] = "empty";
		colors[3] = "empty";
		
	}
	
	
	public Tube(String c1, String c2, String c3, String c4) {
		colors[0] = c1;
		colors[1] = c2;
		colors[2] = c3;
		colors[3] = c4;
	}
	
	
	public int tubeCheck() {
		for(int i = 3; i >= 0; i--) {
			if(colors[i].equals("empty")) {
				return i;
			}
		}
		return -1;
	}


	public String getColor1() {
		return colors[0];
	}


	public void setColor1(String color1) {
		colors[0] = color1;
	}


	public String getColor2() {
		return colors[1];
	}


	public void setColor2(String color2) {
		colors[1] = color2;
	}


	public String getColor3() {
		return colors[2];
	}


	public void setColor3(String color3) {
		colors[2] = color3;
	}


	public String getColor4() {
		return colors[3];
	}


	public void setColor4(String color4) {
		colors[3] = color4;
	}


	@Override
	public String toString() {
		String output = "[";
		for(int i = 0; i < colors.length - 1; i++) {
			output += colors[i] + ", ";
		}
		
		
		return output + colors[colors.length - 1] + "]";
	}
	
	
	
	
	
}
