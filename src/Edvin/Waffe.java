package Edvin;

public class Waffe {
	public Waff waffe(String name) {
		Waff w = null;
		switch(name) {
		case"MP7" : w = new Waff();break;
		case"Pistole" : w = new Waff();break;
		}
		return w;
	}
	public class Waff{
		 public String name;
		 public int x, y;
		 public int shotX, shotY;
	}
}
