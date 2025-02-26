package JavaLibrary;

public class objectArrayTyoe {
	
	String name;
	int id;
	
	objectArrayTyoe(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return name + id;
	}
	
	public static void main(String[] args) {
		objectArrayTyoe obj1 = new objectArrayTyoe("Aditya", 305);
		objectArrayTyoe obj2 = new objectArrayTyoe("Singh",005);
		
		objectArrayTyoe[] o = new objectArrayTyoe[2];
		o[0] = obj1;
		o[1] = obj2;
		
		for(int i = 0; i<o.length; i++) {
			//System.out.println(o[i]); this will just give the addres of the object in toString format next line we will override tostring method
			System.out.println(o[i]);
		}
	}

}
