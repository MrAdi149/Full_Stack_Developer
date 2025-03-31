package Generalisation;

public class Hotel {
	
	Food Order(int choice){
		
		if(choice == 1) {
			Idly i = new Idly();
			return i;
		}else if(choice == 2) {
			Vada v = new Vada();
			return v;
		}else {
			Dosa d = new Dosa();
			return d;
		}
	}

}
