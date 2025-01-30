class Example{
	int x,y;
	Example(){
		this(10,20);
		System.out.println("default constructor");
	}
	Example(int a,int b){
		this.x = a;
		this.y = b;
		System.out.println("Custom Constructor");
	}
	public static void main(String[] args){
		Example e = new Example();
	}
}
		